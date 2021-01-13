import java.util.ArrayList;
import java.util.Date;

//Identidad
public class Doctor extends User {
    //Atributos
    private String speciality;

    Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return "Doctor{" + '\n' + super.toString() +
                "speciality = " + speciality + '\n' +
                "Available Appointments{"  + availableAppointments.toString() + '\n' +
                '}';
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

        @Override
        public String toString() {
            return  '\n' + "{" +
                    "date = " + date + '\n' +
                    "time = " + time + '\n' +
                    '}';
        }
    }
}
