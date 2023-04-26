public class TrailingZeros {

    public int trailingZeroes(int n) {
        //This question can be solved by finding the number of 5's in the given number
        int count5 = 0;
        if(n == 0) return count5;
        for(int i = 1; i <= n; i++){
            if(i % 5 == 0) {
                //if i is divisible by 5 we increase the count
                count5++;
                //We also need to take care of cases where i is 25 or 125 etc which has more than one 5
                int j = 25;
                while(i % j == 0){
                    count5++;
                    j = j * 5;
                }

            }
        }

        
        
        
        return count5;
          
      }
    
    public static void main(String[] args) {
        TrailingZeros tz = new TrailingZeros();
        System.out.println(tz.trailingZeroes(30));
    }
    
}
