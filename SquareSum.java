import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class SquareSum {

    public static int squareSum(int[] n)
    {
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i]*n[i];
        }
        return sum;
    }
    @Test
    public void sumTest(){
        assertEquals(9,SquareSum.squareSum(new int[]{1,2,2}));

    }
}
