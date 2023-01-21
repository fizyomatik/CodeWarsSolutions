import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

public class SaleHotDogs {
    public static int saleHotdogs(final int n){
        return n<5 ? n*100 : (n>=5 && n<10 ? n*95 : (n>=10 ? n*90:null));
    }
    @Test
    public void test(){
        assertEquals(300,SaleHotDogs.saleHotdogs(3));
        assertEquals(475,SaleHotDogs.saleHotdogs(5));
        assertEquals(900,SaleHotDogs.saleHotdogs(10));
    }

}
