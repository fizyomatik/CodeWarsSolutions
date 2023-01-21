import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {

        return s.replaceAll("[!]","");
    }
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
    }
}
