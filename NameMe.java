import java.util.Scanner;

public class NameMe {

    private String firstName;
    private String lastName;
    private String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public static void main(String[] args) {

        NameMe nameMe = new NameMe("John", "Doe");
        System.out.println(nameMe.getFirstName()); //Expected: John
        System.out.println(nameMe.getLastName()); //Expected: Doe
        System.out.println(nameMe.getFullName()); // Expected John Doe
    }

    public String getFirstName(){

        return firstName;
    }

    public String getLastName(){

        return lastName;
    }

    public String getFullName(){

        return firstName +" "+ lastName;
    }
}
