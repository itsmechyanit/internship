public class InversionCount {
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int count = 0;
        //check for any position i < j
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i + 1; j < arr.length; j++){
                //check if arr[i] > arr[j]
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        long n1 = 5;
        long arr1[] = {2,4,1,3,5};
        System.out.println("The inversion count is: " + inversionCount(arr1, n1));
        System.out.println("Testing the second test case");
        long n2 = 3;
        long arr2[] = {10, 10, 10};
        System.out.println("The inversion count is: " + inversionCount(arr2, n2));
        System.out.println("Testing the third test case");
        long n3 = 5;
        long arr3[] = {2,3,4,5,6};
        System.out.println("The inversion count is: " + inversionCount(arr3, n3));

    }
}
