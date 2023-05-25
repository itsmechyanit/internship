public class DetectCaptial {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1){
            return true;
        }
        //get the first character
        char first = word.charAt(0);
        //if it is a capital letter
        if(Character.isUpperCase(first)){
            //if it is a capital letter than
            //either all the letters are capital 
            char second = word.charAt(1);
            if(Character.isUpperCase(second)){
                //now every thing should be capital
                int capIdx = 2;
                while(capIdx < word.length()){
                    char ch = word.charAt(capIdx);
                    //if not then return false
                    if(!Character.isUpperCase(ch)){
                        return false;
                    }

                    capIdx++;

                }
            }
            else{
                //or all the remaining letters are small
                int smallIdx = 2;
                while(smallIdx < word.length()){
                    char ch = word.charAt(smallIdx);
                    //if not then return false
                    if(!Character.isLowerCase(ch)){
                        return false;
                    }

                    smallIdx++;

                }
            }
            
        }
        //if the first letter is small
        else{
            //everything should be lower
            int k = 1;
            while(k < word.length()){
                char ch = word.charAt(k);
                if(Character.isUpperCase(ch)){
                    return false;
                } 
                
                k++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        DetectCaptial dc = new DetectCaptial();
        System.out.println("Testing out the first Test Case");
        String s1 = "USA";
        System.out.println("Is the usage of capitals in the word "+ s1 +" correct: " + dc.detectCapitalUse(s1));
        System.out.println("Testing out the Second Test Case");
        String s2 = "FLag";
        System.out.println("Is the usage of capitals in the word "+ s2 +" correct: " + dc.detectCapitalUse(s2));
    }
}
