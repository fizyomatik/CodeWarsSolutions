import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;


public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {

        double a=blueStart +redStart;
        double b=bluePulled+redPulled;
        double c=a-b;

        return (blueStart - bluePulled)/c;

    }
    @Test
    public void test(){
        final double epsilon = 0.0000001;
        assertEquals(0.6, BlueAndRedMarbles.guessBlue(5,5,2,3),epsilon);
    }
}
