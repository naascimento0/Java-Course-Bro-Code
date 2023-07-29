public class Main{
    public static void main(String[] args){
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
        System.out.println(cars[3]);

        String[] foods = new String[3];
        foods[0] = "Steak";
        foods[1] = "Onion rings";
        foods[2] = "Beans";
        System.out.println(foods[2]);
        System.out.println();

        for(int i = 0; i < cars.length; i++)
            System.out.println(cars[i]);
    }
}