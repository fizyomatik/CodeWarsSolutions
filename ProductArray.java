package src;

public class ProductArray {
    public static long[] productArray(int[] numbers)
    {
        int n = numbers.length;
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
        long[] r = new long[n];

        arr1[0] = 1;
        arr2[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            arr1[i] = arr1[i - 1] * numbers[i - 1];
        }


        for (int i = n - 2; i >= 0; i--) {
            arr2[i] = arr2[i + 1] * numbers[i + 1];
        }

        for (int i = 0; i < n; i++) {
            r[i] = arr1[i] * arr2[i];
        }

        return r;
    }
}
