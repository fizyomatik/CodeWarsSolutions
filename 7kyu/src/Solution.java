package src;

class Solution {
    public static String calc(String txt){

        int count1=0;
        int count2=0;
        int result=0;
        String str="";
        for(int i=0;i<txt.length();i++){

            if(txt.charAt(i)=='.'){
                count1++;
            }
            if(txt.charAt(i)==txt.indexOf(' ')){
                break;
            }

        }






        for(int i=count1+2;i<txt.length();i++){


            if(txt.charAt(i)=='.'){
                count2++;
            }

        }

        for(int i=count1;i<count1+2;i++){
            switch(txt.charAt(i)){
                case '+':
                    result=count1+count2;
                case '-':
                    result=count1 - count2;
                case '*':
                    result=count1 * count2;
                default:
                    result=count1 / count2;

            }

            for(int j=0;j<result;j++){
                str+=".";
            }



        }

        return str;
    }

    public static void main(String[] args) {
        calc("..... // .");
    }
}