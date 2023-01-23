import java.util.Arrays;

public class MaxMinValue {
    public int min(int[] list) {
        int m=list[0];
        for(int i=0;i<list.length;i++){
            if(m>list[i]){
                m=list[i];
            }
        }
        return m;
    }

    public int max(int[] list) {
        int m2=list[0];
        for(int i=0;i<list.length;i++){
            if(list[i]>m2){
                m2=list[i];
            }
        }
        return m2;
    }
}
