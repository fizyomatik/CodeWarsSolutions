import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ConvertBooleanToString {
    public static String convert(boolean b){
        if(b==true) {
            return "true";
        } else {
            return "false";
        }
    }
    @Test public void testTrue(){
        assertEquals(ConvertBooleanToString.convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(ConvertBooleanToString.convert(false), "false");
    }
}
