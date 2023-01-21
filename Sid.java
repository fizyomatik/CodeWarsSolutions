public class Sid {

    public static String howMuchILoveYou(int nb_petals) {
        int a=nb_petals%6;

        switch(a){
            case 0:
                return "not at all";
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";

        }
        return null;
    }
}
