package cd.dperez;

import java.util.HashMap;

public class DniLetterDictionary {
    private HashMap<Integer, Character> numberToLetterConverter = new HashMap<Integer, Character>();

    public DniLetterDictionary(){
        numberToLetterConverter.put(0, 'T');
        numberToLetterConverter.put(1, 'R');
        numberToLetterConverter.put(2, 'W');
        numberToLetterConverter.put(3, 'A');
        numberToLetterConverter.put(4, 'G');
        numberToLetterConverter.put(5, 'M');
        numberToLetterConverter.put(6, 'Y');
        numberToLetterConverter.put(7, 'F');
        numberToLetterConverter.put(8, 'P');
        numberToLetterConverter.put(9, 'D');
        numberToLetterConverter.put(10, 'X');
        numberToLetterConverter.put(11, 'B');
        numberToLetterConverter.put(12, 'N');
        numberToLetterConverter.put(13, 'J');
        numberToLetterConverter.put(14, 'Z');
        numberToLetterConverter.put(15, 'S');
        numberToLetterConverter.put(16, 'Q');
        numberToLetterConverter.put(17, 'V');
        numberToLetterConverter.put(18, 'H');
        numberToLetterConverter.put(19, 'L');
        numberToLetterConverter.put(20, 'C');
        numberToLetterConverter.put(21, 'K');
        numberToLetterConverter.put(22, 'E');
    }

    public char getLetter(int num){
        return numberToLetterConverter.get(num);
    }
}
