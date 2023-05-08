
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
class Pair{
    char ch;
    int frequency;
    Pair(char ch, int frequency){
        this.ch = ch;
        this.frequency = frequency;
    }
   
}

public class SortCharByFrequency {

    public String frequencySort(String s) {
        HashMap<Character, Integer>hm = new HashMap<>();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }
            else{
                hm.put(c, 1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            new Comparator<Pair>() {
                public int compare(Pair o1, Pair o2) {
                    if(o2.frequency > o1.frequency) return 1;
                    else if (o1.frequency > o2.frequency) return -1;
                    else{
                        return 0;
                    }

                }
            }
         );

         for (Map.Entry<Character,Integer> entry : hm.entrySet()){
            char k = entry.getKey();
            int val = entry.getValue();
            Pair obj = new Pair(k, val);
            pq.add(obj);
         }

         while(!pq.isEmpty()){
            Pair largest = pq.poll();
            char ch = largest.ch;
            int charCount = largest.frequency;
            for(int i = 1; i <= charCount; i++){
                ans = ans + ch;
            }
         }

         return ans;
            
    }

    public static void main(String[] args) {
        SortCharByFrequency sc = new SortCharByFrequency();
        String output = sc.frequencySort("ccaaaa");
        System.out.println(output);
    }
    
}
