public class RowWithMax {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        //row holds the number of rows
        int row = n;
        //col holds the number of columns
        int col = m;
        //maximum holds the maximum count of one
        int maximum = 0;
        //row index with maximum no of 1's
        int ans = -1;
        //start iterating over each row
        for(int i = 0; i < row; i++){
            //count holds the number of 1's in the current row
            int count = 0;
            //start iterating over the column
            for(int j = 0; j < col; j++){
              //if the current element is 1
                if(arr[i][j] == 1){
                  //increment the count
                    count++;
                }
            }
            //if the current row's number of 1's is greater than the max
            if(count > maximum){
              //update maximum to count

                maximum = count;
                //row index to i
                ans = i;
            }
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
      RowWithMax rm = new RowWithMax();
      System.out.println("Testing the first testcase");
      int N1 = 4;
      int M1 = 4;
      int[][] arr1 = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}};
      System.out.println("The row index with maximum no of 1's is: " + rm.rowWithMax1s(arr1, N1, M1));
      System.out.println("Testing the Second testcase");
      int N2 = 2;
      int M2 = 2;
      int[][] arr2 = {{0, 0}, {1, 1}};
      System.out.println("The row index with maximum no of 1's is: " + rm.rowWithMax1s(arr2, N2, M2));

    }
}
