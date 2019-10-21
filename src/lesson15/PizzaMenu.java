package lesson15;

import java.util.*;

public class PizzaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> margheritaIngreients= new HashSet<>();
        margheritaIngreients.add("mozzarella");
        margheritaIngreients.add("tomato sauce");
        margheritaIngreients.add("fresh organic basil");

        Set<String> tunaIngreients= new HashSet<>();
        tunaIngreients.add("tuna");
        tunaIngreients.add("tomatoes");
        tunaIngreients.add("mozzarella");

        Set<String> vegetableIngreients= new HashSet<>();
        vegetableIngreients.add("olive oil");
        vegetableIngreients.add("mushrooms");
        vegetableIngreients.add("zucchini");
        vegetableIngreients.add("tomato sauce");
        vegetableIngreients.add("corn");


        Pizza margherita = new Pizza("Marghrita", margheritaIngreients,5.8 , "Thin and full of cheese") ;
        Pizza tuna = new Pizza("Tuna", tunaIngreients ,  6.4 , "delicious") ;
        Pizza vegetable = new Pizza( "Vegetable", vegetableIngreients , 7.2 ,  "Full of vegetables") ;

        Map<String,Pizza> pizzas = new HashMap<>();
        pizzas.put("margherita",margherita);
        pizzas.put("tuna",tuna);
        pizzas.put("vegetable",vegetable);


        for (Map.Entry<String,Pizza>entry : pizzas.entrySet()){
            Pizza pizza= entry.getValue();
            System.out.println(pizza.printMenuItem());
        }

        System.out.println("Enter your choice:");
        for (Map.Entry<String,Pizza>entry : pizzas.entrySet()) {
             Pizza pizza= entry.getValue();
            String x = scanner.nextLine();
             pizza = pizzas.get(x);
            System.out.println(pizza.printMenuItem());
        }


    }
}
