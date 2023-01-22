import static org.junit.Assert.*;

import org.junit.Test;
public class SentenceSmash {
    public static String smash(String... words) {
        return String.format("%s", String.join(" ", words));
    }
    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SentenceSmash.smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SentenceSmash.smash(new String[] {}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SentenceSmash.smash(new String[] {"Bilal"}));
    }
}
