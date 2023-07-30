public class PreciseFormat {
  static void printInFormat(float a, float b){
    float result = a/b;

    System.out.print(result+" ");
    System.out.printf("%.3f",+ result);
    
    
    // Your code here to print upto 3 decimal places
    
  }
  public static void main(String[] args) {
    System.out.println("Testing the first test case");
    float a1 = 3.25f;
    float b1 = 2.5f;
    printInFormat(a1, b1);
    System.out.println();
    System.out.println("Testing the Second test case");
    float a2 = 5.43f;
    float b2 = 2.653f;
    printInFormat(a2, b2);
  } 
}
