import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        System.out.println(z);

        double w = Math.abs(y);
        System.out.println(w);

        double p = Math.sqrt(20 + y);
        System.out.println(p);

        double q = Math.round(x);
        System.out.println(q);

        double o = Math.ceil(x);
        System.out.println(o);

        double a, b, c;
        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("The hypotenuse is: " +c);

        scanner.close();
    }
}