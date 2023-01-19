public class GhostCode {
    public static String helloName(final String name){

        try{
            return  !name.equals("") ? "Hello my name is " + name: "Hello world!";
        }catch(NullPointerException e){
            return "Hello world!";
        }

    }
}
