import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class Debugging1 {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;

    @Test
    public void correctValue() {
        assertEquals("codewa.rs", Debugging1.name);
    }
}
