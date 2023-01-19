import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

public class BinToDecimal {
    public static int binDec(String inp){
      int dec=Integer.parseInt(inp,2);
      return dec;
    }
    @Test
    public void Test1(){
        assertEquals(16,BinToDecimal.binDec("10000"));
    }
}
