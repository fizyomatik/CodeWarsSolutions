import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NumberToString {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }
    @Test
    public void tests() {
        assertEquals("67", NumberToString.numberToString(67));
        assertEquals("123", NumberToString.numberToString(123));
        assertEquals("999", NumberToString.numberToString(999));
    }
}
