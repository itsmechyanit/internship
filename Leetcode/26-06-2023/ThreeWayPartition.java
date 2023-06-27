public class ThreeWayPartition {
     public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        //This problem is based on dutch flag algorithm
        int left = 0;
        int right = array.length - 1;
        for(int i = 0; i<= right; i++){
            //if the current element is less than a
            //swap the element with the leftmost element
            //increment left by 1
            if(array[i] < a){
                int temp = array[left];
                array[left] = array[i];
                array[i] = temp;
                left++;
            }
            //if the current element is greater than b
            //swap the element with the rightmost element
            //decrement right by 1
            else if(array[i] >b){
                int temp = array[right];
                array[right] = array[i];
                array[i] = temp;
                right--;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        ThreeWayPartition twp = new ThreeWayPartition();
        System.out.println("Testing out the first test case");
        
        int a1 = 1;
        int b1 = 2;
        int[] A1 = {1, 2, 3, 3, 4};
        twp.threeWayPartition(A1, a1, b1);
        System.out.println("Here is the output after partitioning the array");
        for(int i = 0; i < A1.length; i++){
            System.out.print(A1[i] +" ");
        }

        System.out.println();

        System.out.println("Testing out the Second test case");
        
        int a2 = 1;
        int b2 = 3;
        int[] A2 = {1, 2, 3};
        twp.threeWayPartition(A2, a2, b2);
        System.out.println("Here is the output after partitioning the array");
        for(int i = 0; i < A2.length; i++){
            System.out.print(A2[i] +" ");
        }
    }
}
