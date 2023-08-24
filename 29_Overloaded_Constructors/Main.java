public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingedients of the pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        Pizza pizza2 = new Pizza("thick crust", "margherita", "cream cheese");
        System.out.println("\n" + "Here are the ingedients of the second pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        System.out.println("\n" + pizza2.topping);
    }
}