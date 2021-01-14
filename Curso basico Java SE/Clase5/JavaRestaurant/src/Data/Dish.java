package Data;

import java.util.List;

public abstract class Dish {

    private String name;
    private List<IngredientAmmount> ingredients;
    private static final double sellingBase = 1000;


    public Dish(String name, List<IngredientAmmount> ingredients) {
        this.name = name;
        this.ingredients = ingredients;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IngredientAmmount> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientAmmount> ingredients) {
        this.ingredients = ingredients;
    }

    public abstract double getCost();

    public double getSellingPrice(){
        return this.getCost() + sellingBase;
    }

}
