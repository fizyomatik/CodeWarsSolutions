import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        even_or_odd(i);


    }

    public static String even_or_odd(int i){
       return i%2==0 ? "Even":"Odd";
    }



}
