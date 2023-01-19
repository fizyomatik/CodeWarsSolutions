import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class JennysSecretMessage {

    public static String greet(String name) {

        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }

    @Test
    public void test(){
        assertEquals("Hello, Emo!", JennysSecretMessage.greet("Emo"));
        assertEquals("Hello, my love!", JennysSecretMessage.greet("Johnny"));

    }

}