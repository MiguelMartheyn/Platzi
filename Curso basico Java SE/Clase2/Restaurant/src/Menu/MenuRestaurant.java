package Menu;

import java.util.Scanner;

public class MenuRestaurant {

    public static void showMenu() {
        MenuRecipes myProduct = new MenuRecipes("Makro");

        int response = 0;
        String product;
        int price = 0;
        int i = 0;


        do {
            Scanner value = new Scanner(System.in);
            System.out.println("\nSelecciona la opción deseada");

            System.out.println("1. Agregar Receta");
            System.out.println("2. Listar Recetas");
            System.out.println("3. Reemplazar Receta");
            System.out.println("0. Salir");

            try {
                Scanner sc = new Scanner(System.in);
                Scanner scP = new Scanner(System.in);
                Scanner scPr = new Scanner(System.in);
                Scanner scS = new Scanner(System.in);
                response = sc.nextInt();

                switch (response) {
                    case 1:
                        try{
                            System.out.println("Digite el nombre del producto: ");
                            product = scP.nextLine();
                            System.out.println("Digite el valor del producto: ");
                            price = scPr.nextInt();

                            myProduct.addProduct(product,price);
                        }catch (Exception e){
                            System.out.println("Ocurrio un error, intente mas tarde");
                        }
                        break;
                    case 2:
                        System.out.println("\t\t\t\t RECETAS \n");

                        for (MenuRecipes.Product aA:myProduct.getProduct()
                        ) {
                            System.out.println("Receta "+i+"\n");
                            System.out.println("Nombre: "+ aA.getNameProduct()+"\nPrecio: "
                                    + aA.getPriceProduct()+"\n");
                            i++;
                        }
                        i=0;

                        break;
                    case 3:
                        System.out.println("\t\t\t\t RECETAS \n");

                        for (MenuRecipes.Product aA:myProduct.getProduct()
                        ) {
                            System.out.println("Receta "+i+"\n");
                            System.out.println("Nombre: "+ aA.getNameProduct()+"\nPrecio: "
                                    + aA.getPriceProduct()+"\n");
                            i++;
                        }
                        i=0;
                        System.out.println("Digite el numero de la receta que desea reemplazar: ");
                        int index = scPr.nextInt();
                        System.out.println("Digite el nombre del producto: ");
                        product = scP.nextLine();
                        System.out.println("Digite el valor del producto: ");
                        price = scPr.nextInt();
                        for (MenuRecipes.Product aA:myProduct.getProduct()
                        ) {
                            if(aA.getId() == index){
                                aA.setNameProduct(product);
                                aA.setPriceProduct(price);
                            }
                        }
                        break;

                    default:
                        System.out.println("No existe esa opcion. Gracias");
                }

            } catch (Exception e) {
                System.out.println("Parametro incorrecto");
            }

            System.out.println("\nDigite cualquier numero o letra si desea continuar");
            System.out.println("0. Salir");

            try{
                Scanner sc = new Scanner(System.in);
                response = sc.nextInt();
            }catch (Exception e){
                System.out.println("Continuamos\n");
            }

        } while (response != 0);
        System.out.println("Thank you for you visit");
    }
}
