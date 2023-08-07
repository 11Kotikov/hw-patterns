package builder.builders;

import builder.components.Material;
import builder.houses.Documentation;
import builder.houses.HouseType;

public class HouseDocumentsBuilder implements Builder{
    private HouseType houseType;
    private int howManyRooms;
    private Material material;

    //те же шаги, что и в СтроителеДомов(HouseBuilder), но применимо к
    // созданию документов по дому

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

    public Documentation getResult(){
        return new Documentation(houseType, howManyRooms, material);
    }
}
