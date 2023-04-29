import java.util.List;
import java.util.ArrayList;
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> ans = new ArrayList<>();
        for(int i = 1; i <= n; i++ ){
            if(i % 15 == 0){
                ans.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                ans.add("Fizz");
            }

            else if(i % 5 == 0){
                ans.add("Buzz");
            }
            else{
                String val = Integer.toString(i);
                ans.add(val);
            }
        }

        return ans;
        
    }

    
    
}
