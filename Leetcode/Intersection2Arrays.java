import java.util.Iterator;
import java.util.LinkedHashSet;


public class Intersection2Arrays {
    public int[] intersection(int[] nums1, int[] nums2){
        //This will help us avoid duplicates in the answer for ex one array might contain Two 2's and the one one just has one 2. The inter
        //section should only include one 2
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        //start iterating over the first array
        for(int i = 0; i < nums1.length; i ++){
            int val = nums1[i];
            //check if the answer already has that value if it is then continue
            if(s.contains(val)) continue;
            //otherwise iterate over the second array
            for(int j = 0; j < nums2.length; j++){
                //if it exists in the second array then insert it into the ans
                if(nums2[j] == val){
                    s.add(val);
                }
             }
        }

        int[] ans = new int[s.size()];
        Iterator<Integer>  hs = s.iterator();
        for(int k = 0; k < ans.length; k++){
            ans[k] = hs.next();
         }

        return ans;
    }
    
}

