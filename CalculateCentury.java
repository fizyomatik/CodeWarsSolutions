public class CalculateCentury {
    public static int century(int number) {

        if(number<=100){
            return 1;

        }else if(number%100==0){
            return number/100;
        }else{
            return number/100 +1;
        }

    }
}
