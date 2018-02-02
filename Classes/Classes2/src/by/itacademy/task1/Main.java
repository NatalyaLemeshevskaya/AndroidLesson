package by.itacademy.task1;

public class Main {
    //
    public static void main(String[] arg){

        People[] peopleArray= new People[2];

        People people1= new People("aaa",25);

        People people2= new People();
        people2.setName("sdad");
        people2.setAge(24);

              peopleArray[0]=people1;
        peopleArray[1]=people2;


        printPeople(people1);
        printPeople(people2);

        for(People people:peopleArray){
            printPeople(people);
            break;
        }

        }
        public static void printPeople(People people){

        System.out.println("name ="+people.getName());
        System.out.println("age ="+people.getAge());


    }
}
