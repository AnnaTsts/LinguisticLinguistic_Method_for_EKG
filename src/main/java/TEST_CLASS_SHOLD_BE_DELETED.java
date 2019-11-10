import FileSystem.FileType;
import FileSystem.InputFile;
import FileSystem.SimpleFileReader;
import Services.ExampleService;
import Services.LinguisticChainService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TEST_CLASS_SHOLD_BE_DELETED {
    public void Test() {
        int minMlii = Integer.MAX_VALUE;
        int maxMlii = 0;
        int sumMlii = 0;
        int minv5 = Integer.MAX_VALUE;
        int maxv5 = 0;
        int sumV5 = 0;
        String filePath = "";
        int counter = 0;

        //System.out.println( SimpleFileReader.readFile(new InputFile(FileType.EXAMPLE_CSV,"/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/100.csv")));
        ExampleService exampleService = new ExampleService();
        LinguisticChainService linguisticChainService = new LinguisticChainService();
        List<InputFile> inputFiles = new ArrayList<>();

        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/105.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/106.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/107.csv"));
        //inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/108.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/109.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/111.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/112.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/113.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/114.csv"));
        //inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/115.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/116.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/117.csv"));
        //inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/118.csv"));
        //inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/119.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/121.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/122.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/123.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/124.csv"));
        //inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/200.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/201.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/202.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/203.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/205.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/232.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/207.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/208.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/209.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/210.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/233.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/212.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/213.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/214.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/215.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/231.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/217.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/228.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/219.csv"));
        inputFiles.add(new InputFile(FileType.EXAMPLE_CSV, "/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/220.csv"));


        for (InputFile file : inputFiles
        ) {


            try {
                BufferedReader fileStream = new BufferedReader(new SimpleFileReader(file));
                fileStream.readLine();
                String nextLineInFile = fileStream.readLine();

                try {
                    while (nextLineInFile != null) {

                        String[] informationAboutExample = nextLineInFile.split(",");
                        int previousId = Integer.parseInt(informationAboutExample[0]);
                        int mlii = Integer.parseInt(informationAboutExample[1]);
                        int v5 = Integer.parseInt(informationAboutExample[2]);
                        if (mlii > 0 && v5 > 0) {
                            sumMlii += mlii;
                            sumV5 += v5;
                            counter += 1;
                        }
                        if (mlii > maxMlii) maxMlii = mlii;
                        if (mlii < minMlii && mlii > 0) minMlii = mlii;
                        if (v5 > maxv5) maxv5 = mlii;
                        if (v5 < minv5 && v5 > 0) {
                            minv5 = v5;
                            filePath = file.getPathToFile();
                        }

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

        System.out.println("Mlii " + minMlii + " - " + maxMlii);
        System.out.println("v5 " + minv5 + " - " + maxv5);
        System.out.println(filePath);
        System.out.println(sumMlii / (double) counter);
        System.out.println(sumV5 / (double) counter);
        System.out.println(counter);
    }
}