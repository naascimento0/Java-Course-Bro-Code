public class Main {
    public static void main(String[] args) {
        System.out.printf("This is a format string %s\n", 123);
        System.out.printf("This is a format integer %d\n", 123);
        

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Gabriel N";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);

        System.out.printf("Hello %10s\n", myString);
        System.out.printf("Hello %-10s\n", myString); //left justify
        System.out.printf("You have this much money %20f\n", myDouble);
        System.out.printf("You have this much money %020f\n", myDouble);
        System.out.printf("You have this much money %,f\n", myDouble);

    }
}
