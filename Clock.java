public class Clock {
    public static void main(String[] args) {

        System.out.println(Past(0,1,1));
    }
    public static int Past(int h, int m, int s)
    {
        return h*60*60000 + m*60000 + s*1000;
    }
}
