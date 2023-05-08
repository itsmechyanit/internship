public class IsPrefixOfWord {

    public int isPrefixOfWord(String sentence, String searchWord) {
        
        //split the sentence into words
        String[] words = sentence.split(" ");
        
        //traverse all the words
        for(int i = 0; i < words.length; i++){
            //only check the word if the word starts with the first prefix charater
            if(words[i].charAt(0) == searchWord.charAt(0)){
                //if the prefix is at the begining of the word
                if(words[i].indexOf(searchWord) == 0){
                    return i + 1;
                }
            }
        }
        
        return -1;
        
    }

    
}
