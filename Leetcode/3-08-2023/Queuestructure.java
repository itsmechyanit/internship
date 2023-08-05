import java.util.LinkedList;
import java.util.Queue;

public class Queuestructure {
  Queue<Integer>q;
    Queuestructure(){
        q=new LinkedList<>();
    }
    public void addElement(int key)
    {
        //Add your code here.
        q.add(key);
        return;
    }
    public void RemoveElement()
    {
        //Add your code here.
        if(!q.isEmpty()){
            int elem = q.peek();
            System.out.print(elem + " ");
            q.remove();
            return;
            
        }
        
        System.out.print(-1 + " ");
    }
    public void peekElement()
    {
        //Add your code here.
        if(!q.isEmpty()){
            int elem = q.peek();
            System.out.print(elem + " ");
            
            return;
            
        }
        
        System.out.print(-1 + " ");
        
    }
    public void Size()
    {
        //Add your code here.
        System.out.print(q.size() + " ");
    }

    public static void main(String[] args) {
      Queuestructure q1 = new Queuestructure();
      System.out.println("Testing the first test case");
      q1.addElement(5);
      q1.addElement(10);
      q1.addElement(15);
      q1.RemoveElement();
      q1.peekElement();
      System.out.println();
      System.out.println("Testing the second test case");
      Queuestructure q2 = new Queuestructure();
      q2.addElement(5);
      q2.RemoveElement();
      q2.peekElement();
      q2.Size();
    }
}
