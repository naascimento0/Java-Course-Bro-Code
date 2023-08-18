public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        myCar.drive();
        myCar.brake();

        System.out.println("\n" + myCar2.make);
        System.out.println(myCar2.model);
    }
}
