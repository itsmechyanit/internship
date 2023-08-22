import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//We can only achieve Hybrid Inheritance using Interfaces in Java
//Since classes cannot extend more than one class

interface Methods{
  int ageIn2037();
  double calculateBMI();
}
//base class
class Person{
  String name;
  String address;
  int age;
  //constructor
  Person(String name, String address, int age){
    this.name = name;
    this.address = address;
    this.age = age;
  }

  void details(){
    System.out.println("Hello I am " + this.name + " and I live in " +this.address +" and I am " +this.age+" yrs old");
  }
}

//This is an example of hybrid inheritance
class Student extends Person implements Methods{
  String subject;
  double weight;
  double height;
  //constructor
  Student(String name, String address, int age, String subject, double weight, double height){
    super(name, address, age);
    this.subject = subject;
    this.height = height;
    this.weight = weight;
  }

  @Override
  //overiding the method from the base class
  void details(){
    System.out.println("Hello I am " + this.name + " and I live in " +this.address +" and I am " +this.age+" yrs old " + "and I study " +this.subject+". I weigh "+ this.weight +" kgs and I am " +this.height +" cms tall");
  }

  @Override
  //inheriting the method from Methods Interface
  //The method below calculates the age of the student in 2037
  public int ageIn2037(){
    Date d = new Date();
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(d);
    int year = calendar.get(Calendar.YEAR);
    return this.age + (2037 - year);
  }
  //This method calculates the BMI of the student
  public double calculateBMI(){
    double BMI = ((this.weight/this.height)/this.height) * 10000;
    return BMI;
  }


}
// Teacher class is also extending the Person base class 
//When multiple classes inherit from the same base class we call it hierarchical inheritance
class Teacher extends Person{
  String subject;
  Teacher(String name, String address, int age, String subject){
    super(name, address, age);
    this.subject = subject;
  }

   @Override
  void details(){
    System.out.println("Hello I am " + this.name + " and I live in " +this.address +" and I am " +this.age+" yrs old " + "and I teach " +this.subject);
  }



}

public class Question1 {
  public static void main(String[] args) {
    Person p1 = new Student("Chyanit", "B-6 Ram Ganga Vihar Moradabad Uttar Pradesh", 35, "Computer Science", 75.6, 172);
    p1.details();
    int age = ((Student)p1).ageIn2037();
    System.out.println("The age of the student in 2037 is: " +age);
    double BMI = ((Student)p1).calculateBMI();
    System.out.println("The BMI of the student is: " +Math.round(BMI));

    Person p2 = new Teacher("HC Verma", "IIT Kanpur", 62, "Physics");
    p2.details();
  }
}
