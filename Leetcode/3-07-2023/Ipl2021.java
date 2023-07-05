import java.util.ArrayList;

import java.util.Comparator;
import java.util.PriorityQueue;

//custom class

class ElementWithIndex{
  int val;
  int index;
  ElementWithIndex(int data, int i){
    val = data;
    index = i;
  }
}

public class Ipl2021 {

     static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        //We are using the priorityqueue datastructure
        //We are using the max heap priority queue
        //We are also implementing the comparator interface to sort the custom object based on its data
        PriorityQueue<ElementWithIndex> pq = new PriorityQueue<>(new Comparator<ElementWithIndex>() {
                public int compare(ElementWithIndex e1, ElementWithIndex e2) {
                    if(e2.val > e1.val) return 1;
                    else if (e1.val > e2.val) return -1;
                    else{
                        return 0;
                    }

                }
            });
        //ans to hold the max value of every window
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        //insert the first k elements to the priorityQueue
        //This forms our first window
        for(; i < k; i++){
          ElementWithIndex ei = new ElementWithIndex(arr[i], i);
          pq.add(ei);
        }
        //get the maximum of the first window and store it in the answer
        ans.add(pq.peek().val);
        //start iterating over the array
        
        for(; i <n; i++){
          //make sure that the current element is part of our current window
          while(!pq.isEmpty() && pq.peek().index < i -k + 1){
            pq.remove();

          }
          //add the current element to our window
          pq.add(new ElementWithIndex(arr[i], i));
          //get the max of our current window
          ans.add(pq.peek().val);
          
          
        }

        return ans;
    }

    public static void main(String[] args) {
      System.out.println("Testing the first test case");
      int n1 = 9;
      int k1 = 3;
      int arr1[] = {1,2,3,1,4,5,2,3,6};
      ArrayList<Integer> ans1 = max_of_subarrays(arr1, n1, k1);
      System.out.println("Here is the output");
      for(Integer i : ans1){
        System.out.print(i + " ");
      }

      System.out.println();

      System.out.println("Testing the first test case");
      int n2 = 10;
      int k2 = 4;
      int arr2[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
      ArrayList<Integer> ans2 = max_of_subarrays(arr2, n2, k2);
      System.out.println("Here is the output");
      for(Integer i : ans2){
        System.out.print(i + " ");
      }
    }

    
  
}
