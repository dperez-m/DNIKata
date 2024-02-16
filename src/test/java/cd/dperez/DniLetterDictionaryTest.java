package cd.dperez;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniLetterDictionaryTest {

    DniLetterDictionary dictionary = new DniLetterDictionary();

    @Test
    public void getLetterTest(){
        assertEquals('P', dictionary.getLetter(8));
        assertEquals('Z', dictionary.getLetter(14));
        assertEquals('T', dictionary.getLetter(0));
        assertEquals('E', dictionary.getLetter(22));
    }
}
