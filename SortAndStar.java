import java.util.Arrays;

public class SortAndStar {
    public static void main(String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }
    public static String twoSort(String[] s) {
        String fi="";
        String fin="";
        String re="";
        char charArray[];
        for(int i=0;i<s.length;i++){
            fi+=s[i].charAt(0);
            
        }
        char [] charfi=fi.toCharArray();
        Arrays.sort(charfi);
        char c=fi.charAt(0);

        for(int i=0;i<s.length;i++){
            if(s[i].charAt(0)=='b'){
                fin=s[i];
            }
            char [] rechar=fin.toCharArray();
            String lasst=Arrays.toString(rechar);
            for(int j=0;j<fin.length();j++){


                re+=lasst;
            }
        }
        return re ;
    }
}
