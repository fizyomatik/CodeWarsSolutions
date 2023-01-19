import org.junit.Test;
import  org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class PushAnObjectIntoArray {
    public static List<String> push(){
        List<String> item=new ArrayList<>();
        item.add("an object");
        return item;

    }
    @Test
    public void Test(){
        List<String> item=PushAnObjectIntoArray.push();
        assertEquals("an object",item.get(0));
        assertEquals(1,item.size());


    }
}
