public class AddBinaryNumbers {

    public String addBinary(String a, String b){
        int carry = 0;
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        String result = "";
        while(i >= 0 || j >=0){
            int sum = carry;
            if(i >= 0){
                char ch = a.charAt(i);
                sum = sum + Character.getNumericValue(ch);
                i--;
            }

            if(j >= 0){
                char ch = b.charAt(j);
                sum = sum + Character.getNumericValue(ch);
                j--;
            }

            carry = sum > 1 ? 1 :0;
            result = String.valueOf(sum % 2) + result;
        }

        if(carry == 1){
            result = "1" + result;
        }

        return result;

        
    }
    
}
