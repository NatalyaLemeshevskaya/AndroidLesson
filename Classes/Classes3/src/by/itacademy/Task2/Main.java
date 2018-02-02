package by.itacademy.Task2;

public class Main {
    public static void main(String[] args) {
         Pacient pacient = new Pacient();
         pacient.setName("ds");
         pacient.setDoctorName("dfsdf");

         System.out.println(pacient.getName()+" "+pacient.getDoctorName());

         Object object = new Object();


         // полиморфизм
         People people = new Pacient();
         // нельзя Pacient pacient = new People();


    }
}
