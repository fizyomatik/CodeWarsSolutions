public class NthPower {
    public static int  nthPower(int [] array, int n){
          if(array.length-1<n) return -1;
        int a=array[n];
        return (int)Math.pow(a,n);
    }
}
