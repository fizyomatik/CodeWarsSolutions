import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class MakeUpperCasee {

    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
    @Test
    public void testSomething() {

        assertEquals("HELLO",MakeUpperCasee.MakeUpperCase("hello"));

    }
}
