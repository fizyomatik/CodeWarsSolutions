public class OddEvenSort {

    public static void main(String[] args) {
        sortMyString("emrullahN");
    }
    public static String sortMyString(String s) {
        String s1="";
        String s2="";
        for(int i=0;i<s.length();i=i+2){
            s2+=s.charAt(i);

        }
        for(int i=1;i<s.length();i=i+2){
            s1+=s.charAt(i);

        }
        return s2 + " " + s1;
    }
}
