public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        //if s1 is bigger then s2 cannot contain s1
        if(s1.length() > s2.length()){
            return false;
        }
        //create two arrays where characters will be mapped to an index for eg char a is index 0
        int[] s1a = new int[26];
        int[] s2a = new int[26];
        int matches = 0;
        //fill the first array
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            int index = ch - 'a';
            s1a[index] = s1a[index] + 1;
            
        }
        //fill the 2nd array
        for(int i = 0; i < s1.length(); i++){
            char ch = s2.charAt(i);
            int index = ch - 'a';
            
            s2a[index] = s2a[index] + 1;
        }



        
        //count all the equal elements in both the array
        for(int i = 0; i < 26; i++){
            if(s1a[i] == s2a[i]){
                matches++;
            }
        }
        //if matches == 26 then there is a permutation
        if(matches == 26){
            return true;
        }
        //otherwise reset matches to zero and the second array with all elements as zero
        matches = 0;
        s2a = new int[26];


        //iterate over s2 one character at a time
        for(int i = 1; i <= s2.length() - s1.length(); i++){
            //get the substring of length equal to s1
            String sub = s2.substring(i, i + s1.length());
            //repeat the process as above
            for(int j = 0; j < sub.length(); j++){
                char chr = sub.charAt(j);
                int index = chr - 'a';
            
                s2a[index] = s2a[index] + 1;

            }
            //count the total number of equal characters
            for(int idx = 0; idx < 26; idx++){
                if(s1a[idx] == s2a[idx]){
                    matches++;
                }
            }
            //return true if matches == 26
            if(matches == 26){
                return true;
            }
            //reset matches and the 2nd array
            s2a = new int[26];
            matches = 0;




        }

        return false;



        
        
    }

    public static void main(String[] args) {
        PermutationInString pins = new PermutationInString();
        System.out.println("Testing the first test case");
        String s11= "ab";
        String s12 = "eidbaooo";
        System.out.println("Does " + s12 +" contains a permutation of " + s11+": " + pins.checkInclusion(s11, s12));
        System.out.println("Testing the second test case");
        String s21= "ab";
        String s22 = "eidboaoo";
        System.out.println("Does " + s22 +" contains a permutation of " + s21+": " + pins.checkInclusion(s21, s22));
    }
    
}
