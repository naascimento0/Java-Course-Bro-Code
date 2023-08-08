import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        System.out.println(bakeryList);
        System.out.println(bakeryList.get(0));
        System.out.println();

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");
        System.out.println(drinksList);
        System.out.println();

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
    }
}