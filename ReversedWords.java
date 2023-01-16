import java.util.Scanner;

public class ReversedWords {


    public static String reverseWords(String str){
        String n_str="";
        int count=str.length();
        for (int i=str.length()-1;i>=0;i--){


            if(str.charAt(i)==' '|| i==0){
                if(i==0){
                    n_str+=str.substring(i,count);
                    continue;
                }
                n_str+=str.substring(i+1,count);
                if(i>0){
                    n_str+=" ";
                }
                count=i;

            }
        }
        return n_str;

    }

}
