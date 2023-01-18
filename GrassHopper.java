import static org.junit.Assert.*;
import org.junit.Test;
public class GrassHopper {

    public static int findAverage(int[] nums) {
        int sum=0;
        int count=nums.length;
        int mean=0;
        for(int i=0;i<count;i++){
            sum+=nums[i];
            mean=sum/count;
        }

        return mean;
    }
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper.findAverage(new int[]{1}));
    }
    @Test
    public void test2() {
        assertEquals(4,
                GrassHopper.findAverage(new int[]{1,3,5,7}));
    }
}
