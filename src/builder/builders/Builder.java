package builder.builders;

import builder.components.Material;
import builder.houses.HouseType;

// Интерфейс строителя:
public interface Builder {
    void setHouseType(HouseType houseType);
    void setRooms(int roomsNumber);
    void setMaterial (Material material);
}
