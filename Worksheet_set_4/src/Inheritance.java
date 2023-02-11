//Student class inherits name, age property from the Person Class. Inheritance is mainly used for code reusability
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNum;
    String stream;

    Student(String name, int age, int rollNum, String stream) {
        super(name, age);
        this.rollNum = rollNum;
        this.stream = stream;
    }

    void details() {
        System.out.println("The student name is " + (this.name));
        System.out.println("The student age is " + (this.age));
        System.out.println("The student rollNum is " + (this.rollNum));
        System.out.println("The student studies " + (this.stream));
    }
}