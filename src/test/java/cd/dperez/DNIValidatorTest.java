package cd.dperez;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNIValidatorTest {

    DNIValidator dniValidator = null;

    @Test
    public void validDNINumberTest(){
        dniValidator = new DNIValidator("54429671");
        assertEquals('X', dniValidator.getLetter());
    }

}
