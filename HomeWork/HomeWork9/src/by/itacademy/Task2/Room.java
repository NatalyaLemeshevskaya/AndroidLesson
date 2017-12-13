package by.itacademy.Task2;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private static final int maxPercent = 70;
    //пл комнаты
    private double sq;
    //площадь оставшегося места
    private double freeSq;
    private int numberOfWindows;
    private List<Lamp> lampList = new ArrayList<>();
    private List<Furniture> furnitureList = new ArrayList<>();


    public double getSq() {
        return sq;
    }

    public void setSq(double sq) {
        this.sq = sq;
    }

    public double getFreeSq() {
        return freeSq;
    }

    public void setFreeSq(double freeSq) {
        this.freeSq = freeSq;
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



    private void addLamp(Lamp lamp){
        //здесь так же проверяем
        lampList.add(lamp);

    }
    private void addFurniture(Furniture furniture)throws Exception{
        //здесь проверяем влазит ли мебель, через исключение

        if(){
            throw  new Exception();
        }
        furnitureList.add(furniture);

    }



}


