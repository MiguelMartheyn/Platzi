public class WhileLoop {
    //Variable Global
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {


        int i = 1;
        while(i <= 10){
            if(turnOnOffLight()) {
                printSOS();
                i++;
            }
        }
    }
    //Imprime el mensaje de SOS
    public static void printSOS(){
        System.out.println("...___...");
    }
    //Cambia el estado
    public static boolean turnOnOffLight(){
        isTurnOnLight = !isTurnOnLight;
        return isTurnOnLight;
    }
}
