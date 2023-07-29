import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int temp = 15;
        if(temp > 30)
            System.out.println("It's hot outside");
        else if(temp >= 20 && temp <= 30)
            System.out.println("It's warm outside");
        else
            System.out.println("It's cold outisde");

        Scanner scanner = new Scanner(System.in);
        System.out.println("You're playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q"))
            System.out.println("You quit the game");
        else if(!response.equals("q") && !response.equals("Q"))
            System.out.println("Invalid choice");
        else
            System.out.printf("You're still playing the game");


    }
}