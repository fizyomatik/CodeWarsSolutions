public class HoeManyStairsWillSuzikiClimb {
    public static long stairsIn20(int[][] stairs)
    {
        long r=0;
        for(int i=0;i<stairs.length;i++){
            for(int j=0;j<stairs[i].length;j++){
                r+=stairs[i][j];
            }
        }
        return r*20;
    }
}
