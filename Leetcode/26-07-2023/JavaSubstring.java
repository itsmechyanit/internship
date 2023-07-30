public class JavaSubstring {
  static String javaSub(String S, int L, int R) {
    // code here
    //store the substring in the ans variable
    String ans = "";
    //start traversing the string from the left index and go until the right index
    //get the character and append it to the answer
    for(int i = L ; i <= R; i++){
        ans = ans + S.charAt(i);
    }
    
    return ans;
  } 
  public static void main(String[] args) {
    System.out.println("Testing out the first test case");
    String s1 = "cdbkdub";
    int l1 = 0;
    int r1 = 5;
    System.out.println("The output is: "+javaSub(s1, l1, r1));
    System.out.println("Testing out the Second test case");
    String s2 = "sdiblcsdbud";
    int l2 = 3;
    int r2 = 7;
    System.out.println("The output is: "+javaSub(s2, l2, r2));
  }
}
