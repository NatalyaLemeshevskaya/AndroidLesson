package by.itacademy.Task6;

public class Main {
    public static void main(String[] args) {
        //для нестатичного
      //  Car.Window window= (new Car()).new Window();
        //для статичного
        Car.Window window = new Car.Window();
        Car.Listener listener = new Car.Listener() {
            @Override
            public void onClick() {

            }
        };



    }
}
