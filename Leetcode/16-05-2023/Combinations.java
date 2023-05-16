import java.util.List;
import java.util.ArrayList;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        //We could solve this problem by backtracking also
        //Here we are solving it using iteration
        //This will hold all the subsets
        @SuppressWarnings("unchecked") 
        List<List<Integer>> subsets = new ArrayList();
        //Initially the subsets list will contain an empty list[]
        subsets.add(new ArrayList<>());
        //iterate over the entire range
        for(int i = 1; i <= n; i++){
            //get the subsets list size
            int size = subsets.size();
            for(int j = 0; j < size; j++){
                //create a copy of the list
                //Keep in mind we are not touching anything in the subsets list
                List<Integer> current = new ArrayList<Integer>(subsets.get(j));
                //add the current element to the copy
                current.add(i);
                //add the copy to the subsets list
                subsets.add(current);
            }
        }

        @SuppressWarnings("unchecked") 
        List<List<Integer>> ans = new ArrayList();
        //filter the subset list since we only need subsets of length k
        for(List<Integer> item : subsets){
            //if the list size is k then we can add it to our ans list
            if(item.size() == k){
                ans.add(item);
            }
        }
        //return ans;
        return ans;



    }

    public static void main(String[] args) {
        Combinations c = new Combinations();
        System.out.println("Testing out the first test case");
        int n1 = 4, k1 = 2;
        List<List<Integer>> ans1 = c.combine(n1, k1);
        System.out.println(ans1);

        System.out.println("Testing out the Second test case");
        int n2 = 1, k2 = 1;
        List<List<Integer>> ans2 = c.combine(n2, k2);
        System.out.println(ans2);


       

    }
    
}
