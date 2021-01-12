package Nationality;
import Abstract.Person;

public class Italian extends Person {

    public Italian(String name){
        super(name);
    }

    @Override
    public String Greet() {
        return (getName()+","+"Ciao");
    }

}
