import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class MorseTest {

    TranslateMorse translator = new TranslateMorse();

    @Test
    public void testEngAtoMorseA() {

        assertEquals(".-",translator.engToMorse("A"));
    }

    @Test
    public void testEngAtoMorseQmark() {

        assertEquals("..--..",translator.engToMorse("?"));
    }

    @Test
    public void testEngAtoMorseB() {

        assertEquals("-...",translator.engToMorse("B"));
    }

    @Test
    public void testMorsetoEngA() {

        assertEquals("A",translator.morseToEng(".-"));
    }

    @Test
    public void testMorsetoEngB() {

        assertEquals("B",translator.morseToEng("-..."));
    }

    @Test
    public void testEngAtoMorseInvalidcharsError() {

        assertEquals("errorM",translator.engToMorse("Ö"));
    }

    @Test
    public void testMorsetoEngInvalidcharsError() {

        assertEquals("errorE",translator.morseToEng("25"));
    }

    @Test
    public void testMorsetoEngWord() {
        assertEquals("HI",translator.morseToEng(".... .."));
    }
}