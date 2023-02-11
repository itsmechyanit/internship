public class CompileTimePolymorphism {

    /*
     * There are many versions of the adder function. The specific adder function
     * that will be called will be decided at compile time itself
     */

    static int adder(int a, int b) {
        return a + b;
    }

    static float adder(float a, float b) {
        return a + b;
    }

    static String adder(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism.adder("Chyanit", " Singh");
    }

}
