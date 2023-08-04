import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //wrapper class provides a way to use primitive data types as reference data_types
        //reference data_types contain useful methods like strings

        /*primitive         wrapper
        boolean             Boolean
        char                Character
        int                 Integer
        double              Double*/

        //autoboxing ------>
        //<-------- unboxing

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        if(a) //unboxing
            System.out.println("This is true");
        if(b == '@') //unboxing
            System.out.println("This is also true");

        //primitive data_types are faster to access
    }
}