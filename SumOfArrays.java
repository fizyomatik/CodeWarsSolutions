public class SumOfArrays {
    public static int sumOfDifferences(int[] arr) {
        int sumdif=0;
        Arrays.sort(arr);
        reverseArray(arr);
        for(int i=0;i<arr.length-1;i++){
            sumdif+=arr[i]-arr[i+1];

        }

        return sumdif;
    }
    public static void reverseArray(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = arr[i];

            // Assigning the first half to the last half
            arr[i] = arr[n - i - 1];

            // Assigning the last half to the first half
            arr[n - i - 1] = temp;
        }
    }
}
