import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReverseString {
    public static String solution(String str) {
        String rts="";
          for(int i=str.length()-1;i>=0;i--){
              rts+=str.charAt(i);
          }
        return rts;
    }
    @Test
    public void test(){
        assertEquals("dlrow", ReverseString.solution("world"));
    }
}
