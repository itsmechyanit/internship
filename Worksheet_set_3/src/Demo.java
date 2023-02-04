class Example {

    private int number;
    private String name;

    // getters
    public int get_number() {
        return this.number;
    }

    public String get_name() {
        return this.name;
    }

    // setters
    public void set_number(int value) {
        this.number = value;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("The number is: " + (this.number));
        System.out.println("The name is: " + (this.name));
    }

}

public class Demo {
    public static void main(String[] args) {
        Example eg = new Example();
        eg.set_number(123);
        eg.set_name("Chyanit Singh");
        eg.printDetails();
    }
}
