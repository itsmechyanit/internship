public class CyclicallyRotate {
  public void rotate(int arr[], int n)
    {
        //1 2 3 4  4 1 2 3
        //create a temp variable
        int temp = arr[0];
        //store the last element
        int last = arr[n -1];
        //iterate over the array until the last element
        for(int i = 0; i < n -1; i++){
          int t = arr[i + 1];
          arr[i + 1] = temp;
          temp = t;
        }
        //finally store the last element at the first place in the cyclically rotated array
        arr[0] = last;
    }

    public static void main(String[] args) {
      CyclicallyRotate cr = new CyclicallyRotate();
      System.out.println("Testing the first test case");
      int [] a1 = {1, 2, 3, 4, 5};
      int n1 = 5;
      cr.rotate(a1, n1);
      System.out.println("Array after cyclical rotation is");
      for(Integer el: a1){
        System.out.print(el + " ");
      }

      System.out.println();
      System.out.println("Testing the second test case");
      int [] a2 = {9, 8, 7, 6, 4, 2, 1, 3};
      int n2 = 8;
      cr.rotate(a2, n2);
      System.out.println("Array after cyclical rotation is");
      for(Integer el: a2){
        System.out.print(el + " ");
      }
    }
}
