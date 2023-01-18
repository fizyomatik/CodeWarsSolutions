import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertArrayEquals;

public class CountPositiveSumNegative {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int count=0,sum=0;
        for(int i=0;i<input.length;i++){
            if(input[i]<0){
                sum+=input[i];
            }else if(input[i]>0){
                count++;
            }
        }
        return new int[]{count,sum};
    }
    @Test
    public void Test1(){
        assertArrayEquals(new int[]{8,-55},CountPositiveSumNegative.countPositivesSumNegatives(new int[]{2,3,0,4,5,6,7,88,8,0,-10,-12,-15,-14,-4}));
    }
}
