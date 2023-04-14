import java.util.LinkedList;
import java.util.Scanner;

public class Question4 {

    private static LinkedList<Integer> intersection(LinkedList<Integer> first, LinkedList<Integer> second){
        LinkedList<Integer> third = new LinkedList<>();
        if(first.size() == 0) return third;

        else if(second.size() == 0) return third;

        else{
            for(int i = 0; i < first.size(); i++){
                int val = first.get(i);
                if(second.contains(val)){
                    third.add(val);
                }
            }

            return third;
        }
    }

    private static LinkedList<Integer> union(LinkedList<Integer> first, LinkedList<Integer> second){
        LinkedList<Integer> third = new LinkedList<>();
        if(first.size() == 0 && second.size() == 0) return third;

        else if(first.size() == 0){
            for(int i = 0; i < second.size(); i++){
                third.add(second.get(i));
            }
            return third;
        } 

        else if(second.size() == 0){

            for(int i = 0; i < first.size(); i++){
                third.add(first.get(i));
            }
            return third;

        }

        else{
            
            for(int i = 0; i < first.size(); i++){
                third.add(first.get(i));
            }

            for(int i = 0; i < second.size(); i++){
                if(third.contains(second.get(i))) continue;
                else{
                    third.add(second.get(i));
                }
            }

            return third;
        }
    }

    public static void main(String[] args) {
        LinkedList <Integer> f = new LinkedList<>();
        LinkedList <Integer> s = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the first linked list");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the elements in the first linked list");
        for(int i = 0; i < n1; i++){
            int temp = sc.nextInt();
            f.add(temp);
        }

        sc.nextLine();

        System.out.println("Please enter the number of elements in the second linked list");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the elements in the second linked list");
        for(int i = 0; i < n2; i++){
            int temp = sc.nextInt();
            s.add(temp);
        }

        System.out.println("Finding the union of the 2 linked list");

        LinkedList <Integer> u = union(f, s);

        for(int i = 0; i < u.size(); i++){
            System.out.print(u.get(i) + " ");
        }

        System.out.println();

        System.out.println("Finding the intersection of the 2 linked list");

        LinkedList <Integer> intsec = intersection(f, s);

        for(int i = 0; i < intsec.size(); i++){
            if(intsec.size() == 0){
                System.out.println("There is no common element between the two linked list");
                break;
            }
            System.out.print(intsec.get(i) + " ");
        }

        sc.close();




    }
    
}
