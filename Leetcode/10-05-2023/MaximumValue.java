import java.util.Scanner;

public class MaximumValue {
    public int maximumValue(String[] strs) {
        
        int maximum = Integer.MIN_VALUE;
        //traverse over string array
        for(String word: strs){
            int len = word.length();
            int j = 0;
            //traverse over individual string
            for(int i = 0; i < len; i++){
                char ch = word.charAt(i);
                //check if the character is a digit
                if(ch >=48 && ch <= 57){
                    j++;
                    continue;
                }
                //if it is not a digit
                else{
                    //check if the length is greater than the maximum length found so far
                    if(len > maximum){
                        maximum = len;
                        
                    }
                    break;
                }
                
            }
            //check if the string only consists of digits
            if(j == len){
                int temp = Integer.parseInt(word);
                if(temp > maximum) maximum = temp;
            }
        }
        
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify the individual strings in one line seperated by space");
        System.out.println("Below is an exmaple input with 4 strings");
        System.out.println("alic3 bob 3 4 00000");
        String words = sc.nextLine();
        MaximumValue mv = new MaximumValue();
        int ans = mv.maximumValue(words.split(" "));
        System.out.println("The maximum value of a string in an array is "+ ans);
        sc.close();

        
        // int n = sc.nextInt();
        // String[] input = new String[n];
        // System.out.println("Please enter the individual strings");
        // for(int i = 0; i < n; i++){
        //     String s = sc.nextLine();
        //     input[i] = s;
        // }

        // sc.nextLine();

        // MaximumValue mv = new MaximumValue();
        // int ans = mv.maximumValue(input);
        // System.out.println("The maximum value of a string in an array is "+ ans);
        // sc.close();
    }
}
