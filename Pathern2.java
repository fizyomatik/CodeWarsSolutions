public class Pathern2 {
    public static String pattern ( int n) {
        String s="";
        for(int i=1;i<=n;i++){

            for(int j=n;j>=i;j--){
                s+=j;
            }
            if(i==n){
                break;
            }
            s+="\n";
        }
        return s;
    }
}
