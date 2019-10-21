package lesson15;

import java.util.Set;

public class Pizza {
    private String name;
    private Set<String>ingredients;
    private double price;
    private String description;

    public Pizza(String name, Set<String> ingredients, double price, String description) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.description = description;
    }

    public String printMenuItem(){
        return this.name +" "+this.price+ "€" + "\n" + this.ingredients + "\n" +this.description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
