package Services;

import FileSystem.FileType;
import FileSystem.InputFile;
import FileSystem.SimpleFileReader;
import Model.Anomaly;
import Model.Example;
import Model.Result;
import Utils.Alphabet;
import Utils.LinguisticChainBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinguisticChainService {

    public static final int CHAR_IN_ANOMALY = 20;
    private ExampleService exampleService = new ExampleService();
    private ResultService resultService = new ResultService();
    private AnomalyService anomalyService = new AnomalyService();
    private boolean isAnomalyNow = false;

    public void getExamplesFromFile(String fileCSVPath, String fileTxtPath) {

        InputFile inputCsv = SimpleFileReader.getFileExtension(fileCSVPath).equals("csv") ? new InputFile(FileType.EXAMPLE_CSV, fileCSVPath) : null;
        InputFile inputTxt = SimpleFileReader.getFileExtension(fileTxtPath).equals("txt") ? new InputFile(FileType.STATISTIC_TXT, fileTxtPath) : null;
        List<Example> examplesTxt = SimpleFileReader.readFile(inputTxt);
        //save here last 10 examples and when we find anomaly save 10 after anomaly and save them into bd
        List<Example> examplesForAnomaly = new ArrayList<>();


        Result result = new Result("", 0);
        int resultId = resultService.saveResult(result);
        result.setId(resultId);

        try {
            BufferedReader fileStream = new BufferedReader(new SimpleFileReader(inputCsv));
            fileStream.readLine();
            String nextLineInFile = fileStream.readLine();

            try {
                while (nextLineInFile != null) {
                    Example currExample = saveActionForExample(nextLineInFile, result, examplesTxt);
                    checkAnomaly(currExample, examplesForAnomaly, result);
                    nextLineInFile = fileStream.readLine();
                }
                fileStream.close();

            } catch (FileNotFoundException e) {
                System.out.println("No file was read");
            } catch (IOException e) {
                System.out.println("There was a problem reading the file");
            }
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }

    /***
     * provide searching in list from txt file example with similar id
     * also set all params from this txt file
     * @param examples - list of all examples from txt file
     * @param example - current example
     */
    private void getSimilarExampleByPrevId(List<Example> examples, Example example) {
        Example exampleFromTxt = null;
        System.out.println(examples.size());
        for (Example e : examples
        ) {
            if (e.getPrevious_id() == example.getPrevious_id())
                exampleFromTxt = e;
        }


        if (exampleFromTxt != null) {
            example.setChan(exampleFromTxt.getChan());
            example.setNum(exampleFromTxt.getNum());
            example.setSub(exampleFromTxt.getSub());
            example.setTimeOfExample(exampleFromTxt.getTimeOfExample());
            example.setType(exampleFromTxt.getType());
        } else {
            example.setChan(0);
            example.setNum(0);
            example.setSub(0);
            example.setTimeOfExample(0);
            example.setType(0);
        }
    }

    private Example saveActionForExample(String nextLineInFile, Result result, List<Example> examplesTxt) {
        Example currExample = SimpleFileReader.constructExampleFromStringCsv(nextLineInFile);
        getSimilarExampleByPrevId(examplesTxt, currExample);
        currExample.setResult(result);
        currExample.setLetter(LinguisticChainBuilder.getLetter(currExample.getMlii(), Alphabet.LATIN));
        result.setResultString(result.getResultString() + currExample.getLetter());
        exampleService.saveExample(currExample);
        resultService.updateResult(result);
        return currExample;
    }

    private void checkAnomaly(Example currExample, List<Example> examplesForAnomaly, Result result) {
        if (currExample.getType() > 2) {
            isAnomalyNow = true;
            examplesForAnomaly.add(currExample);
            result.setAnomaly(result.getAnomaly() + 1);
            resultService.updateResult(result);
        } else {
            if (!isAnomalyNow) {
                if (examplesForAnomaly.size() >= CHAR_IN_ANOMALY / 2) {
                    examplesForAnomaly.remove(0);
                    examplesForAnomaly.add(currExample);
                } else examplesForAnomaly.add(currExample);
            } else {
                if (examplesForAnomaly.size() >= CHAR_IN_ANOMALY - 1) {
                    examplesForAnomaly.add(currExample);
                    StringBuilder anomaly = new StringBuilder();
                    for (Example e : examplesForAnomaly
                    ) {
                        anomaly.append(e.getLetter());
                    }
                    anomalyService.saveAnomaly(new Anomaly(anomaly.toString()));
                    isAnomalyNow = false;
                } else examplesForAnomaly.add(currExample);
            }
        }
    }


}


