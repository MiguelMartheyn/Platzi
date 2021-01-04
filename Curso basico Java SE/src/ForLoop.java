public class ForLoop {
    //Variable Global
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {


        for (int i = 0; i < 20 ; i++) {

            if(turnOnOffLight()) {
                printSOS();
            }
        }
    }

    //Imprime el mensaje de SOS
    public static void printSOS(){
        System.out.println("...___... ");
    }
    //Cambia el estado
    public static boolean turnOnOffLight(){
        isTurnOnLight = !isTurnOnLight;
        return isTurnOnLight;
    }
}
