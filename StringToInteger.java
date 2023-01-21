import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class StringToInteger {
    public static int stringToNumber(String str) {
        int a=Integer.parseInt(str);
        return a;
    }
    @Test
    public void test1(){
        assertEquals("stringToNumber(1234)", 1234 , StringToInteger.stringToNumber("1234"));
    }
    @Test
    public void test2(){
        assertEquals("stringToNumber(605)", 605 , StringToInteger.stringToNumber("605"));
    }
    @Test
    public void test3(){
        assertEquals("stringToNumber(1405)", 1405 , StringToInteger.stringToNumber("1405"));
    }
    @Test
    public void test4(){
        assertEquals("stringToNumber(-7)", -7 , StringToInteger.stringToNumber("-7"));
    }
}
