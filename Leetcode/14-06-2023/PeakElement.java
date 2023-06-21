public class PeakElement {
  public int peakElement(int[] arr,int n)
    {
        int ans = 0;
        //if the array has just 1 element then that element is itself the peak element
        if(n == 1){
            return ans;
        }
        //iterate over the array
       for(int i = 0; i < n; i++){
        //for the first element we only need to compare it with the right adjacent element
        if(i == 0){
            if(arr[i] >= arr[i + 1]){
                ans = i;
            }
        }
        //for the last element we only need to compare it with the left adjacent element
        else if(i == n - 1){
            if(arr[i] >= arr[i -1]){
                ans = i;
            }
        }
        //for other element we need to compare the current element with both the right and the left adjacent element
        else{
            if(i - 1 >=0 && i + 1 < n){
                if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
                    ans = i;
                }
            }
        }
       }
       return ans;
    }  

    public static void main(String[] args) {
        PeakElement pe = new PeakElement();
        System.out.println("Testing the first test case");
        int[] arr1 = {1,2,3};
        System.out.println("Here is the index of the peak element: " +pe.peakElement(arr1, 3));
        System.out.println("Testing the Second test case");
        int[] arr2 = {3,4,2};
        System.out.println("Here is the index of the peak element: " +pe.peakElement(arr2, 3));

    }
}
