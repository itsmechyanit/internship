import java.util.HashMap;

public class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        // your code here
        //hashmap to store the count of each array element
        HashMap<Integer, Integer> frequency = new HashMap<>();
        //if the array contains one element then that is the majority element
        if(size == 1){
            return a[0];
        }
        //fill the hashmap
        for(int i = 0; i < a.length; i++){
            if(frequency.containsKey(a[i])){
                frequency.put(a[i], frequency.get(a[i]) + 1);
            }
            else{
                frequency.put(a[i], 1);
            }
        }
        //iterate over the hashmap and get the key
        for(Integer key: frequency.keySet()){
            //if it is greater than 1 and also greater than size/2 then it is the majority element
            if(frequency.get(key) > 1 && frequency.get(key) > size/2){
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        int n1 = 3;
        int a1[] = {1,2,3};
        System.out.println("The majority element is: " + majorityElement(a1, n1));
        System.out.println("Testing the second test case");
        int n2 = 5;
        int a2[] = {3,1,3,3,2};
        System.out.println("The majority element is: " + majorityElement(a2, n2));

    }
}
