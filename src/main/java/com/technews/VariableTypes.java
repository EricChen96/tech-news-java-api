public class VariableTypes {
    public static void main(String[] args) {
        String name = "Cleopatra";
        int age = 2016+19;
        double price = 1999.99;
        boolean truth = true;
        boolean falseness = !truth;


        int a = 10;
        double b = 10.99;
        String c = "cat";

        double sum = a + b;
        String concat = a + c;

        //20.990000000000002
        System.out.println(sum);

        //10cat
        System.out.println(concat);
    }

}
