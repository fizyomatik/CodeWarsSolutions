import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;
public class CalculateAverage {
    public static double find_average(int[] array){
        double sum=0.0;
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length;i++){
            sum+=(double)array[i];
        }
        return sum/array.length;
    }
    @Test
    public void test(){
        assertEquals(3.0, CalculateAverage.find_average(new int []{1,2,3,6}));
    }
}
