import java.util.Random;

public class Main{
    public static void main(String[] args){
        String day = "Pizza";
        switch(day){
            case "Monday": System.out.println("Its is Monday!");
            break;

            case "Tuesday": System.out.println("Its is Tuesday!");
            break;

            case "Wednesday": System.out.println("Its is Wednesday!");
            break;

            case "Thursday": System.out.println("Its is Thursday!");
            break;

            case "Friday": System.out.println("Its is Friday!");
            break;

            case "Saturday": System.out.println("Its is Saturday!");
            break;

            case "Sunday": System.out.println("Its is Sunday!");
            break;

            default: System.out.println("That is not a day!");
        }

        //se nao tiver o break, todos os casos abaixos serao percorridos
    }
}