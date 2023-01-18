import org.junit.Test;

import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class KeepHydrated {
    public static void main(String[] args) {
        KeepHydrated kh = new KeepHydrated();
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        System.out.println(kh.Liters(n));
    }

    public int Liters(double time)  {

        int sum=(int) (time * 0.5);
        return sum;

    }
    @Test
    public void SampleTest1() {
        KeepHydrated kh = new KeepHydrated();
        assertEquals(1, kh.Liters(2));

    }
}
