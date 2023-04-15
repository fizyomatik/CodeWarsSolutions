package src;

public class SpeedLimit {
    public static int speedLimit(final int speed, final int[] signals) {
        int r=0;
        for(int i=0;i<signals.length;i++){
            if(speed>signals[i]+9 && speed<signals[i]+20){
                r+= 100;
            }else if(speed>signals[i]+19 && speed<signals[i]+30){
                r+= 250;
            }else if(speed>signals[i]+29){
                r+= 500;
            }
        }
        return r;
    }
}
