import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SumOfByte {
    public static byte sum (byte a, byte b) {
        byte c = (byte)(a + b);
        return c;
    }

    @Test
    public void Test(){
        byte a=2;
        byte b=1;
        assertEquals(3,SumOfByte.sum(a,b));
    }
}
