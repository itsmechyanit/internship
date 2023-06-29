public class Wave {
     public static void convertToWave(int n, int[] a) {
        // code here
        //Array is already sorted 
        //start iterating the array in steps of 2
        for(int i = 0; i < a.length; i = i + 2){
            //get the current element at index i
            int current = a[i];
            //if i + 1 exists
            if(i + 1 < a.length){
                //then swap the element at index i and i + 1
                a[i] = a[i + 1];
                a[i+ 1] = current;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first test case");
        int n1 = 5;
        int arr1[] = {1,2,3,4,5};
        convertToWave(n1, arr1);
        System.out.println("Sorting the array into a wave like array");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
         System.out.println("Testing out the Second test case");
        int n2 = 6;
        int arr2[] = {2,4,7,8,9,10};
        convertToWave(n2, arr2);
        System.out.println("Sorting the array into a wave like array");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
