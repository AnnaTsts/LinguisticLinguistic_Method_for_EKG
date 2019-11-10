package Utils;

/**
 * used for storing alphabets in the system and all alphabets can easy add here
 * */
public enum Alphabet {
    CYRILLIC ("абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray()),
    LATIN ("abcdefghijklmnopqrstuvwxyz".toCharArray());

    private final int numberOfLetters;
    private final char[] letters;

    Alphabet(char[] letters) {
        this.numberOfLetters = letters.length;
        this.letters = letters;
    }

    public int numberOfLetters() {
        return numberOfLetters;
    }

    public char[] getLetters(){
        return letters;
    }

}
