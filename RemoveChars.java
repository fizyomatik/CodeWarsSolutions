import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class RemoveChars {
    public static String remove(String str) {

        if(str.length()<3)
            return "";
        String s="";
        for(int i=1;i<str.length()-1;i++){
            s+=str.charAt(i);
        }
        return s;
    }
    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }
}
