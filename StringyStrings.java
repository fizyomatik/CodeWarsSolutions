import org.junit.Test;
import org.junit.runners.JUnit4;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StringyStrings {
    public static String stringy(int size) {
        String s="";

        if(size%2!=0){
            s="1";
            for(int i=0;i<size/2;i++){
                s+=0;
                s+=1;
            }
        }

        if(size%2==0){

            for(int i=0;i<size/2;i++){
                s+=1;
                s+=0;
            }
        }

        return s;
    }
    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', StringyStrings.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, StringyStrings.stringy(size).length());
        }
    }
}
