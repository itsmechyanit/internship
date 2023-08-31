public class ImmediateSmaller {
  void immediateSmaller(int arr[], int n) {
    // code here

    for(int i = 0; i < n - 1; i++){
      
      if(arr[i + 1] < arr[i]){
        System.out.print(arr[i + 1] + " ");
      }

      else{
        System.out.print(-1 + " ");
      }
    }

    System.out.print(-1 + " ");
}
}
