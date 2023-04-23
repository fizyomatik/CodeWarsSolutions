package src;

import java.util.Arrays;

public class LargestElement {
    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);

        int [] arr2=new int[n];
        int b=n;

        for(int i=0;i<n;i++){
            arr2[i]=arr[arr.length-b];
            b--;
        }
        return arr2;
    }
}
