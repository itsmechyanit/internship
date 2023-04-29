import java.util.Arrays;
public class NextPermutation {

    public void nextPermutation(int[] nums){

        int infpt = 0;
        int minimum = Integer.MAX_VALUE;
        int minIdx = infpt;
        //7 2 5 3 1 ---> 7 3 1 2 5
        for(int i = nums.length - 1; i > 0; i--){
            //inflection point where the strictly non decreasing sequence breaks
            if(nums[i] > nums[i - 1]){
                infpt = i;
                break;
            }
        }
        //if there is no such point then sort the complete array
        if(infpt == 0){
            Arrays.sort(nums, 0, nums.length);
        }
        else{
            //find the next biggest number adjacent to the inflection point
            int toSwap = nums[infpt - 1];

            for(int i = infpt; i < nums.length; i++){
                //find the next biggest number
                if(nums[i] - toSwap > 0){
                    if(nums[i] - toSwap < minimum){
                        minIdx = i;
                    }
                }
            }
            //swap the next biggest number with the element adjacent to the inflection point
            int temp = nums[infpt - 1];
            nums[infpt -1] = nums[minIdx];
            nums[minIdx] = temp;
            //sort the array from the inflection point to the end
            Arrays.sort(nums, infpt, nums.length);
        }

    }
    
}
