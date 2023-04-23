package src;

public class InsertDashes {
    public static String insertDash(int num) {
        String st="";
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            st+=s.charAt(i);

            if(s.charAt(i)%2!=0 && i!=s.length()-1){

                if(s.charAt(i+1)%2!=0){
                    st+="-";
                }

            }


        }
        return st;
    }
}
