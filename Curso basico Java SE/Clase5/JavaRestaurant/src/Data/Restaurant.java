package Data;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Dish> dishes;
    private List<IngredientAmmount> ingredients;

    public Restaurant() {
        this.dishes = new ArrayList<Dish>();
        this.ingredients = new ArrayList<IngredientAmmount>();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void addDish(Dish dish){
        this.dishes.add(dish);
    }

    public List<IngredientAmmount> getIngredients() {
        return ingredients;
    }

    public void addIngredientAmmount(IngredientAmmount ingredientAmmount){
        this.ingredients.add(ingredientAmmount);
    }

}
