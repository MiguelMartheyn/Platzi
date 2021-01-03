public class Functions {
    public static void main(String[] args) {

        double y = 3;

        //Area de un circulo
        //pi*r2
        System.out.println(circleArea(y));

        //Area de una esfera
        //4*PI*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //4/3*PI*r3
        System.out.println(sphereVolumen(y));

        //Conversor de Pesos a Dolares
        System.out.println("PESOS A DOLARES: "+converToDolar(1000,"COP"));
    }

    public static double circleArea(double r){
        return Math.PI* Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    public static double converToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity*0.052;
                break;
            case "COP":
                quantity = quantity*0.00031;
                break;

        }
        return quantity;
    }
}
