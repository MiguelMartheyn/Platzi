package Data;

public class IngredientAmmount {

    private Ingredient ingredient;
    private int ammount;


    public IngredientAmmount(Ingredient ingredient, int ammount) {
        this.ingredient = ingredient;
        this.ammount = ammount;

    }


    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
