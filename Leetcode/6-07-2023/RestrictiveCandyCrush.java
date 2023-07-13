import java.util.Stack;

//Custom class to hold Character with its frequency
class CharacterWithFrequency{
  char ch;
  int frequency;
  CharacterWithFrequency(char ch, int frequency){
    this.ch = ch;
    this.frequency = frequency;
  }
}
public class RestrictiveCandyCrush {
  public static String reduced_String(int k, String s){
    StringBuilder ans = new StringBuilder("");
    //if k is less than 1 then return empty string
    if(k <= 1){
      return ans.toString();
    }

    Stack<CharacterWithFrequency> st = new Stack<CharacterWithFrequency>();
    //put the first character with its frequency on the top of the stack
    st.push(new CharacterWithFrequency(s.charAt(0), 1));
    //start iterating over the string
    for(int i = 1; i < s.length(); i++){
      //get the character
      char c = s.charAt(i);
      //check if the top of the stack also has the same character
      if(!st.isEmpty() && st.peek().ch == c){
        //increase the frequency
        st.peek().frequency++;
      }
     
      else{
        //else push the current character with its frequency to the top of the stack
        st.push(new CharacterWithFrequency(s.charAt(i), 1));
      }
      //if the current character frequency is greater than or eaul to k
      if(st.peek().frequency >=k){
        //update its frequency by taking its modulus with k
        st.peek().frequency = st.peek().frequency % k;
      }
      //remove from the stack
      if(st.peek().frequency ==0){
        st.pop();
      }

    }

    //generate the final string
    while(!st.isEmpty()){
      CharacterWithFrequency cf = st.pop();
      for(int i = 1; i <= cf.frequency; i++){
        ans.append(cf.ch);
      }
    }

   return ans.reverse().toString();




    

  }
  public static void main(String[] args) {
    System.out.println("Testing the first test case");
    int k1 = 2;
    String s1 = "geeksforgeeks";
    System.out.println("Modified string after each step is: "+reduced_String(k1, s1));
    System.out.println("Testing the Second test case");
    int k2 = 2;
    String s2 = "geegsforgeeeks" ;
    System.out.println("Modified string after each step is: "+reduced_String(k2, s2));
  }
}
