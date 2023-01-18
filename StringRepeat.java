import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String s="";
        for(int i=0;i<repeat;i++){
            s+=string;
        }
        return s;
    }
    @Test
    public void Test1(){
        int repeat=3;
        String string="Hello";
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3,"Hello"));
    }
}
