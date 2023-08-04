import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String name = "Bro";

        boolean result = name.equals("Bro");
        System.out.println(result);

        boolean result2 = name.equals("bro");
        System.out.println(result2);

        boolean result3 = name.equalsIgnoreCase("bro");
        System.out.println(result3);

        int length = name.length();
        System.out.println(length);

        char character = name.charAt(0);
        System.out.println(character);

        int index = name.indexOf("o");
        System.out.println(index);

        boolean empty = name.isEmpty();
        System.out.println(empty);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String lower = name.toLowerCase();
        System.out.println(lower);

        String aux = "        Gabriel        ";
        aux = aux.trim();
        System.out.println(aux);

        aux = aux.replace('a', 'o');
        System.out.println(aux);
    }
}