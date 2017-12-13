package by.itacademy.Task2;

import java.util.ArrayList;
import java.util.List;

public class Build {

    private String nameOfBuilt;
    private List<Room> roomList = new ArrayList<>();
    public List<Room> getRoomList() {
        return roomList;
    }



    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }



    public Build(List<Room> roomList) {
        this.roomList = roomList;
    }

    public String getNameOfBuilt() {
        return nameOfBuilt;
    }

    public void setNameOfBuilt(String nameOfBuilt) {
        this.nameOfBuilt = nameOfBuilt;
    }

    public void addRoom(Room room){
        roomList.add(room);
    }


    public Build(String nameOfBuilt) {
        this.nameOfBuilt = nameOfBuilt;
    }
}
