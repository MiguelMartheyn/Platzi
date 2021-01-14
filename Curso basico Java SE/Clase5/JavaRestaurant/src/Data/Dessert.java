package Data;

import java.util.List;

public class Dessert extends Dish{
    private boolean hot;

    public Dessert(String name, List<IngredientAmmount> ingredients,boolean hot) {
        super(name, ingredients);
        this.hot = hot;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    @Override
    public double getCost() {
        return 0;
    }
}
