public class Addition {

    int sum = 0;

    int addTwoInt(int a, int b) {
        sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        // create instance of Addition
        Addition add = new Addition();
        int result = add.addTwoInt(10, 20);
        System.out.println("The sum of the 2 numbers is: " + result);
    }

}
