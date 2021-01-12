package Nationality;
import Abstract.Person;

public class English extends Person {
    public English(String name){
        super(name);
    }

    @Override
    public String Greet() {
        return (getName()+","+"Hello");
    }
}
