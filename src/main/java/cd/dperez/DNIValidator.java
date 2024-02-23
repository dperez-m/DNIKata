package cd.dperez;

public class DNIValidator {

    private static final DniLetterDictionary DNI_CORRESPONDING_LETTER = new DniLetterDictionary();
    private static final int DNI_DIVISOR_NUM = 23;
    private static final int DNI_NUMBER_LENGTH = 8;
    private boolean isValid = false;
    private String dniNumber = "";

    public DNIValidator(String dniNumber) {
        if (checkNumberLength(dniNumber) && isNumeric(dniNumber)) {
            this.dniNumber = dniNumber;
            isValid = true;
        } else {
            System.out.println("Invalid DNI number.");
            this.dniNumber = null;
        }
    }
    public DNIValidator() {
        dniNumber = "";
    }

    private boolean checkNumberLength(String num){
        return num.length() == DNI_NUMBER_LENGTH;
    }

    private boolean isNumeric(String num){
        try {
            Double.parseDouble(num);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    private int getAlgorithmNum(){
        return Integer.parseInt(dniNumber) % DNI_DIVISOR_NUM;
    }

    public boolean isValid(){
        return isValid;
    }
    
    public char getLetter(){
        int dniAlgorithmNum = getAlgorithmNum();
        return DNI_CORRESPONDING_LETTER.getLetter(dniAlgorithmNum);
    }
}
