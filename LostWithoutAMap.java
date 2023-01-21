public class LostWithoutAMap {
    public static int[] map(int[] arr) {
        int [] ar2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ar2[i]=2*arr[i];
        }
        return ar2;
    }
}
