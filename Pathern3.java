public class Pathern3 {
    public static String pattern(int n){
        StringBuilder s=new StringBuilder();

        s.append(1);
        if(n>1){

            for(int i=2;i<=n;i++){
                s.append("\n");
                s.append(1);
                for(int j=1;j<i;j++){

                    s.append("*");
                }
                s.append(i);

            }

        }

        return s.toString();
    }
}
