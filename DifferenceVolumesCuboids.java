import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class DifferenceVolumesCuboids {

    public static int findDifference(final int[] f, final int[] s) {
//        In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find the difference of the cuboids' volumes regardless of which is bigger.
//
//        For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20. Therefore, the function should return 8.
//
//        Your function will be tested with pre-made examples as well as random ones.
//
//        If you can, try writing it in one line of code.

        int a=f[0]*f[1]*f[2];
        int b=s[0]*s[1]*s[2];

        return a>b ? a-b : b-a;
    }

    @Test
    public void sampleTestCases() {
        assertEquals(14, DifferenceVolumesCuboids.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        assertEquals(106, DifferenceVolumesCuboids.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        assertEquals(30, DifferenceVolumesCuboids.findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        assertEquals(31, DifferenceVolumesCuboids.findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        assertEquals(0, DifferenceVolumesCuboids.findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }
}
