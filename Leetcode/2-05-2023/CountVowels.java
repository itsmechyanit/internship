public class CountVowels{
    // ArrayList<String> s = new ArrayList<>();
    // Set<Character> vowels = new LinkedHashSet<>();

    // public long countVowels(String word) {
    //     vowels.add('a');
    //     vowels.add('e');
    //     vowels.add('i');
    //     vowels.add('o');
    //     vowels.add('u');
    //     int wordLen = word.length();
    //     long ans = 0;
    //     for(int i = 0; i < wordLen; i++){
    //         String w = "";
    //         for(int j = i; j < wordLen; j++){
    //             w = w + word.charAt(j);
    //             s.add(w);
    //         }
    //     }

    //     for(String substr: s){
    //         for(int i = 0; i < substr.length(); i++){
    //             if(vowels.contains(substr.charAt(i))){
    //                 ans++;
    //             }
    //         }
    //     }

    //     return ans;


    // }

    public long countVowels(String word){
        //This needs some maths
        long len = word.length();
        long ans = 0;
        //iterate over the string and if it is a vowel check how many substring will have that letter
        for(int i = 0; i < len; i++){
            if("aeiou".indexOf(word.charAt(i)) >= 0){
                //The character at pos i will have i + 1 choices on the left and (len - i) choices on the right
                ans = ans + (i + 1) * (len - i);
            }
        }

        return ans;
    }
}
