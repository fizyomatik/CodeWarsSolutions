import org.junit.Test;
import org.junit.runners.JUnit4;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class UnfinishedLoop {
    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number;count++)
        {
            list.add(count);
        }

        return list;
    }
    @Test
    public void test(){
        UnfinishedLoop l=new UnfinishedLoop();


        assertEquals(Arrays.asList(1),l.CreateList(1));
        assertEquals(Arrays.asList(1,2),l.CreateList(2));
    }

}
