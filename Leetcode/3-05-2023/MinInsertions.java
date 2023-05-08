
import java.util.Stack;

public class MinInsertions {
    //(()))
    //Stack is used for pushing the ( parenthesis
    Stack<Character> st = new Stack<>();

    public int minInsertions(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            //push ( into the stack
            if(ch == '('){
                st.push(ch);
            }
            //if the character is )
            else{
                //check the next character and if the stack is empty
                if(i + 1 < s.length() && st.isEmpty()){
                    if(s.charAt(i + 1) == ')'){
                        cnt++;
                        i++;
                    }
                    else{
                        //the next character is (
                        //)(
                            cnt = cnt + 2;
                    }
                }

                //if the stack is not empty
                else if(i + 1 < s.length() && !st.isEmpty()){
                    //the next character is )
                    if(s.charAt(i + 1) == ')'){
                        st.pop();
                        i++;
                    }
                    //The next character is (
                    else{
                        cnt++;
                        st.pop();
                    }
                }
                //if there is no next character
                else if(i + 1 >= s.length()){
                    if(st.isEmpty()){
                        cnt = cnt + 2;
                    }
                    else{
                        cnt++;
                        st.pop();
                    }
                }
            }
        }

        //if the stack is still not empty
        while(!st.isEmpty()){
            st.pop();
            cnt = cnt + 2;
        }

        return cnt;   
    }
    
}
