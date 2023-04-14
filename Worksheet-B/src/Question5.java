import java.util.Scanner;

public class Question5 {
    //This question assumes that the matrix has odd number of rows and columns

    private static MyCustomObject sumOfMiddle(int[][] matrix){
        MyCustomObject ans = new MyCustomObject();
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int rowSum = 0;
        int colSum = 0;
        //for middleRow
        int [] row = matrix[numRows/2];
        for(int i = 0; i < row.length; i++){
            rowSum = rowSum + row[i];
        }

        //for middleCol
        for(int i = 0 ; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                if(j == numCols/2){
                    colSum = colSum + matrix[i][j];
                }
            }
        }

        ans.middleRowSum = rowSum;
        ans.middleColSum = colSum;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("This question assumes that the matrix has an even number of rows and columns");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows in your matrix");
        int row = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the number of cols in your matrix");
        int col = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[row][col];
        for(int i = 0 ; i < row; i++){
            System.out.println("Please enter the " + (i + 1) + " row");
            for(int j = 0; j < col; j++){
                int temp = sc.nextInt();
                matrix[i][j] = temp;

            }
            sc.nextLine();
        }

        System.out.println("Calculating the middle column sum");

        MyCustomObject ans = sumOfMiddle(matrix);
        System.out.println("The middle column sum is " + ans.middleColSum);

        System.out.println("Calculating the middle Row sum");

        System.out.println("The middle row sum is " + ans.middleRowSum);

        sc.close();



    }
    
}
