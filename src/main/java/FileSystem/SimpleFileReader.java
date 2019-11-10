package FileSystem;

import Model.AnomalyType;
import Model.Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SimpleFileReader extends java.io.FileReader {


    public SimpleFileReader(InputFile file) throws FileNotFoundException {
        super(file.getPathToFile());
    }

    /***
     *return not a lot of example that can be stored in program memory
     * @param file - only txt file
     * @return all examples from this file
     */
    public static List<Example> readFile(InputFile file) {
        List<Example> examples = new ArrayList<>();
        if (getFileExtension(file.getPathToFile()).equals("txt")) {
            try {
                BufferedReader fileStream = new BufferedReader(new SimpleFileReader(file));
                fileStream.readLine();
                String nextLineInFile = fileStream.readLine();
                ;
                try {
                    while (nextLineInFile != null) {
                        examples.add(constructExampleFromStringTxt(nextLineInFile));
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
        return examples;
    }


    /***
     * function for parsing string according to the pattern
     * time    id    typeOfAnomaly   sub     chan    num
     * @param line - one line from txt file
     * @return new example with values from txt file
     */
    private static Example constructExampleFromStringTxt(String line) {
        String[] informationAboutExample = line.replaceAll("  ", " ").split(" ");
        //time mm:ss.SSS
        System.out.println(informationAboutExample);
        String[] time = informationAboutExample[0].trim().split(":");
        int minute = Integer.parseInt(time[0]);
        int second = Integer.parseInt(time[1].split(".")[0]);
        int millisecond = Integer.parseInt(time[1].split(".")[1]);
        int millisecondSum = minute * 60000 + second * 1000 + millisecond;
        // get all information from string in correctWay
        int previousId = Integer.parseInt(informationAboutExample[1]);
        String typeOfAnomaly = informationAboutExample[2];
        int anomalyTime = AnomalyType.getTypeId(typeOfAnomaly);
        int sub = Integer.parseInt(informationAboutExample[3]);
        int chan = Integer.parseInt(informationAboutExample[4]);
        int num = Integer.parseInt(informationAboutExample[4]);
        return new Example(millisecondSum, anomalyTime, sub, chan, num, previousId);
    }

    /***
     * function for parsing string according to the pattern
     * id   first_val=mlii second_val =v5
     * @param line -one line from csv file
     * @return new example with values from cvn file
     */
    public static Example constructExampleFromStringCsv(String line) {
        String[] informationAboutExample = line.split(",");
        int previousId = Integer.parseInt(informationAboutExample[0]);
        int mlii = Integer.parseInt(informationAboutExample[1]);
        int v5 = Integer.parseInt(informationAboutExample[2]);
        return new Example(previousId, mlii, v5);
    }


    public static String getFileExtension(String fullName) {
        String fileName = new File(fullName).getName();
        int dotIndex = fileName.lastIndexOf('.');
        return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
    }
}