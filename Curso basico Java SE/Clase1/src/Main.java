import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando Objeto, asigno nombre del cliente y saldo cuenta.
        User user = new User("Miguel Martheyn", 0);
        //Confirmo esten bien
        user.showName();

        //Menu Agregar/Retirar/Ver dinero

        System.out.println("Welcome ");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        int addCash = -1;
        do {
            System.out.println("1. Ver saldo cuenta");
            System.out.println("2. Realizar transferencia");
            System.out.println("3. Realizar retiro");
            System.out.println("0. Salir");

            try {
                Scanner sc = new Scanner(System.in);
                response = sc.nextInt();

            switch (response) {
                case 1:
                    user.showAccount();
                    break;
                case 2:
                    System.out.println("Transferencia");

                        System.out.println("Por favor digite el valor que desea asignar: ");
                        try {
                            addCash = sc.nextInt();
                            user.addCash(addCash);

                        } catch (Exception e) {
                            System.out.println("Valor erroneo, recuerde ingresar un valor numerico en la proxima ocasion ");
                        }
                    break;
                case 3:
                    System.out.println("Retiro");
                    System.out.println("Por favor digite el valor que desea retirar: ");
                    try {
                        int deleteCash = sc.nextInt();
                        user.deleteCash(deleteCash);
                    } catch (Exception e) {
                    System.out.println("Valor erroneo, recuerde ingresar un valor numerico en la proxima ocasion ");
                }
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

            }catch (Exception e){
                System.out.println("Digite un parametro correcto");
            }

        } while (response != 0);

    }


}
