package Menu;
import static MathOperation.Operations.*;
import java.util.Scanner;


public class MenuOperation {
    public static void showMenu() {

        int response = 0;

        do {

            double numberA;
            double numberB;
            Scanner value = new Scanner(System.in);

            System.out.println("Indique el valor 1: ");
            numberA = value.nextDouble();
            System.out.println("Indique el valor 2: ");
            numberB = value.nextDouble();

            System.out.println("\nSelecciona la opción deseada");

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            try {
                Scanner sc = new Scanner(System.in);
                response = sc.nextInt();

                switch (response) {
                    case 1:
                        add(numberA,numberB);
                        break;
                    case 2:
                      substract(numberA,numberB);

                        break;
                    case 3:
                        multiply(numberA,numberB);
                        break;
                    case 4:
                        divide(numberA,numberB);
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
