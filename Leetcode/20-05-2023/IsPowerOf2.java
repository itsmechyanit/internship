public class IsPowerOf2 {
    public boolean isPowerOfTwo(int n) {
        //store the n in a temp variable
        int temp = n;
        //if temp is zero then return false
        if(temp == 0){
            return false;
        }
        //continue dividing the number with 2
        while(temp % 2 == 0){
            temp = temp/2;
        }
        //if the number becomes one then return true
        if(temp == 1){
            return true;
        }
        //otherwise return false;
        return false;

        
        
    }

    public static void main(String[] args) {
        IsPowerOf2 ip2 = new IsPowerOf2();
        System.out.println("Testing the first test case");
        int n1 = 1;
        System.out.println("is "+n1 +" power of 2: " + ip2.isPowerOfTwo(n1));
        System.out.println("Testing the Second test case");
        int n2 = 16;
        System.out.println("is "+n2 +" power of 2: " + ip2.isPowerOfTwo(n2));

        System.out.println("Testing the Third test case");
        int n3 = 3;
        System.out.println("is "+n3 +" power of 2: " + ip2.isPowerOfTwo(n3));

    }
}
