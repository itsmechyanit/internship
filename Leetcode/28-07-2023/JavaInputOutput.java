public class JavaInputOutput {
  static void printIntString(String S,int N){
    // code here
    System.out.println("The input string :" +S);
    System.out.println("The input integer :" +N);
  } 
  public static void main(String[] args) {
    System.out.println("Testing out the first test case");
    String s1 = "GeeksforGeeks";
    int n1 = 20;
    printIntString(s1, n1);
    System.out.println("Testing out the second test case");
    String s2 = "Power";
    int n2 = 50;
    printIntString(s2, n2);
  }
}
