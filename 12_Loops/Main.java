import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = "";
        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " +name);

        String string = "";
        do{
            System.out.println("Enter your name: ");
            string = scanner.nextLine();
        }while(string.isBlank());
        System.out.println("Hello " +string);

        System.out.println("");
        for(int i = 10; i >= 0; i--)
            System.out.println(i);
    }
}