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

    private List<Lamp> lampList = new ArrayList<>();
    private List<Furniture> furnitureList = new ArrayList<>();



    public double getUnfreeSq() {
        return unfreeSq;
    }

    public void setUnfreeSq(double unfreeSq) {
        this.unfreeSq = unfreeSq;
    }

    public Room(String nameOfRoom, double sq, int numberOfWindows) {
        this.nameOfRoom = nameOfRoom;
        this.sq = sq;
        this.numberOfWindows = numberOfWindows;
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
        //здесь так же проверяем
        if(lamp.getLight()+(numberOfWindows*700) >= 4000){
            throw new IlluminanceTooMuchException("Превышена освещенность помещения");
        }
        lampList.add(lamp);

    }
    public void addFurniture(Furniture furniture)throws SpaceUsageTooMuchException{
        //здесь проверяем влазит ли мебель, через исключение

        if(unfreeSq > sq*0.7 ){
            throw  new SpaceUsageTooMuchException("Мебель должна занимать не более 70% помещения!!!");
        }
        furnitureList.add(furniture);

    }



}


