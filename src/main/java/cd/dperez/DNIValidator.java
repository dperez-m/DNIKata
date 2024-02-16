package cd.dperez;

public class DNIValidator {

    private final DniLetterDictionary DNI_CORRESPONDING_LETTER = new DniLetterDictionary();
    private final int DNI_DIVISOR_NUM = 23;
    private String dniNumber = "";
    private int dniAlgorithmNum = 0;

    public DNIValidator(String dniNumber) {
        this.dniNumber = dniNumber;
    }

    public DNIValidator() {
        dniNumber = "";
    }

    public char getLetter(){
        dniAlgorithmNum = getAlgorithmNum();
        return DNI_CORRESPONDING_LETTER.getLetter(dniAlgorithmNum);
    }

    private int getAlgorithmNum(){
        return Integer.parseInt(dniNumber) % DNI_DIVISOR_NUM;
    }
}
