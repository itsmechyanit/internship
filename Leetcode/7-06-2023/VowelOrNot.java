public class VowelOrNot {

    static String isVowel(char c){
        //convert the character to lowercase 
        char ch = Character.toLowerCase(c);
        //compare the character's ASCII value with the vowels acii values
        //ascii(a) = 97, ascii(e) = 101 etc
        if(ch == 97 || ch == 101 || ch == 105 || ch == 111|| ch == 117){
            //return true if it matches
            return "YES";
        }
        //otherwise return false
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        char c1 = 'Z';
        System.out.println("Is the character " +c1+" a vowel: " + isVowel(c1));
        System.out.println("Testing the Second test case");
        char c2 = 'a';
        System.out.println("Is the character " +c2+" a vowel: " + isVowel(c2));
        
    }


}
