import java.util.Stack;

//custom class to hold Array Element With Index
class ArrayElementWithIndex{
  int index;
  int value;
  ArrayElementWithIndex(int i, int v){
    index = i;
    value = v;
  }
}

public class StockSpan {
  public static int[] calculateSpan(int price[], int n)
  {
      // Your code here
      //We will use Stack to find out the nearest greater element 
      Stack<ArrayElementWithIndex> s = new Stack<>();
      //to hold the span of the stockes
      int[] span = new int[n];
      //The stock at index 0 will have a span of 1
      span[0] = 1;
      ArrayElementWithIndex el = new ArrayElementWithIndex(0, price[0]);
      //insert the first element in the stack
      s.add(el);
      //start iterating over the array
      for(int i = 1; i < n; i++){
        //if stack is not empty
        if(!s.isEmpty()){
          //if the top of the stack is greater than the current element
          if(s.peek().value > price[i]){
            span[i] = i - s.peek().index;
          }
          else{
            //if the top is smaller than the current element and the stack is not empty
            while(!s.isEmpty() && s.peek().value <= price[i]){
              //continue popiing the element
              s.pop();
              //if stack becomes empty
              if(s.isEmpty()){
                //then the span will be i + 1
                span[i] = i + 1;
              }
              else{
                span[i] = i - s.peek().index;
              }
            }
          }
        }
        //if the stack is empty then span of i will be i + 1
        else{
          span[i] = i + 1;
        }
        //add the current element to the stack
        s.add(new ArrayElementWithIndex(i, price[i]));
      }

      return span;
  }

  public static void main(String[] args) {
    System.out.println("Testing the fist test case");
    int price1[] = {100, 80, 60, 70, 60, 75, 85};
    int N1 = 7;
    int[] ans1 = calculateSpan(price1, N1);
    System.out.println("Here are the spans of the stock");
    for(int i = 0; i < ans1.length; i++){
      System.out.print(ans1[i] + " ");
    }

    System.out.println();
     System.out.println("Testing the Second test case");
    int price2[] = {10,4,5,90,120,80};
    int N2 = 6;
    int[] ans2 = calculateSpan(price2, N2);
    System.out.println("Here are the spans of the stock");
    for(int i = 0; i < ans2.length; i++){
      System.out.print(ans2[i] + " ");
    }
  }
}
