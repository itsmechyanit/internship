import java.util.ArrayList;

public class SpiralTraversal {
  static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        //here top represents the top row
        int top = 0;
        //bottom represents the bottom row
        int bottom = r - 1;
        //left represents the left most column
        int left = 0;
        //right represents the right most row
        int right = c - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(top <= bottom && left <= right){
          //traverse right
          for(int i = left; i <= right; i++){
            ans.add(matrix[top][i]);
          }
          top++;
          //traverse bottom
          for(int i = top; i <= bottom; i++){
            ans.add(matrix[i][right]);
          }
          right--;
          //if there are still rows to traverse
          if(top <= bottom){
            //traverse left
             for(int i = right; i >= left; i--){
              ans.add(matrix[bottom][i]);
          }
          bottom--;
          }
          //if there are columns left to traverse
         if(left <= right){
          //traverse up
          for(int i = bottom; i >= top; i--){
            ans.add(matrix[i][left]);
          }
          left++;
         }

          
        }

        return ans;
    }

    public static void main(String[] args) {
      System.out.println("Testing the first test case");
      int r1 = 4;
      int c1 = 4;
      int[][] matrix1 = {{1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15,16}};
      ArrayList<Integer> ans1 = spirallyTraverse(matrix1, r1, c1);
      for(Integer el:ans1){
        System.out.print(el + " ");
      }
      System.out.println();
      System.out.println("Testing the Second test case");
      int r2 = 3;
      int c2 = 4;
      int[][] matrix2 = {{1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12}};
      ArrayList<Integer> ans2 = spirallyTraverse(matrix2, r2, c2);
      for(Integer el:ans2){
        System.out.print(el + " ");
      }
    }
}
