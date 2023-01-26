public class Pathern4 {
    public static String pattern(int n) {
        StringBuilder ss=new StringBuilder();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){

                ss.append(j);

            }
            if(i<n)
                ss.append("\n");
        }
        return ss.toString();
    }
}
