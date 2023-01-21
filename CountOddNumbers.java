import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOddNumbers {
    public static int oddCount(int n){
  // The role of even number is important here
   // if the int an even number then it will be different than we use in math
        return n/2;
    }
    @Test
    public void fixedTests() {
        assertEquals(7, CountOddNumbers.oddCount(15));
        assertEquals(7511, CountOddNumbers.oddCount(15023));
        assertEquals(8, CountOddNumbers.oddCount(16));
    }
}
