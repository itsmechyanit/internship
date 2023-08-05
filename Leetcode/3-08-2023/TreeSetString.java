import java.util.TreeSet;

public class TreeSetString {
  void task(TreeSet<String> ts,char a,char b,char c,char d)
    {
        // Add your code here. Print the output here itself.
      //headSet method will return a set consisting of all the strings smaller than the string stored in variable a
       System.out.println(ts.headSet(Character.toString(a)));
       //tailSet method will return a set consisting of all the strings greater than or equal to the string stored in variable b
       System.out.println(ts.tailSet(Character.toString(b)));
       //Subset method will return a set consisting of all the strings greater than or equal to the string stored in variable c but less than variable d... D is excluded
       System.out.println(ts.subSet(Character.toString(c), Character.toString(d)));
    }

    public static void main(String[] args) {
      System.out.println("Testing the first test case");
      TreeSetString tss1 = new TreeSetString();
      TreeSet<String> ts1 = new TreeSet<>();
      ts1.add("sa");
      ts1.add("ka");
      ts1.add("da");
      char a1 = 's';
      char b1 = 'k';
      char c1 = 'c';
      char d1 = 's';
      tss1.task(ts1, a1, b1, c1, d1);

     
      
    }
}
