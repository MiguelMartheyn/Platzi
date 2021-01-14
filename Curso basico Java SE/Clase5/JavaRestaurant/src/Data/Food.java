package Data;

import java.util.List;

public class Food extends Dish {
    private boolean hot;
    private boolean vegan;

    public Food(String name, List<IngredientAmmount> ingredients,boolean hot, boolean vegan) {
        super(name, ingredients);
        this.hot = hot;
        this.vegan = vegan;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    @Override
    public double getCost() {
        return 0;
    }
}
