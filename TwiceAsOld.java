public class TwiceAsOld {
    public static int TwiceAsOld(int d, int s){
        int n=d-s;
        if(s==0)
            return d;
        if(d>(2*s)){
            return d-(2*s);
        }else{
            return (2*s)-d;
        }

    }
}
