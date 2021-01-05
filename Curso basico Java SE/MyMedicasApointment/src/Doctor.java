import java.util.ArrayList;
import java.util.Date;

//Identidad
public class Doctor {
    //Atributos
    int id = 0;//Auto Increment con metodo static
    static int contador = 0;//Auto Increment con metodo static
    private String name;
    private String speciality;
    private String email;



    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        contador++;
        id = contador;

    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    /* Clase Aninada static. Se crea en Doctor ya que este
    es el unico que generara citas, al ser el unico que comparte
    informacion con esta se procede con la creacion de clase anidada.
     */

    public static class AvailableAppointment{
        //Available Appointment
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
