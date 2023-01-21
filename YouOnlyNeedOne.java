import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {

        for(Object i: a){
            if(i.equals(x)) return true;
        }
        return false;
    }
    @Test

    public void testSomething() {
        assertEquals(YouOnlyNeedOne.check(new Object[] {66, 101}, 66), true);
        assertEquals(YouOnlyNeedOne.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(YouOnlyNeedOne.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(YouOnlyNeedOne.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }
}
