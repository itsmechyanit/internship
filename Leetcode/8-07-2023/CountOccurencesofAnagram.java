public class CountOccurencesofAnagram {
  //helper function to check if all the elements in an array are zero
  boolean allZeros(int[] frequency){
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != 0){
                return false;
            }
        }
        
        return true;
    }

    int search(String pat, String txt) {
        // code here
        int k = pat.length();
        int i = 0;
        int j = 0;
        int result = 0;
        int[] frequency = new int[26];
        //get the frequency count of each character in the pattern string
        for(int idx = 0; idx < pat.length(); idx++){
            char ch = pat.charAt(idx);
            frequency[ch - 'a'] += 1;
        }
        //start iterating over the text string
        while(j < txt.length()){
            //get the character at index j
            char ch = txt.charAt(j);
            //decrement the frequency count of the character at index j
            frequency[ch - 'a']--;
            //if the window size is equal to the pattern length then we have a candidtate for an anagram
            if(j -i + 1 == k){
                //check if the frequency array has all zeros
                if(allZeros(frequency)){
                    //increment the result
                    result++;
                }
                //increment the frequency count of the character at index i
                frequency[txt.charAt(i) - 'a']++;
                //increment i
                i++;
            }
            //increment j
            j++;
        }
        
        return result;
    }

    public static void main(String[] args) {
      CountOccurencesofAnagram ca1 = new CountOccurencesofAnagram();
      System.out.println("Testing out the first test case");
      String txt1 = "forxxorfxdofr";
      String pat1 = "for";
      System.out.println("The number of Anagrams are: " + ca1.search(pat1, txt1));
      System.out.println("Testing out the Second test case");
      String txt2 = "aabaabaa";
      String pat2 = "aaba";
      System.out.println("The number of Anagrams are: " + ca1.search(pat2, txt2));
    }
}
