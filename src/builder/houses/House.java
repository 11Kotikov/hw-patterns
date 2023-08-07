package builder.houses;

import builder.components.Material;

// этот класс - конкретный продукт
public class House {
    private final HouseType houseType;
    private final int roomsNumber;
    public House(HouseType houseType, int howManyRooms, Material material){
        this.houseType = houseType;
        this.roomsNumber = howManyRooms;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }
}


