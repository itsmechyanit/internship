class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void details() {
        System.out.println("Inside Person class");
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

    @Override
    void details() {
        System.out.println("The student name is " + (this.name));
        System.out.println("The student age is " + (this.age));
        System.out.println("The student rollNum is " + (this.rollNum));
        System.out.println("The student studies " + (this.stream));
    }
}

class Politician extends Person {
    String partyName;
    String position;

    Politician(String name, int age, String partyName, String position) {
        super(name, age);
        this.partyName = partyName;
        this.position = position;
    }

    @Override
    void details() {
        System.out.println("The politician name is " + (this.name));
        System.out.println("The politician age is " + (this.age));
        System.out.println("The politician belongs to " + (this.partyName));
        System.out.println("The politician's position is " + (this.position));
    }

}

class User {
    public static void main(String[] args) {
        Person p = new Politician("Narendra Modi", 71, "BJP", "Prime Minister");
        p.details();/*
                     * depending on the type of object the details method will vary and this is a
                     * perfect example of runtime polymorphism. Runtime polymorphism does not depend
                     * upon the type of reference variable
                     */
    }
}