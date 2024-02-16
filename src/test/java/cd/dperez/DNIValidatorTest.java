package cd.dperez;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DNIValidatorTest {

    DNIValidator dniValidator = null;

    @Test
    public void validDNINumberTest(){
        dniValidator = new DNIValidator("54429671");
        assertEquals('X', dniValidator.getLetter());
    }

    @Test
    public void invalidDNINumberTest(){
        dniValidator = new DNIValidator("1234567");
        assertFalse(dniValidator.isValid());
        dniValidator = new DNIValidator("1234g678");
        assertFalse(dniValidator.isValid());
    }

}
