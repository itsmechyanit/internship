import java.util.HashMap;
public class NumToWords {

    int[] range = {1000000000, 1000000, 1000, 100};
    String[] eng = {"Billion", "Million", "Thousand", "Hundred"};
    HashMap<Integer, String> symbol;

    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        symbol = new HashMap<>();
        //This will fill the hashmap
        fillSymbol(symbol);
        return numberToWord(num);
        
    }

    public String numberToWord(int num) {
        StringBuilder sb = new StringBuilder();
        //base case
        if(symbol.containsKey(num)) return symbol.get(num);
        
        if(num < 100){
            //num is 80 below line will convert 80 to Eighty
            sb.append(numberToWord(num/10 * 10));
            sb.append(" ");
            sb.append(numberToWord(num % 10));
        }

        else{
            for(int i = 0; i < 4; i++){
                //if num is 12345 no point in diving it by 1 billion
                if(num < range[i]) continue;
                //The line below will return Twelve
                sb.append(numberToWord(num/range[i]));
                sb.append(" ");
                //The line below will return Thousand
                sb.append(eng[i]);
                sb.append(" ");
                //This will return Three Hundered Forty Five
                sb.append(numberToWord(num % range[i]));
                break;
            }
        }

        return sb.toString().trim();
        
    }

    public void fillSymbol(HashMap<Integer, String> symbol){
        symbol.put(0, "_");
        symbol.put(1, "One");
        symbol.put(2, "Two");
        symbol.put(3, "Three");
        symbol.put(4, "Four");
        symbol.put(5, "Five");
        symbol.put(6, "Six");
        symbol.put(7, "Seven");
        symbol.put(8, "Eight");
        symbol.put(9, "Nine");
        symbol.put(10, "Ten");
        symbol.put(11, "Eleven");
        symbol.put(12, "Twelve");
        symbol.put(13, "Thirteen");
        symbol.put(14, "Fourteen");
        symbol.put(15, "Fifteen");
        symbol.put(16, "Sixteen");
        symbol.put(17, "Seventeen");
        symbol.put(18, "Eighteen");
        symbol.put(19, "Nineteen");
        symbol.put(20, "Twenty");
        symbol.put(30, "Thirty");
        symbol.put(40, "Forty");
        symbol.put(50, "Fifty");
        symbol.put(60, "Sixty");
        symbol.put(70, "Seventy");
        symbol.put(80, "Eighty");
        symbol.put(90, "Ninety");
    }
}