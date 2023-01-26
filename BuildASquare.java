import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class BuildASquare {
    public static final String generateShape(int n) {
    String s="";
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            s+="+";
        }
        if(i==n){
            break;
        }
        s+="\n";


    }
    return s;

  }
    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", BuildASquare.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuildASquare.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuildASquare.generateShape(8));
    }
}
