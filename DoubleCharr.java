import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DoubleCharr {

    public static String doubleChar(String s){
        String ss="";
        for(Character c: s.toCharArray()){

            ss+=""+c+c;
        }
        return ss;
    }
    @Test
    void sampleTest() {
        assertEquals("SSttrriinngg",DoubleCharr.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd",DoubleCharr.doubleChar("Hello World"));
        assertEquals("11223344!!__  ",DoubleCharr.doubleChar("1234!_ "));
    }
}
