package src;

public class Progression {
    public static String arithmeticSequenceElements(int a, int d, int n) {

        String s="";
        int res=a;
        for(int i=0;i<n;i++){


            s+=res;
            if(i==n-1)
                break;
            s+=", ";
            res+=d;


        }
        return s;
    }

}
