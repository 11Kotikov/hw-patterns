package builder.director;

import builder.builders.Builder;
import builder.components.Material;
import builder.houses.HouseType;

//этот класс - босс, руководит сотрудниками!
public class Director {
    public void buildStoneMansion(Builder builder) {
        builder.setHouseType(HouseType.MANSION);
        builder.setRooms(10);
        builder.setMaterial(Material.STONE);
    }
    public void buildWoodMansion(Builder builder) {
        builder.setHouseType(HouseType.MANSION);
        builder.setRooms(10);
        builder.setMaterial(Material.WOOD);
    }
    public void buildMediumApartment(Builder builder) {
        builder.setHouseType(HouseType.APARTMENT);
        builder.setRooms(3);
        builder.setMaterial(Material.BRICK);
    }
    public void buildLargeApartment(Builder builder) {
        builder.setHouseType(HouseType.APARTMENT);
        builder.setRooms(5);
        builder.setMaterial(Material.BRICK);
    }
}
