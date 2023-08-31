import java.util.HashMap;

public class Anagram {
      public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        //if the length  of the 2 strings are not equal then they cannot be Anagrams
        if(a.length() != b.length()){
            return false;
        }
        //Hashmap to map the character with its frequency
        HashMap<Character, Integer> hm = new HashMap<>();
        //traverse the first string and then map the character with its frequency
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch) + 1);
            }

            else{
                hm.put(ch, 1);
            }
        }
        //traverse the second string
        for(int i = 0; i < b.length(); i++){
            char ch = b.charAt(i);
            //if the key is present then decrement the frequncy by 1
             if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch) - 1);
            }
            //if the key is not present then the strings cannot be anagrams
            else{
                return false;
            }
        }
        //iterate over the keys and check the corresponding value
        for(Character key: hm.keySet()){
            //if we find a key with a non zero value then the 2 strings are not anagrams
            if(hm.get(key) != 0){
                return false;
            }
        }

        return true;
        
    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        String a1 = "geeksforgeeks";
        String b1 = "forgeeksgeeks";
        System.out.println("Are the 2 strings Anagrams: " +isAnagram(a1, b1));
        System.out.println("Testing the Second test case");
        String a2 = "allergy";
        String b2 = "allergic";
        System.out.println("Are the 2 strings Anagrams: " +isAnagram(a2, b2));
    }
}
