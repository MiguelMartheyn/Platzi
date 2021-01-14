package Data;

public class Ingredient {

    private String name;
    private double cost;
    private int calories;
    private int index = 0;
    private static int cont = 0;


    public Ingredient(String name, double cost, int calories) {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
        index = cont;
        cont++;

    }
    public int getIndex() {
        return index;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
