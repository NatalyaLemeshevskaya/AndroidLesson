package by.itacademy.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        List<Person> men = new ArrayList<>();
        men.add(new Person("Петров","Иван","Сергеевич"));
        men.add(new Person("Сидоров","Степан","Григорьевич"));
        men.add(new Person("Иванов","Федор","Александрович"));
        List<Person> women = new ArrayList<>();
        women.add(new Person("Пробника","Алеся","Петровна"));
        women.add(new Person("Остахова","Ольга","Анатольевна"));
        women.add(new Person("Сидорова","Карина","Максимовна"));


        Map<String,List<Person>> map = new HashMap<>();
        map.put("men",men);
        map.put("women",women);


        System.out.println("If you want get random value from MEN put (men), if from women - (women)  ");
        String nameOfKey = scanner.nextLine();
        switch (nameOfKey){
            case "men" :{
                List<Person> myRandomValues = map.get("men");
                Person answer = myRandomValues.get( random.nextInt(myRandomValues.size() )  );
                System.out.println(answer);
                break;
            }
            case "women":
                List<Person> myRandomValues = map.get("women");
                Person answer = myRandomValues.get( random.nextInt(myRandomValues.size() )  );
                System.out.println(answer);
                break;
             default:
                 System.out.println("Are you sure? ");

        }


    }

}
