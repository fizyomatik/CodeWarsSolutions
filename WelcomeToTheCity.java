import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class WelcomeToTheCity {
    public static String sayHello(String [] name, String city, String state) {
        String s = "";
        for (String n : name) {
            s += n + " ";
        }
        String st = s.substring(0, s.length() - 1);

        return "Hello, " + st + "!" + " Welcome to " + city + ", " + state + "!";
    }
    @Test
    public void test(){
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", WelcomeToTheCity.sayHello(new String[]{"John", "Smith"}, "Phoenix","Arizona"));
    }
}
