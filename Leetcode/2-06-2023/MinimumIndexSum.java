import java.util.ArrayList;

import java.util.LinkedHashMap;

public class MinimumIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2){
        //ans will hold the minimum sum index of common strings
        int ans = Integer.MAX_VALUE;
        //finalAnswer will hold the common string with the minimum sum index
        ArrayList<String> finalAnswer = new ArrayList<>();
        //We are using LinkedHashMap to maintain the insertion order in the map
        //LinkedHashMaps are used to store the strings and its index
        LinkedHashMap<String, Integer>l1 = new LinkedHashMap<String, Integer>();
        LinkedHashMap<String, Integer>l2 = new LinkedHashMap<String, Integer>();
        //fill the first hashMap
        for(int i = 0; i < list1.length; i++){
            String temp = list1[i];
            l1.put(temp, i);
        }

        //Fill the 2nd Hashmap
        for(int i = 0; i < list2.length; i++){
            String temp = list2[i];
            l2.put(temp, i);
        }
        
        //iterate the keys of the first hashmap, Here keys are the strings
        for(String word: l1.keySet()){
            //if the key exist in the 2nd Hashmap it means it is the common string
            if(l2.containsKey(word)){
                int idx1 = l1.get(word);
                int idx2 = l2.get(word);
                //get the sum of the index and if it is less than the ans then update ans
                if(idx1 + idx2 <= ans){
                    ans = idx1 + idx2;
                    
                }
            }
        }
        //iterate the keys of the first hashmap, Here keys are the strings
        
        for(String word: l1.keySet()){
            //if the key exist in the 2nd Hashmap it means it is the common string
            if(l2.containsKey(word)){
                int idx1 = l1.get(word);
                int idx2 = l2.get(word);
                //check if the index sum is equal to ans and if it is then add it to the arrayList
                //ans hold the sum of the minimum index of the common string
                if(idx1 + idx2 == ans){
                    finalAnswer.add(word);
                    
                }
            }
        }
        //iterate over the array list and store the strings in the string array
        String[] finalAnswerArray = new String[finalAnswer.size()];
        int idx = 0;

        for(String word: finalAnswer){
            finalAnswerArray[idx] = word;
            idx++;
        }
        //return the string array
        return finalAnswerArray;     
    }

    public static void main(String[] args) {
        MinimumIndexSum mis = new MinimumIndexSum();
        System.out.println("Testing out the first test case");
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] ans1 = mis.findRestaurant(list1, list2);
        System.out.print("The common string are ");
        for(int i = 0; i < ans1.length; i++){
            System.out.print(ans1[i] + " ");
        }

        System.out.println();

        System.out.println("Testing out the second test case");
        String[] list3 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list4 = {"KFC","Shogun","Burger King"};
        String[] ans2 = mis.findRestaurant(list3, list4);
        System.out.print("The common string are ");
        for(int i = 0; i < ans2.length; i++){
            System.out.print(ans2[i] + " ");
        }

        System.out.println();

        System.out.println("Testing out the third test case");
        String[] list5 = {"happy","sad","good"};
        String[] list6 = {"sad","happy","good"};
        String[] ans3 = mis.findRestaurant(list5, list6);
        System.out.print("The common string are ");
        for(int i = 0; i < ans3.length; i++){
            System.out.print(ans3[i] + " ");
        }
    }

    
}
