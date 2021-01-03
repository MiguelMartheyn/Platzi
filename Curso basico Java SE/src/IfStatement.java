public class IfStatement {
    public static void main(String[] args) {

        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if(isBluetoothEnabled){
            System.out.println("Enviar el archivo");
            fileSended++;

        }else{
            System.out.println("Conectate");
        }

        //Scope Global
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);

    }
}
