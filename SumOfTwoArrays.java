import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

import java.sql.Array;

public class SumOfTwoArrays {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int a=arr1.length;
        int b=arr2.length;
        int sum=0;


        for(int i=0;i<a;i++){
            sum+=arr1[i];
        }

        for(int j=0;j<b;j++){
            sum+=arr2[j];


        }
        return sum;
    }

    @Test
    public void test(){
        assertEquals(33,SumOfTwoArrays.arrayPlusArray(new int []{2,3,5},new int []{4,9,10} ));
    }
}
