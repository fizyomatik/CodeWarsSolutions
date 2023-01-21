import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
public class Slope {
    public String slope(int[] points)
    {
        int k=points[2]-points[0];
        int l=points[3]-points[1];

        if(l==0 && k==0)
            return "undefined";

        return l==0 ? "0": k==0 ? "undefined" : String.valueOf(l/k);

    }

    @Test
    public void test(){
        int [] test1={19,3,20,3};
        Slope s=new Slope();
        assertEquals("0",s.slope(test1) );
    }

}
