public class Pathern1 {
    public static String pattern(int n){
        String ss="";
        if(n<1)
            return "";
        ss+="1";
        for(int i=2;i<=n;i++){
            ss+="\n";
            for(int j=1;j<=i;j++){
                ss+=i;

            }

        }


        return ss;
    }
}
