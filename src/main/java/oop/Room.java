package oop;

public class Room {

    private int id;
    private int roomNumber;
    private int windowNumber;
    private int price;
    private boolean status;

    public Room(int id, int roomNumber, int windowNumber, int price, boolean status) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.windowNumber = windowNumber;
        this.price = price;
        this.status = status;
    }


    public static void main(String[] args) {
        Room room1 = new Room(1,201 , 2,400,false);
        Room room2 = new Room(2,803, 1,989,false);
        Room room3 = new Room(3,106 , 3,1099,true);
        Room room4 = new Room(4,456 , 1,177,false);

    }

}
