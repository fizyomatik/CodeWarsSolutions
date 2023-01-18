import java.util.Random;
import java.util.Scanner;

public class Ghost {
    private static String [] color;
    private static String s1;

    public Ghost(String s1) {
        this.s1=s1;
     this.color= new String[]{"red", "yellow", "purple", "white"};
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int numOfColor=s.nextInt();


        Ghost ghost=new Ghost(s1);

        System.out.println(ghost.getColor());

    }
    public String getColor(){
        return s1;
    }
}
