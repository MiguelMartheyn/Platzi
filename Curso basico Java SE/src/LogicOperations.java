public class LogicOperations {
    public static void main(String[] args) {

        int a = 8;
        int b = 5;

        //Operadores asignacion
        System.out.println("a es igual a b? => "+(a == b));
        System.out.println("a es diferente a b? => "+(a != b));

        //Operadores relacionales
        System.out.println("a es mayor a b? => "+(a > b));
        System.out.println("a es menor a b? => "+(a < b));
        System.out.println("a es mayor o igual a b? => "+(a >= b));
        System.out.println("a es menor o igual a b? => "+(a <= b));

        if(a==b){
            System.out.println("a es igual a b");
        }else if(a != b && a > b ){
            System.out.println("a es diferente y mayor que b");
        }else if(a != b && a < b) {
            System.out.println("a es diferente y menor que b");
        }
    }
}
