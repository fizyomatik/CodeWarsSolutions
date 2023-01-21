public class SumArrays {

    public static double sum(double[] numbers) {
        if(numbers.length<1) return 0;
        double sum=0.0;
        for(double n: numbers){
            sum+=n;
        }
        return sum;
    }
}
