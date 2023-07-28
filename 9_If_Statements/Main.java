import java.util.Random;

public class Main{
    public static void main(String[] args){
        int age = 13;
        if(age >= 75)
            System.out.println("Ok Boomer!");
        else if(age >= 18)
            System.out.println("You're an adult!");
        else if(age >= 13)
            System.out.println("You're a teenager!");
        else
            System.out.println("You're not an adult!");
    }
}