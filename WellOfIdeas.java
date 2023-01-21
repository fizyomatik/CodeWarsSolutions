import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

public class WellOfIdeas {
    public static String well(String[] x) {
        int count=0;
        for(int i=0;i<x.length;i++){
            if(x[i].equals("good")){
                count++;
            }

        }
        return count<1 ? "Fail!":count<3 ? "Publish!" : "I smell a series!";
    }
    @Test
    public void basicTests() {
        assertEquals("Fail!", WellOfIdeas.well(new String[] {"bad", "bad", "bad"}));
        assertEquals("Publish!", WellOfIdeas.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", WellOfIdeas.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
