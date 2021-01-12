package Nationality;
import Abstract.Person;

public class French extends Person{
    public French(String name){
        super(name);
    }

    @Override
    public String Greet() {
        return (getName()+","+"Salut");
    }
}
