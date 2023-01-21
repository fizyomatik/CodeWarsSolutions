import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class VowelRemover {
    public static String shortcut(String input) {
        input = input.replaceAll("[aeiou]", "");
        return input;
    }
    @Test
    void test1() {
        assertEquals("hll", VowelRemover.shortcut("hello"));
        assertEquals("hw r y tdy?", VowelRemover.shortcut("how are you today?"));
        assertEquals("cmpln", VowelRemover.shortcut("complain"));
        assertEquals("nvr", VowelRemover.shortcut("never"));
    }
}
