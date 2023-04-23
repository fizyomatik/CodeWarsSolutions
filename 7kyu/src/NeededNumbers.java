package src;
import java.util.Arrays;
public class NeededNumbers {
    public static int consecutive(final int[] arr) {
        int neededNum;
        if(arr.length<2)
            return 0;
        Arrays.sort(arr);


        return arr[arr.length - 1] - arr[0] - arr.length + 1;
    }
}
