import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
public class ConvertStringToArray {
    public static void main(String[] args) {
        String s="I love arrays they are my favorite";
        System.out.println(stringToArray(s));
    }
    public static String[] stringToArray(String s){

    int count=0;
      for(int j=1;j<s.length();j++){
        if(s.charAt(j)==' '){
            count++;
        }
    }

    String [] st=new String[count+1];
    int k=0,t=0;
        for(int i=0;i<s.length();i++){

        if(s.charAt(i)==' '){
            st[k]=s.substring(t,i);
            t=i+1;
            k++;

        }
    }

      return st;
    }

}
