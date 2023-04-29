public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                temp[idx] = nums1[i];
                i++;
                idx++;
            }

            else{
                temp[idx] = nums2[j];
                j++;
                idx++;
            }
        }

        while(i < m){
            temp[idx] = nums1[i];
            i++;
            idx++;
        }

        while(j < n){
            temp[idx] = nums2[j];
            j++;
            idx++;
        }

        for(int ii = 0; ii < m + n; ii++){
            nums1[ii] = temp[ii];
        }
        
    }
    
}
