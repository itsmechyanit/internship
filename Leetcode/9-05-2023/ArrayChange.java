
import java.util.HashMap;


public class ArrayChange {
    public int[] arrayChange(int[] nums, int[][] operations) {
        //We will use hashmap to store the array element and its position
        HashMap<Integer, Integer>hm = new HashMap<>();
        //iterate over the array and store the element and its index in the hashmap
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
        }
        //rows represents the number of operations
        int rows = operations.length;
        
        for(int i = 0; i < rows; i++){
            //the value that we have to replace
            int val = operations[i][0];
            //get the index of the value
            int idx = hm.get(val);
            int replace_with = operations[i][1];
            nums[idx] = replace_with;
            //add the new value to the map
            hm.put(replace_with, idx);
            //remove the old value
            hm.remove(val);
            
        }

        return nums;
    }

    public static void main(String[] args) {
        ArrayChange ac = new ArrayChange();
        int[] nums1 = {1,2,4,6};
        int[][] operations1 = {{1,3},{4,7}, {6,1}};
        ac.arrayChange(nums1, operations1);
        System.out.println("Printing the array after performing the operations");
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println("Now we will work on the 2nd test case");

        int[] nums2 = {1,2};
        int[][] operations2 = {{1,3},{2,1}, {3,2}};
        ac.arrayChange(nums2, operations2);
        System.out.println("Printing the array after performing the operations");
        for(int i = 0; i < nums2.length; i++){
            System.out.print(nums2[i] + " ");
        }

    }
    
}
