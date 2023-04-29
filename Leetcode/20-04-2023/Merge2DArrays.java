import java.util.ArrayList;
public class Merge2DArrays {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2){
            if(nums1[i][0] < nums2[j][0]){
                ArrayList<Integer>t = new ArrayList<Integer>();
                t.add(nums1[i][0]);
                t.add(nums1[i][1]);
                temp.add(t);
                i++;
            }

            else if(nums1[i][0] > nums2[j][0]){
                ArrayList<Integer>t = new ArrayList<Integer>();
                t.add(nums2[j][0]);
                t.add(nums2[j][1]);
                temp.add(t);
                j++;
            }

            else{
                ArrayList<Integer>t = new ArrayList<Integer>();
                 t.add(nums1[i][0]);
                 t.add(nums1[i][1] + nums2[j][1]);
                 temp.add(t);
                 i++;
                 j++;

            }
        }

        while(i < len1){
                ArrayList<Integer>t = new ArrayList<Integer>();
                t.add(nums1[i][0]);
                t.add(nums1[i][1]);
                temp.add(t);
                i++;
        }

        while(j < len2){
                ArrayList<Integer>t =new ArrayList<Integer>();
                t.add(nums2[j][0]);
                t.add(nums2[j][1]);
                temp.add(t);
                j++;
        }

        int finalLength = temp.size();
        int[][] ans = new int[finalLength][2];
        for(int idx = 0; idx < finalLength; idx++){
            ArrayList<Integer> a = temp.get(idx);
            ans[idx][0] = a.get(0);
            ans[idx][1] = a.get(1);

        }
        
        return ans;
        
    }
    
}
