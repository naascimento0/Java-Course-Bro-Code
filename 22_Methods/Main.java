public class Main {
    public static void main(String[] args) {
        String name = "bro";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;
        System.out.println("\n" + add(x, y));
    }
    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
    static int add(int x, int y){
        return x + y;
    }
}