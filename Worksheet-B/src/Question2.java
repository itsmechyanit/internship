
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Question2{
    private static boolean hasVowel(String text){
        if(text == null || text.length() == 0)return false;
        Set<Character> s = new HashSet<>();
        s.add('a');s.add('e');s.add('i'); s.add('o');s.add('u');
        s.add('A');s.add('E');s.add('I'); s.add('O');s.add('U');
        for(int i = 0; i < text.length();i++){
            char ch = text.charAt(i);
            if(s.contains(ch)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a text and then we will test whether it has a vowel or not");
        String text = sc.nextLine();

        boolean ans = hasVowel(text);
        if(ans == true){
            System.out.println("The vowel is present in the given string");
        }

        else System.out.println("The vowel is not present");
        
        sc.close();

    }
}