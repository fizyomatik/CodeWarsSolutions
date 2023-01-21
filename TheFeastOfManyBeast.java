import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;
public class TheFeastOfManyBeast {
    public static boolean feast(String beast, String dish) {

        return (beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1)==dish.charAt(dish.length()-1)) ? true:false;

    }
    @Test
    public void fixedTest() {
        assertTrue(TheFeastOfManyBeast.feast("great blue heron","garlic nann"));
        assertTrue(TheFeastOfManyBeast.feast("chickadee","chocolate cake"));
        assertFalse(TheFeastOfManyBeast.feast("brown bear","bear claw"));
    }

}
