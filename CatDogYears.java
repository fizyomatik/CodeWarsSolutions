public class CatDogYears {
    public static int[] humanYearsCatYearsDogYears(final int a) {

        return a==1 ? new int[]{1,15,15}: a==2 ? new int[]{2,24,24}:new int[]{a,24+(a-2)*4,24+(a-2)*5} ;
    }

}
