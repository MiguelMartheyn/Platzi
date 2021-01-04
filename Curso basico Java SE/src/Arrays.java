import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String cities[][] = new String[4][1];

        int [][][] numbers = new int[1][1][1];
        int [][][][] numbers4 = new int[1][1][1][1];


        for (int i = 0; i <= 3; i++) {
            //Capturar la respuesta del usuario
            System.out.println("Por favor digita el valor de la posicion: "+i );
            Scanner sc = new Scanner(System.in);
            // response = Integer.valueOf(sc.nextLine());
            androidVersions[i] = sc.nextLine();
        }
        //androidVersions[0] = "Apple Pie";
       // androidVersions[1] = "Bannana Bread";
        //androidVersions[2] = "Cupcake";
        //androidVersions[3] = "Donut";

        System.out.println("\nLas Versiones de Android son las siguientes: \n");
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
    }
}
