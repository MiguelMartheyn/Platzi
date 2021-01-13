import javax.jws.soap.SOAPBinding;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {


        /*
        //Creando objeto
        Doctor myDoctor = new Doctor(); //new Doctor() Metodo Constructor
        //Instanciando objeto
        myDoctor.name = "Alejandro Rodriguez";
        //myDoctor.showName();
       // myDoctor.showId();

        //Creando objeto
        Doctor myDoctorAnn = new Doctor(); //new Doctor() Metodo Constructor
        //Instanciando objeto
        myDoctorAnn.name = "Andres Perez";
       // myDoctorAnn.showName(); de la instancia creada trae el metodo showName
       // myDoctorAnn.showId(); de la instancia creada trae el metodo showId

        //Creando objeto
        Patient myPatient = new Patient("Miguel Martheyn","miguel.martheyn@globant.com");
         */

        Doctor myDoctor = new Doctor("Anahi Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

       /* for (Doctor.AvailableAppointment aA:myDoctor.getAvailableAppointments()
             ) {
            System.out.println(aA.getDate() + " "+ aA.getTime());
        }
*/
        Patient patient = new Patient("Alejandra","alejandra@gmail.com");

        System.out.println(patient);
        System.out.println("");
        System.out.println(myDoctor);

       // showMenu(); // Entra a la clase ui.UIMenu y me trae el metodo showMenu()
    }


}

