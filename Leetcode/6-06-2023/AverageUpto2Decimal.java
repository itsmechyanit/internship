public class AverageUpto2Decimal {
    String average(int A[], int N)
    {
        float avg = 0;
        
        
        int sum = 0;
        //finalAns stores the string representation of the float value
        String finalAns = "";
        //iterate over the array
        for(int i = 0; i < N; i++){
            //add the element to the existing sum
            sum = sum + A[i];
        }
        //convert the integer to float
        avg = (float)sum/N;
        
        //"5.0"
        //format the answer to 2 decimal places
        finalAns = String.format("%.2f", avg);

        
        //return finalAns
        return finalAns;
       
        
        
    }

    public static void main(String[] args) {
        AverageUpto2Decimal avg = new AverageUpto2Decimal();
        System.out.println("Testing the first test case");
        int[] num1 = {1,2,3,4,5};
        int n1 = 5;
        String ans1 = avg.average(num1, n1);
        System.out.println(ans1);

        System.out.println("Testing the second test case");
        int[] num2 = {2, 55, 85, 656, 52, 554, 545, 5, 2};
        int n2 = 9;
        String ans2 = avg.average(num2, n2);
        System.out.println(ans2);
    }
}
