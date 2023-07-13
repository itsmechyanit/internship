//We will be using Trie datastructure to solve this problem

class TrieNode{
    char data;
    TrieNode[] children = new TrieNode[26];
    boolean isTerminal = false;
    int numChild = 0;
    TrieNode(char val){
        data = val;
    }
    
}

class Trie{
    TrieNode root = new TrieNode('\0');
    //helper function to insert a word in the trie datastructure
    void insertHelper(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminal = true;
            return;

        }

        int  index = word.charAt(0) - 'a';

        if(root.children[index] != null){
            insertHelper(root.children[index], word.substring(1));
        }

        else{
            TrieNode newNode = new TrieNode(word.charAt(0));
            root.children[index] = newNode;
            root.numChild++;
            insertHelper(root.children[index], word.substring(1));
        }

    }
    void insert(String word){
        insertHelper(root, word);
    }
    //this function is optional and is not required for the question
    //However this can be used to find a word in the trie
    boolean searchHelper(TrieNode root, String word){
        if(word.length() == 0){
            return root.isTerminal;
        }

        int index = word.charAt(0) - 'a';
        if(root.children[index] != null){
            return searchHelper(root.children[index], word.substring(1));
        }
        else{
            return false;
        }
    }

    boolean search(String word){
        return searchHelper(root, word);
    }
     //helper function to find the longestCommonPrefix
     void longestCommonPrefixHelper(TrieNode root, String first, StringBuilder ans){
        //base case
        //if root is null simply return
        if(root == null){
          return;
        }
        if(root.isTerminal || first.length() == 0){
            return;
        }
        //if the root has one child this means that all the words start with the same character
        if(root.numChild == 1){
         //get the character
          char ch = first.charAt(0);
          //get the index of the root's child
          int index = ch - 'a';
          root = root.children[index];
          //add the character to the answer
         ans.append(ch);
          //recursively call the method on the root's child
          longestCommonPrefixHelper(root, first.substring(1), ans);
        }
        //break whenevr we encouter the situation when the current node has more than one children
        //This means that the current character is not part of the longest commonprefix
        else{
            return;
        }
     }
}


public class LongestCommonPrefix {

  String longestCommonPrefix(String arr[], int n){
        // code here
        Trie t = new Trie();
        //insert the words in the trie
        for(String word: arr){
          t.insert(word);
        }

        String first = arr[0];
        StringBuilder ans = new StringBuilder();
        t.longestCommonPrefixHelper(t.root, first, ans);
        String finalAns = ans.toString();
        //if there is no LCP then return -1
        if(finalAns.equals("")){
            return "-1";
        }
        //otherwise return ans
        else{
            return finalAns;
        }

    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp1 = new LongestCommonPrefix();
        System.out.println("Testing the first testcase");
        int N1 = 4;
        String arr1[] = {"geeksforgeeks", "geeks", "geek",
         "geezer"};
        String ans1 = lcp1.longestCommonPrefix(arr1, N1);
        System.out.println("The longest commonprefix is: " + ans1);
         LongestCommonPrefix lcp2 = new LongestCommonPrefix();
         System.out.println("Testing the first testcase");
        int N2 = 4;
        String arr2[] = {"hello", "world"};
        String ans2 = lcp2.longestCommonPrefix(arr2, N2);
        System.out.println("The longest commonprefix is: " + ans2);
        
    }

  

  
}
