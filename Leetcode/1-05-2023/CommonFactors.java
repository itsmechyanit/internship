public class CommonFactors {
    public int commonFactors(int a, int b) {
        //Find out the smaller number
        int min = a > b ? b :a;
        int count = 0;
        //start iterating till the smaller number and find all the common factors
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0) count++;
        }
        
        return count;
    }
}
