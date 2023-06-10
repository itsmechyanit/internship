import java.util.HashSet;

public class UniqueSubstring {
    public static int unique_substring(String str)
    {
        //use a hashset to filter out the duplicates
        HashSet<String> hs = new HashSet<>();
        
        //create all the possible sub string
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                hs.add(str.substring(i, j));
            }
        }
        //return the size of the hashset
        return hs.size();
    }

    public static void main(String[] args) {
       System.out.println("Testing out the first test case");
       String s1 = "abd";
       System.out.println("The total number of unique substrings are: " + unique_substring(s1));
       String s2 = "jaja";
       System.out.println("The total number of unique substrings are: " + unique_substring(s2));
    }

}
