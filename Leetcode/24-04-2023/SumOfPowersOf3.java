public class SumOfPowersOf3 {

    public boolean checkPowersOfThree(int n) {

        //3 ^ 14 is slightly lesser than 10^7 so we will start from there

        for(int i = 14; i >= 0; i--){
            //calculate 3^i
            //Math.pow returns a decimal value so we need to cast it
            int temp = (int)Math.pow(3, i);
            //if temp > n we won't consider it
            //else we will reduce n until it becomes zero or negative
            //if negative the number cannot be written
            //if zero then that is the solution
            
            if(n - temp >= 0){
                n = n - temp;
            }
            if(n == 0) return true;
        }

        return false;

        
    }
    
}
