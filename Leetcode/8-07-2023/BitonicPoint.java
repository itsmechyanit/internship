public class BitonicPoint {
     int findMaximum(int[] arr, int n) {
        // code here
        int start = 0;
        int end = n -1;
        //iterate until start < end
        while(start < end){
            //find the middle index
            int mid = (start + end)/2;
            //get the element aat the mid index
            int current = arr[mid];
            //if the element at mid + 1 is greater than the element at mid index
            if(current < arr[mid + 1]){
                //update start to mid + 1
                start = mid + 1;
            }
            //if it is lesser
            else{
                //if the element at mid is bigger than the element at mid -1 then the element at mid is the biggest
                if(current > arr[mid - 1]){
                    return current;
                }
                //if the element at mid -1 is greater than the element at mid
                else{
                    //update end to mid -1
                    end = mid - 1;
                }
            }
        }
        //return the answer
        return arr[start];
    }

    public static void main(String[] args) {
        BitonicPoint bp = new BitonicPoint();
        System.out.println("Testing out the first test case");
        int n1 = 9;
        int arr1[] = {1,15,25,45,42,21,17,12,11};
        System.out.println("The maximum element is: " + bp.findMaximum(arr1, n1));
        System.out.println("Testing out the Second test case");
        int n2 = 5;
        int arr2[] = {1,45,47,50,5};
        System.out.println("The maximum element is: " + bp.findMaximum(arr2, n2));
    }
}
