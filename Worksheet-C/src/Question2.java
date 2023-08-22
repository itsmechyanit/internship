//Abstract class defines the method that needs to be implemented by the child classes
//We could have also used an interface in this class since none of the classes are inheriting any fields
abstract class Shape{
  abstract double area();
  abstract double perimeter();
}

//child class inheriting the shape class
class Square extends Shape{
  double side;
  
  Square(double side){
    this.side = side;
  }

  //overriding the area method
  @Override
  double area(){
    return this.side * this.side;
  }
  //overriding the perimter method method
   @Override
   double perimeter(){
    return 4 * this.side;
  }
}
//child class inheriting the shape class
class Rectangle extends Shape{
  double length;
  double width;
  Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }
  //overriding the area method
  @Override
  double area(){
    return this.length * this.width;
  }
  //overriding the perimeter method
  @Override
   double perimeter(){
    return 2 *(this.length + this.width);
  }
}

//child class inheriting the shape class
class Circle extends Shape{
  double radius;
  
  Circle(double radius){
    this.radius = radius;
    
  }
  //overriding the area method
  @Override
  double area(){
    return Math.PI * this.radius * this.radius;
  }
  //overriding the perimeter method
   double perimeter(){
    return 2 * Math.PI * this.radius;
  }
}



public class Question2 {
  public static void main(String[] args) {
    //We will be checking for RunTime Polymorphism
    Shape s1 = new Square(5);
    Shape s2 = new Rectangle(6, 5);
    Shape s3 = new Circle(5);
    //area or the perimeter method that will be called will depend on the type of the object at runtime
    //All of them are of type shape but the method that will be called will depend on the type of object
    //the area method of square will be called
    System.out.println("The area is: " + s1.area());
    //the perimeter method of square will be called
    System.out.println("The area is: " + s1.perimeter());
    //the area method of rectangle will be called
    System.out.println("The area is: " + s2.area());
    //the perimeter method of rectangle will be called
    System.out.println("The area is: " + s2.perimeter());
    //the area method of circle will be called
    System.out.println("The area is: " + Math.round(s3.area()));
    //the perimeter method of circle will be called
    System.out.println("The perimeter is: " + Math.round(s3.perimeter()));
  }
}
