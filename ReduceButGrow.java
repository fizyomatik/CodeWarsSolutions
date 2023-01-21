import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
public class ReduceButGrow {
    public static int grow(int[] x){
        int sum=1;
        for(int i: x){
            sum*=i;
        }
        return sum;

    }
  @Test
    public void test(){
        assertEquals(16, ReduceButGrow.grow(new int[]{1,2,4,2,1}));
  }
}
