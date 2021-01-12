import Abstract.Person;
import Nationality.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Person> personList = new ArrayList<Person>();

        Italian italian = new Italian("Francesco Totti");
        Portuguese portuguese = new Portuguese("Cristiano Ronaldo");
        French french = new French("Zinedine Zidane");
        English english = new English("Harry Kane");
        Spanish spanish = new Spanish("Falcao Garcia");

        personList.add(italian);
        personList.add(portuguese);
        personList.add(french);
        personList.add(english);
        personList.add(spanish);

        for (Person person:personList
             ) {
            System.out.println(person.Greet());
        }
    }
}
