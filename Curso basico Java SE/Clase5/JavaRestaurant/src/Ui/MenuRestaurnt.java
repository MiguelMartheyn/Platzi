package Ui;
import Data.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurnt {

    public static void showMenu() {

        //this.restaurant = Initiallizer.initiallizeRestaurant()
        Restaurant myRestaurant = new Restaurant(); //Inicializa el restaurante
        //Lista de ingredientes para cada tipo de plato
        List<IngredientAmmount> ingredientDish= new LinkedList<IngredientAmmount>();
        // List<IngredientAmmount> ingredientDish = new LinkedList<IngredientAmmount>();
        // List<IngredientAmmount> ingredientDish = new LinkedList<IngredientAmmount>();

        //Creo el primer ingrediente de comida
        Ingredient ingredient_food1 = new Ingredient("Ingredientes de pastas con pollo",100,50);
        IngredientAmmount ingredientAmmount_food1 = new IngredientAmmount(ingredient_food1,1);
        //Creo el segundo ingrediente de comida
        Ingredient ingredient_food2 = new Ingredient("Ingredientes de arroz chino",150,70);
        IngredientAmmount ingredientAmmount_food2 = new IngredientAmmount(ingredient_food2,4);
        //Creo el tercer ingrediente de comida
        Ingredient ingredient_food3 = new Ingredient("Ingredientes de bebida fria",60,30);
        IngredientAmmount ingredientAmmount_food3 = new IngredientAmmount(ingredient_food3,1);
        //Creo el cuarto ingrediente de comida
        Ingredient ingredient_food4 = new Ingredient("Ingredientes de bebida alcoholica",80,70);
        IngredientAmmount ingredientAmmount_food4 = new IngredientAmmount(ingredient_food4,1);
        //Creo el quinto ingrediente de comida
        Ingredient ingredient_food5 = new Ingredient("Ingredientes de torta de zanahoria",40,10);
        IngredientAmmount ingredientAmmount_food5 = new IngredientAmmount(ingredient_food5,1);
        //Creo el sexto ingrediente de comida
        Ingredient ingredient_food6 = new Ingredient("Ingredientes de postre tres leches",60,30);
        IngredientAmmount ingredientAmmount_food6 = new IngredientAmmount(ingredient_food6,1);

        //Agrego los  dos ingredientes de comida a mi lista de platos
        ingredientDish.add(ingredientAmmount_food1);
        ingredientDish.add(ingredientAmmount_food2);
        ingredientDish.add(ingredientAmmount_food3);
        ingredientDish.add(ingredientAmmount_food4);
        ingredientDish.add(ingredientAmmount_food5);
        ingredientDish.add(ingredientAmmount_food6);

        //Se crea dos platos de cada tipo
        Food foodPasta = new Food("Pastas con pollo",ingredientDish,false,false);
        Food foodArrozChino = new Food("Arroz Chino",ingredientDish,true,false);
        Drink drinkCocacola = new Drink("Cocacola",ingredientDish,true,false,false);
        Drink drinkCorona = new Drink("Corona",ingredientDish,false,false,true);
        Dessert dessertZanahoria = new Dessert("Torta de Zanahoria",ingredientDish,true);
        Dessert dessertTresLeches = new Dessert("Postre Tres Leches",ingredientDish,false);

        //Agrego a la lista de platos
        myRestaurant.addDish(foodPasta);
        myRestaurant.addDish(foodArrozChino);
        myRestaurant.addDish(drinkCocacola);
        myRestaurant.addDish(drinkCorona);
        myRestaurant.addDish(dessertZanahoria);
        myRestaurant.addDish(dessertTresLeches);

        //Agrego a la lista de ingredientes del Restaurante
        myRestaurant.addIngredientAmmount(ingredientAmmount_food1);
        myRestaurant.addIngredientAmmount(ingredientAmmount_food2);
        myRestaurant.addIngredientAmmount(ingredientAmmount_food3);
        myRestaurant.addIngredientAmmount(ingredientAmmount_food4);
        myRestaurant.addIngredientAmmount(ingredientAmmount_food5);
        myRestaurant.addIngredientAmmount(ingredientAmmount_food6);


        int response = 0;
        String product;
        int price = 0;
        int stack = 0;
        double currentMoney = 100000;
        int i = 1;
        int index = 0;


        do {
            Scanner value = new Scanner(System.in);
            System.out.println("----------------------------");
            System.out.println("\nSelect option\n");

            System.out.println("1. Print my current money amount");
            System.out.println("2. Print my current ingredient inventory");
            System.out.println("3. Buy some amount of any ingredient");
            System.out.println("4. Print my dishes inventory");
            System.out.println("5. Make a dish (reducing the ingredients inventory)");
            System.out.println("6. Sell a dish");
            System.out.println("0. Exit");

            try {
                Scanner sc = new Scanner(System.in);
                Scanner scP = new Scanner(System.in);
                Scanner scPr = new Scanner(System.in);
                Scanner scS = new Scanner(System.in);
                response = sc.nextInt();

                switch (response) {
                    case 1:
                        System.out.println("----------------------------");
                        System.out.println("My current money amount is: " + currentMoney);

                        break;
                    case 2:
                        System.out.println("----------------------------");
                        System.out.println("\t\t\t\t My current ingredient inventory \n");
                        //Lista de ingredientes del restaurante
                        for (IngredientAmmount aA: myRestaurant.getIngredients()
                        ) {
                            System.out.println("\nNombre: " + aA.getIngredient().getName() +
                                    "\nCosto: "+ aA.getIngredient().getCost() +
                                    "\nCalorias: "+ aA.getIngredient().getCalories() +
                                    "\nCantidad : " + aA.getAmmount());
                        }
                        break;
                    case 3:
                        System.out.println("----------------------------");
                        System.out.println("\t\t\t\tBuy some amount of any ingredient\n");
                        System.out.println("\t\t\t\t My current ingredient inventory \n");
                        //Lista de ingredientes del restaurante
                        for (IngredientAmmount aA: myRestaurant.getIngredients()
                        ) {
                            System.out.println("\n " + i+".Nombre: " + aA.getIngredient().getName() +
                                    "\nCosto: "+ aA.getIngredient().getCost() +
                                    "\nCalorias: "+ aA.getIngredient().getCalories() +
                                    "\nCantidad : " + aA.getAmmount());
                            i++;
                        }
                        i=1;
                        System.out.println("Select Number the Ingredient you need it");
                        index = scP.nextInt();
                        System.out.println("Quantity: ");
                        stack = scS.nextInt();
                        for (IngredientAmmount aA: myRestaurant.getIngredients()
                        ) {
                            if (i == index) {
                                aA.setAmmount(aA.getAmmount() + stack);
                            } else {
                                i++;
                            }
                        }
                        i=1;
                        System.out.println("Thanks, Its add");
                        break;
                    case 4:
                        System.out.println("----------------------------");
                        System.out.println("\t\t\t\tMy dishes inventory \n");
                        //Lista de platos de comida
                        index = 0;
                        for (Dish aA: myRestaurant.getDishes()
                        ) {
                            System.out.println("\nPlato: " + aA.getName() +
                                    "\nCosto: "+ aA.getCost() );

                            System.out.println("\t\t\t\tIngredients Dish \n");

                            for (IngredientAmmount dish : ingredientDish) {
                                if(index == dish.getIngredient().getIndex()) {
                                    System.out.println(dish.getIngredient().getName());
                                }

                            }
                            System.out.println("----------------------------");
                            index++;
                        }
                        index = 0;

                        break;
                    case 5:
                        System.out.println("----------------------------");
                        System.out.println("\t\t\t\tMake a dish \n");
                        break;
                    case 6:
                        System.out.println("----------------------------");
                        System.out.println("\t\t\t\tSell a dish \n");
                        break;
                    case 0:
                        System.out.println("----------------------------");
                        System.out.println("\t\t\t\tExit \n");
                        break;

                    default:
                        System.out.println("----------------------------");
                        System.out.println("No existe esa opcion. Gracias");
                }

            } catch (Exception e) {
                System.out.println("----------------------------");
                System.out.println("Parametro incorrecto");
            }
            System.out.println("----------------------------");
            System.out.println("\nDigite cualquier numero o letra si desea continuar");
            System.out.println("0. Salir");

            try{
                Scanner sc = new Scanner(System.in);
                response = sc.nextInt();
            }catch (Exception e){
                System.out.println("----------------------------");
                System.out.println("Continuamos\n");
            }

        } while (response != 0);
        System.out.println("----------------------------");
        System.out.println("Thank you for you visit");
    }
}
