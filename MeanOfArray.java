public class MeanOfArray {
    public static int getAverage(int[] marks){
        int av=0;
        int len=marks.length;
        for(int i: marks)
        {
            av+=i;
        }
        return av/len;
    }
}
