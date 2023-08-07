package builder.houses;

import builder.components.Material;

public class Documentation {

    //этот класс - информация о доме - другой продукт, не зависимый от первого продукта
    private final HouseType houseType;
    private final int roomsNumber;
    private final Material material;

    public Documentation(HouseType houseType, int howManyRooms, Material material) {
        this.houseType = houseType;
        this.roomsNumber = howManyRooms;
        this.material = material;
    }

    public String getHouseInfo() {
        String info = "";
        info += "Type of the House is: " + houseType + "\n";
        info += "the number of rooms is: " + roomsNumber + "\n";
        info += "Material is: " + material + "\n";
        return info;
    }
}
