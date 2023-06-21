import java.util.ArrayList;
import java.util.Stack;

public class Leaders {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        //use stack to maintain the order of the answer
        Stack<Integer>s = new Stack<>();
        int maximum = Integer.MIN_VALUE;
        //start scanning the array from the right
        for(int i = n -1 ; i >= 0; i--){
            //if the current element is bigger than the maximum element seen so far then the current element is the leader

            if(arr[i] >= maximum){
                maximum = arr[i];
                //add the leader to the stack
                s.add(arr[i]);
            }
        }
        //since the stack is a LIFO data structure then the leftmost leader will be inserted in the answer ArrayList
        while(!s.empty()){
            int ii = s.pop();
            ans.add(ii);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first testcase");
        int[] a1 = {16,17,4,3,5,2};
        ArrayList<Integer> ans1 = leaders(a1, 6);
        System.out.println("Here are the leaders");
        for(Integer i: ans1){
            System.out.print(i +" ");
        }

        System.out.println();

        System.out.println("Testing out the second testcase");
        int[] a2 = {1,2,3,4,0};
        ArrayList<Integer> ans2 = leaders(a2, 5);
        System.out.println("Here are the leaders");
        for(Integer i: ans2){
            System.out.print(i +" ");
        }
    }
}
