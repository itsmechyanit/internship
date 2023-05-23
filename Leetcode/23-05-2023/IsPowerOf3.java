public class IsPowerOf3 {

    public boolean isPowerOfThree(int n){
        //if n is zero then return false
        if(n == 0) return false;
        int temp = n;
        //otherwise carry on dividing the number by n
        while(temp % 3 == 0){
            temp = temp/3;
        }
        //if the number becomes 1 then it is a power of 3
        if(temp == 1){
            return true;
        }
        //otherwise it is not a power of 3
        return false;
    }

    public static void main(String[] args) {
        IsPowerOf3 ip3 = new IsPowerOf3();
        System.out.println("Testing the first test case");
        int n1 = 27;
        System.out.println("Is " + n1+" power of 3: " + ip3.isPowerOfThree(n1));

        System.out.println("Testing the Second test case");
        int n2 = 0;
        System.out.println("Is " + n2+" power of 3: " + ip3.isPowerOfThree(n2));

        System.out.println("Testing the Third test case");
        int n3 = 9;
        System.out.println("Is " + n3+" power of 3: " + ip3.isPowerOfThree(n3));

        System.out.println("Testing the fourth test case");
        int n4 = 45;
        System.out.println("Is " + n4+" power of 3: " + ip3.isPowerOfThree(n4));
    }
    
}
