public class DataTypes {
    public static void main(String[] args) {
        //Enteros: byte, short, int, long
        int n = 1234567890; //Maximo 10 numeros
        long nL = 12345678901L; //Se coloca una L al final

        //Flotantes: float, double

        double nD = 123.456; //Para mas precision
        float nF = 123.456F; //Colocar F al final

        //Texto: char
         char valor = 'm';
        //Logicos: boolean
         boolean is = true;
        //A partir de Java 10 puedo utilizar var y omitir colocar el tipo de dato
        var salary = 1000;
        //pension 3%
        var pension = salary*0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Miguel Martheyn";
        System.out.println("EMPLOYEE: "+employeeName+" Salary: "+totalSalary);

    }
}
