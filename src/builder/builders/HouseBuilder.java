package builder.builders;

import builder.components.Material;
import builder.houses.House;
import builder.houses.HouseType;

public class HouseBuilder implements Builder{
    private HouseType houseType;
    private int howManyRooms;
    private Material material;

    //через конкретные шаги-методы реализуем общий интерфейс
    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setRooms(int roomsNumber) {
        this.howManyRooms = roomsNumber;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    public House getResult(){
        return new House(houseType, howManyRooms, material);
    }
}
