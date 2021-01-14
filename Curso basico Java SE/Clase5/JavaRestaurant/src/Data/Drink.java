package Data;

import java.util.List;

public class Drink extends Dish {
    private boolean milkShake ;
    private boolean juice;
    private boolean alcoholic;

    public Drink(String name, List<IngredientAmmount> ingredients,boolean milkShake,boolean juice,boolean alcoholic) {
        super(name, ingredients);
        this.milkShake = milkShake;
        this.juice = juice;
        this.alcoholic = alcoholic;
    }

    public boolean isMilkShake() {
        return milkShake;
    }

    public void setMilkShake(boolean milkShake) {
        this.milkShake = milkShake;
    }

    public boolean isJuice() {
        return juice;
    }

    public void setJuice(boolean juice) {
        this.juice = juice;
    }

    public boolean isHot() {
        return alcoholic;
    }

    public void setHot(boolean hot) {
        this.alcoholic = hot;
    }

    @Override
    public double getCost() {
        return 0;
    }

}
