package Nationality;
import Abstract.Person;

public class Portuguese extends Person{

    public Portuguese(String name){
        super(name);
    }

    @Override
    public String Greet() {
        return (getName()+","+"Olá");
    }
}
