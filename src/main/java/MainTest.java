import Services.ExampleService;
import Services.LinguisticChainService;

import java.io.FileNotFoundException;

public class MainTest {

    public static void main(String[] args) throws FileNotFoundException {
        ExampleService exampleService = new ExampleService();
        LinguisticChainService linguisticChainService = new LinguisticChainService();

        //exampleService.saveExamples( linguisticChainService.getExamplesFromFile("/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/100.csv","/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/100annotations.txt"));
         linguisticChainService.getExamplesFromFiles("/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/100.csv","/Users/annatsytsyluik/Documents/КПИ/Диплом/mitbih-database/100annotations.txt");
    }



}


