package by.itacademy.Task2;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String nameOfRoom;
       //пл комнаты
    private double sq;
    //площадь занятого места
    private double unfreeSq;
    private int numberOfWindows;
    private int numberOfLamp;



    private List<Lamp> lampList = new ArrayList<>();
    private List<Furniture> furnitureList = new ArrayList<>();


    public int getNumberOfLamp() {
        return numberOfLamp;
    }

    public void setNumberOfLamp(int numberOfLamp) {
        this.numberOfLamp = numberOfLamp;
    }

    public double getUnfreeSq() {
        return unfreeSq;
    }

    public void setUnfreeSq(double unfreeSq) {
        this.unfreeSq = unfreeSq;
    }

    public Room(String nameOfRoom, double sq, int numberOfWindows,int numberOfLamp) {
        this.nameOfRoom = nameOfRoom;
        this.sq = sq;
        this.numberOfWindows = numberOfWindows;
        this.numberOfLamp = numberOfLamp;
        this.lampList = lampList;
        this.furnitureList = furnitureList;

    }

    public String getNameOfRoom() {
        return nameOfRoom;
    }

    public void setNameOfRoom(String nameOfRoom) {
        this.nameOfRoom = nameOfRoom;
    }

    public double getSq() {
        return sq;
    }

    public void setSq(double sq) {
        this.sq = sq;
    }

    public double getFreeSq() {
        return unfreeSq;
    }

    public void setFreeSq(double freeSq) {
        this.unfreeSq = freeSq;
    }


    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public List<Lamp> getLampList() {
        return lampList;
    }

    public void setLampList(List<Lamp> lampList) {
        this.lampList = lampList;
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void setFurnitureList(List<Furniture> furnitureList) {
        this.furnitureList = furnitureList;
    }


    public void addLamp(Lamp lamp) throws IlluminanceTooMuchException {
       for (Lamp lamp1:lampList){
           double light =+ lamp1.getLight();
        if(light+(numberOfWindows*700) >= 4000){
            throw new IlluminanceTooMuchException("Превышена освещенность помещения");
        }
        }
        lampList.add(lamp);

    }
    public void addFurniture(Furniture furniture)throws SpaceUsageTooMuchException{
        //здесь проверяем влазит ли мебель, через исключение
for(Furniture furniture1: furnitureList){
    unfreeSq =+ furniture1.getSq();
        if(unfreeSq >= sq*0.7 ){
            throw  new SpaceUsageTooMuchException("Мебель должна занимать не более 70% помещения!!!");
        }
   // unfreeSq =furniture1.getSq();
    }
        furnitureList.add(furniture);

    }



}


