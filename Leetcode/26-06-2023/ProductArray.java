public class ProductArray {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        //to hold the final ans
        long[] ans = new long[n];
        //start travering the array
        for(int i = 0; i < n; i++){
            int product = 1;
            //traverse the entire array for every i except i
            for(int j = 0; j < n; j++){
                //for self we need to continue
                if(j == i) continue;
                else{
                    product = product * nums[j];
                }
            }
            //store the product for every element
            ans[i] = product;
        }
        //return ans;
        return ans;
	} 

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        int n1 = 5;
        int nums1[] = {10, 3, 5, 6, 2};
        long ans1[] = productExceptSelf(nums1, n1);
        System.out.println("Here is the output");
        for(int i = 0; i < ans1.length; i++){
            System.out.print(ans1[i] + " ");
        }
        System.out.println();

        System.out.println("Testing the Second test case");
        int n2 = 2;
        int nums2[] = {12,0};
        long ans2[] = productExceptSelf(nums2, n2);
        System.out.println("Here is the output");
        for(int i = 0; i < ans2.length; i++){
            System.out.print(ans2[i] + " ");
        }
    }
}
