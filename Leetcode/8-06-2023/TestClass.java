import java.util.Scanner;

interface in1{
    void display(int p);
}
public class TestClass implements in1 {
    //TestClass Implements the in1 interface
    public void display(int k){
        int count = 0;
        if(k <= 1){
            System.out.println(count);
        }

        //iterate from 2 to p since we need the number of primes between 2 to p
        for(int i = 2; i <= k; i++){
            if(isPrime(i)){
                count++;
            }
        }

        System.out.println(count);
    }
    //helper function to determine if a given no is prime or not
    public boolean isPrime(int n){
        if(n == 2 || n == 3 || n == 5){
            return true;
        }
        //check if a factor exists then it is not a prime number
        for(int i = 2; i < n/2; i++){
            if(i % n == 0){
                return false;
            }
        }
        //otherwise return true;
        return true;
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        t = sc.nextInt();
        while(t-->0){
            System.out.println("Please enter the number for which you want to find the total number of prime numbers");
            int k = sc.nextInt();
            TestClass p = new TestClass();
            System.out.println("The total number of prime numbers are");
            p.display(k);
        }

        sc.close();
    }
}
