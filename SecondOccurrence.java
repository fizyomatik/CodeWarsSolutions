public class SecondOccurrence {
    public static int second_symbol(String str, char c) {

        int count=0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==c){
                count++;
                if(count==2){
                    return i;
                }
            }

        }

        return -1;
    }
}
