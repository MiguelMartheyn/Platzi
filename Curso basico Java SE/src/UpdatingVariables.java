public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary+=200;
        System.out.println("El salario es: "+salary);

        //pension: $50 descuento
        salary-=50;
        System.out.println("El salario es: "+salary);

        //2 horas extras $30 c/u agregar
        //Comida: $45 descuento

        salary = salary +(2*30)-45;
        System.out.println("El salario es: "+salary);

        //Actualizando cadenas de texto

        String employeeName = "Miguel Martheyn";
        employeeName = employeeName+" Berbesi";
        System.out.println(employeeName);

        employeeName= "El nombre es: "+employeeName;
        System.out.println(employeeName);
    }
}
