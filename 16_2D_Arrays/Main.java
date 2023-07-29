public class Main{
    public static void main(String[] args){
        String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Mustang";
        cars[1][1] = "F-150";
        cars[1][2] = "Ranger";

        cars[2][0] = "Ferrari";
        cars[2][1] = "Lamborghini";
        cars[2][2] = "Tesla";

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++)
                System.out.println(cars[i][j] + " ");
        }


        String[][] new_cars = {
                    {"Corsa", "Gol", "Corolla"},
                    {"Mercedes", "Fox", "SpaceFox"},
                    {"Ka", "Civic", "Hilux"}
                };
                
        for(int i = 0; i < new_cars.length; i++){
            System.out.println();
            for(int j = 0; j < new_cars[i].length; j++)
                System.out.println(new_cars[i][j] + " ");
        }
    }
}
