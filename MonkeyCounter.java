import org.junit.Test;
import  org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n){
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        return arr;
    }

    @Test
     public void testMonkey(){
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8},MonkeyCounter.monkeyCount(8));
     }
}

