import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "rat", "bird"};
        for(String i : animals)
            System.out.println(i);
        System.out.println();

        ArrayList<String> animals_list = new ArrayList<String>();
        animals_list.add("cat");
        animals_list.add("dog");
        animals_list.add("rat");
        animals_list.add("bird");
        for(String i : animals_list)
            System.out.println(i);
    }
}