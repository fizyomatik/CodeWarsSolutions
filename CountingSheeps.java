public class CountingSheeps {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count=0;
        try{
            for(boolean i:arrayOfSheeps){
                if(i==true)
                    count++;
            }
        }catch(NullPointerException e){
            return count;

        }
        return count;

    }
}
