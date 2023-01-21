public class TotalAmountOfPoints {
    public static int points(String [] games){
        int sumPoint=0;
        for(String  n: games){
            char a=n.charAt(0);
            char f=n.charAt(2);

            sumPoint+=a>f ? 3: a==f ? 1:0;
        }
            return sumPoint;

    }
}
