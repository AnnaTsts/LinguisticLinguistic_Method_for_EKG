package Utils;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class LinguisticChainBuilder {

    public static final int MIN_CARDIO_VALUE = 600;
    public static final int MAX_CARDIO_VALUE = 1500;


    /**
     * @param  currentList - list that should be transformed
     * @param  alphabet    - alphabet that used to transformation
     * @return - letters that match first list
     * */
    public static StringBuilder getLinguisticChain(ArrayList<Double> currentList, Alphabet alphabet) {
        double delta = (MAX_CARDIO_VALUE - MIN_CARDIO_VALUE) / alphabet.numberOfLetters();
        StringBuilder linguisticChain = new StringBuilder();
        for (int i = 0; i < currentList.size(); i++) {
            int numberOfLetter = (int) Math.floor((currentList.get(i)- MIN_CARDIO_VALUE) / delta);
            linguisticChain.append(alphabet.getLetters()[numberOfLetter]);
        }
        return linguisticChain;
    }

    public static char getLetter(int value, Alphabet alphabet ){
        double delta = (double) (MAX_CARDIO_VALUE - MIN_CARDIO_VALUE) / alphabet.numberOfLetters();
        int numberOfLetter = (int) Math.floor((value- MIN_CARDIO_VALUE )/ delta);
        return alphabet.getLetters()[numberOfLetter];
    }
}
