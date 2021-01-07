package Menu;
import java.util.Scanner;

public class MenuProduct {

    

    public static void showMenu() {
        Market myProduct = new Market("Makro");
        
            int response = 0;
            String product;
            int price = 0;
            int stack = 0;
            int i = 0;
            

            do {
                Scanner value = new Scanner(System.in);
                System.out.println("\nSelecciona la opción deseada");

                System.out.println("1. Agregar Producto");
                System.out.println("2. Listar Precio de Productos");
                System.out.println("3. Vender Producto");
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
                                System.out.println("Digite el stack del producto: ");
                                stack = scS.nextInt();
                                myProduct.addProduct(product,price,stack);
                            }catch (Exception e){
                                System.out.println("Ocurrio un error, intente mas tarde");
                            }
                            break;
                        case 2:
                            System.out.println("\t\t\t\t PRODUCTOS \n");

                            for (Market.Product aA:myProduct.getProduct()
                            ) {
                                System.out.println("Producto "+i+"\n");
                                System.out.println("Nombre: "+ aA.getNameProduct()+"\nPrecio: "
                                        + aA.getPriceProduct()+"\nStock: "
                                        +aA.getStackProduct()+"\n");
                                i++;
                            }
                            i=0;

                            break;
                        case 3:
                            System.out.println("\t\t\t\t PRODUCTOS \n");

                            for (Market.Product aA:myProduct.getProduct()
                            ) {
                                System.out.println("Producto "+i+"\n");
                                System.out.println("Nombre: "+ aA.getNameProduct()+"\nPrecio: "
                                        + aA.getPriceProduct()+"\nStock: "
                                        +aA.getStackProduct()+"\n");
                                i++;
                            }
                            i=0;
                            System.out.println("Digite el numero del producto que desea vender: ");
                            int index = scPr.nextInt();
                            myProduct.getProduct().remove(index);
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



