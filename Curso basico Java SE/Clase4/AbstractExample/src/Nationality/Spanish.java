package Nationality;
import Abstract.Person;

public class Spanish extends Person{
    public Spanish(String name){
        super(name);
    }

    @Override
    public String Greet() {
        return (getName()+","+"Hola");
    }
}
