class cls1
{
    void add(int p,int q){
        System.out.println(p+q);
    }
}

class cls2 extends cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    void task(int p,int q)
    {
        //Add your code here.
        System.out.println((p *p + q * q));
    }
}
public class JavaInheritance {
  public static void main(String[] args) {
    cls2 c = new cls2();
    System.out.println("Testing the first test case");
    c.add(2, 4);
    c.mul(2, 4);
    c.task(2, 4);
  }
}
