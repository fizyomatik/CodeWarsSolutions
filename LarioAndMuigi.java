import org.junit.Test;
import java.util.stream.IntStream;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;

public class LarioAndMuigi {

    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
    @Test
    public void test(){
        int [] expected=new int[]{1,2,3,4,5,6};
        assertArrayEquals(expected, LarioAndMuigi.pipeFix(new int[]{1,6}));
    }

}
