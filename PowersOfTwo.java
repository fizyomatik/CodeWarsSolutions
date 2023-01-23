import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertArrayEquals;
public class PowersOfTwo {
    public static long[] powersOfTwo(int n){
        int k=0;
        long [] arr=new long[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=(long)Math.pow(2,k);
            k++;
        }
        return arr;
    }
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, PowersOfTwo.powersOfTwo(0));
        assertArrayEquals(new long[]{1,2}, PowersOfTwo.powersOfTwo(1));
        assertArrayEquals(new long[]{1,2,4,8,16}, PowersOfTwo.powersOfTwo(4));
    }
}
