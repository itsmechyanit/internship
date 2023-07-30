
interface in1
{
    void display(int p);
}


class testClass implements in1
{
  //implementing the display method in the class
  public void display(int k)
    {   
        // Add your code here.
        int totalPrime = 0;
        
        
        for(int i = 2; i <=k; i++){
            if(isPrime(i)){
                totalPrime++;
            }
        }
        
        System.out.println(totalPrime);
    }
    
    public boolean isPrime(int i){
        if(i == 2 || i == 3){
            return true;
        }
        
        for(int p = 2; p <= i/2; p++){
            if(i % p == 0){
                return false;
            }
        }
        
        return true;
    }
}





public class Javainterface {
  public static void main(String[] args) {
    testClass tc = new testClass();
    System.out.println("Testing out the first test case");
    int n1 = 13;
    System.out.println("The number of prime numbers are");
    tc.display(n1);
    System.out.println("Testing out the Second test case");
    int n2 = 19;
    System.out.println("The number of prime numbers are");
    tc.display(n2);
    
  
  }
}
