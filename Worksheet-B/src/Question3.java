import java.util.ArrayList;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Question3 {
    
    private static void removeDuplicates(ArrayList<Integer> al){
        if(al == null || al.size() == 0) return;
        Set <Integer> seen = new HashSet<>();
        for(int i = 0; i < al.size(); i++){
            if(seen.contains(al.get(i))){
                //There is a duplicate and we will need to remove it
                al.remove(i);
                i--;
            }

            else{
                seen.add(al.get(i));
            }
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("please enter the number of elements that you want to store in your array list");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the element that you want to store");
        for(int i = 0; i < n; i++){
            
            int temp = sc.nextInt();
            al.add(temp);

        }

        System.out.println("Removing the duplicate values from the arrayList");
        removeDuplicates(al);
        System.out.println("Array list after removing the duplicate elements " + al);
        sc.close();
    }
}
