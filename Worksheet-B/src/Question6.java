import java.util.LinkedList;
import java.util.Scanner;

public class Question6 {

    private static LinkedList<Integer> merge(LinkedList<Integer> first, LinkedList<Integer> second){
        LinkedList<Integer> sorted = new LinkedList<>();
        if(first.size() == 0 && second.size() == 0) return sorted;

        else if(first.size() == 0){
            for(int i = 0; i < second.size(); i++){
                sorted.add(second.get(i));
            }
            return sorted;
        }

        else if(second.size() == 0){

            for(int i = 0; i < first.size(); i++){
                sorted.add(first.get(i));
            }
            return sorted;

        }

        else{

            int i = 0;
            int j = 0;
            while(i < first.size() && j < second.size()){
                if(first.get(i) < second.get(j)){
                    sorted.add(first.get(i));
                    i++;
                }

                else{
                    sorted.add(second.get(j));
                    j++;
                }
                // else if(second.get(j) < first.get(i)){
                //     sorted.add(second.get(j));
                //     j++;

                // }
                // else{
                //     sorted.add(first.get(i));
                //     sorted.add(second.get(j));
                //     i++;
                //     j++;

                // }
            }

            while(i < first.size()){
                sorted.add(first.get(i));
                i++;
            }

            while (j < second.size()){
                sorted.add(second.get(j));
                j++;
            }

            return sorted;
            
        }

    }

    public static void main(String[] args) {
        LinkedList <Integer> f = new LinkedList<>();
        LinkedList <Integer> s = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the first sorted linked list");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the elements in the first linked list. Make sure the linked list is sorted");
        for(int i = 0; i < n1; i++){
            int temp = sc.nextInt();
            f.add(temp);
        }

        sc.nextLine();

        System.out.println("Please enter the number of elements in the second sorted linked list");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the elements in the second linked list. Make sure the linked list is sorted");
        for(int i = 0; i < n2; i++){
            int temp = sc.nextInt();
            s.add(temp);
        }

        System.out.println("Merging the 2 sorted linked list into one");

        LinkedList <Integer> sorted = merge(f, s);

        for(int i = 0; i < sorted.size(); i++){
            System.out.print(sorted.get(i) + " ");
        }

       

        sc.close();
    }
    
}
