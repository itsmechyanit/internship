public class Construct2DArrays {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] ans = new int[m][n];
        //This is used to return an empty array if 2D array cannot be created
        int[][]empty = {};
        //Check whether to return an empty array
        if(m * n != original.length){
            return empty;
        }
        
        //keep an index pointer for the original 1d Array
        int orig = 0;
        
        //iterate over the rows
        for(int i = 0; i < m; i++){
            //iterate over the columns
            for(int j = 0; j < n; j++){
               ans[i][j] = original[orig];
               //increment the orig pointer
                orig++;
            }
        }
        
        return ans;
        
    }
}
