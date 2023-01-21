
import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import  java.util.Arrays;

public class PythagoreanTriple {
    public int isTrue(int [] triple){
           if(Math.pow(triple[0],2) +Math.pow(triple[1],2) ==Math.pow(triple[2],2) ){
               return 1;
           }else if(Math.pow(triple[2],2) +Math.pow(triple[0],2) ==Math.pow(triple[1],2) ){
               return 1;
           }else if(Math.pow(triple[1],2) +Math.pow(triple[2],2) ==Math.pow(triple[0],2) ){
               return 1;
           } else{
               return 0;
           }
    }
    static int [] p1={3,4,5};
    @Test
    public void validTriple(){
        PythagoreanTriple pT = new PythagoreanTriple();

        assertEquals(1, pT.isTrue(p1));
    }
}
