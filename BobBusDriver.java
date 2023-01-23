import java.lang.Math.*;
public class BobBusDriver {
    public static int enough(int cap, int on, int wait){
        int c=on+wait;
        int i=cap-c;
        return i>0 ? 0: Math.abs(i);
    }
}
