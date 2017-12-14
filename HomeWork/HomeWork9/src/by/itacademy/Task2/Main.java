package by.itacademy.Task2;

public class Main {
    public static void main(String[] args) {

        Build build = new Build("Здание 1");
        Room room1 = new Room("Комната1",50.0,2,3);
        Room room2 = new Room("Комната2",14.0,1,2);
        build.addRoom(room1);
        build.addRoom(room2);

        try {
            room1.addFurniture(new Table(10,"Стол из дуба"));
            room1.addFurniture(new Sofa(15,"Раскладная софа"));


        }catch (SpaceUsageTooMuchException e){
            System.out.println(e.getRussionMessage());
        }

        try {
            room1.addLamp(new Lamp(400));
            room1.addLamp(new Lamp(500));
            room1.addLamp(new Lamp(300));




        }catch (IlluminanceTooMuchException e)
        {
            System.out.println(e.getRussionMessage());
        }


        try {
            room2.addFurniture(new Armchair(2, "Кресло с накидкой"));
            room2.addFurniture(new Table(5,"Журнальный столик "));

        }catch (SpaceUsageTooMuchException e){
            System.out.println(e.getRussionMessage());
        }

       try {
            room2.addLamp(new Lamp(300));
            room2.addLamp(new Lamp(500));

        }catch (IlluminanceTooMuchException e)
        {
            System.out.println(e.getRussionMessage());
        }



System.out.println(build.getNameOfBuilt()+"\n "+room1.getNameOfRoom()+"\n "+
        "Площадь комнаты: "+room1.getSq()+" м^2 "+ "Занято "+room1.getUnfreeSq()+" м^2 "+"\n " +
        "Освещенность: Окон - "+room1.getNumberOfWindows()+" по 700 лк. Лампочек - " +
        room1.getLampList().size()+"\n  Мебель: "+room1.getFurnitureList().size() );


 System.out.println(room2.getNameOfRoom()+"\n "+
                "Площадь комнаты: "+room2.getSq()+" м^2 "+ "Занято "+room2.getUnfreeSq()+" м^2 "+"\n " +
                "Освещенность: Окон - "+room2.getNumberOfWindows()+" по 700 лк. Лампочек - " +
                room2.getLampList().size()+"\n  Мебель: "+room2.getFurnitureList().size()   );



    }
}
