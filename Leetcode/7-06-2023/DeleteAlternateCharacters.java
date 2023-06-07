public class DeleteAlternateCharacters {
    static String delAlternate(String S){
        //ans will store the final ans
        String ans = "";
        //iterate over the string
        for(int i = 0; i < S.length(); i++){
            //if i is even then append the character to the ans
            if(i % 2 == 0){
                ans = ans + S.charAt(i);
            }
        }
        //return the ans
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        String S1 = "Geeks";
        System.out.println("Here is the string after deleting the characters at odd index: " + delAlternate(S1));
        System.out.println("Testing the Second test case");
        String S2 = "GeeksforGeeks";
        System.out.println("Here is the string after deleting the characters at odd index: " + delAlternate(S2));
    }
}
