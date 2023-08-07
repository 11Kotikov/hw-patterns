package builder;

import builder.builders.HouseBuilder;
import builder.builders.HouseDocumentsBuilder;
import builder.director.Director;
import builder.houses.Documentation;
import builder.houses.House;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(); //создаём директора
        HouseBuilder builder = new HouseBuilder(); // создаём строителя
        HouseDocumentsBuilder docBuilder = new HouseDocumentsBuilder(); //создаём создателя документов по дому
        Documentation houseDoc = docBuilder.getResult(); //сюда запишем компоненты

//строим какой-то объект
        director.buildLargeApartment(builder);
        House superApartment = builder.getResult(); //информацию получаем сразу от строителя
        System.out.println("Super " + superApartment.getHouseType());
        director.buildLargeApartment(docBuilder);
        System.out.println(houseDoc.getHouseInfo());
//а вот ещё один
        director.buildStoneMansion(builder);
        House greatMansion = builder.getResult();
        System.out.println("Great " + greatMansion.getHouseType());
        director.buildStoneMansion(docBuilder);
        System.out.println(houseDoc.getHouseInfo());
    }
}