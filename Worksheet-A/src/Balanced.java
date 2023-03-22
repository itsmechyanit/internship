import java.util.Scanner;
import java.util.Stack;

public class Balanced {

    static boolean isBalanced(String expr) {
        Stack<Character> st = new Stack<>();
        if (expr.length() == 0)
            return true;
        char ch = expr.charAt(0);
        if (ch == ']' || ch == ')' || ch == '}')
            return false;
        for (int i = 0; i < expr.length(); i++) {
            ch = expr.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                st.push(ch);
            } else if (ch == ']') {
                char t = '\0';
                while (!st.empty()) {
                    t = st.pop();
                    if (t == '[') {
                        break;
                    }
                }

                if (t == '[' && st.empty())
                    continue;
                else if (t == '[' && !st.empty())
                    continue;
                else
                    return false;

            } else if (ch == ')') {
                char t = '\0';
                while (!st.empty()) {
                    t = st.pop();
                    if (t == '(') {
                        break;
                    }
                }

                if (t == '(' && st.empty())
                    continue;
                else if (t == '(' && !st.empty())
                    continue;
                else
                    return false;
            }

            else if (ch == '}') {
                char t = '\0';
                while (!st.empty()) {
                    t = st.pop();
                    if (t == '{') {
                        break;
                    }
                }

                if (t == '{' && st.empty())
                    continue;
                else if (t == '{' && !st.empty())
                    continue;
                else
                    return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string expression consisting of only {}[]() brackets");
        String expr = sc.nextLine();
        boolean ans = isBalanced(expr);
        if (ans)
            System.out.println("The string expression is balanced");
        else
            System.out.println("The string expression is not balanced");
        sc.close();
    }

}
