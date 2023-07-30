class Parent
{
    void show(int p)
    {
     System.out.print(p+" ");
    }
    void print(int q){
        System.out.print(q+" ");
    }
}

class Child extends Parent
{
    @Override
    void show(int p) { System.out.print(p+" "); }

    @Override
    void print(int num){
      System.out.print(num*num + " ");
    }
} 


public class JavaOveride {
  public static void main(String[] args) {
    int p = 1;
    int q = 2;
    int r = 3;
    int s = 4;
    Parent obj1 = new Parent();
    obj1.show(p);
    obj1.print(q);
    Parent obj2 = new Child();
    obj2.show(r);
    obj2.print(s);
  }
}
