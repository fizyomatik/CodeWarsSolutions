import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String a="";
        a=arr[2];
        arr[2]=arr[0];
        arr[0]=a;
        return arr;
    }
    @Test
    public void Test(){
        assertEquals(new String[]{"head","body","tail"},WrongEndHead.fixTheMeerkat(new String[]{"tail","body","head"}));
    }
}
