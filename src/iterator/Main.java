package iterator;

import iterator.data.DataStorage;
import iterator.data.Phonebook;
import iterator.messenger.Messenger;
import iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { //отправляем какие-то сообщения
        DataStorage phonebook = new Phonebook(myPhonebook());
        Messenger messenger = new Messenger(phonebook);
        messenger.sendMessageToFriends("123", "Дима, погнали за пивом");
        messenger.sendMessageToEmployees("147", "Рабочая встреча переносится на 20 мин");
    }

    public static List<Profile> myPhonebook() { //наш список контактов
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("123", "Dima", "friends:1231"));
        data.add(new Profile("456", "Sereja","employees:4564"));
        data.add(new Profile("789", "Albert", "employees:7897"));
        data.add(new Profile("258", "Leonid","employees:2582"));
        data.add(new Profile("369", "Polina", "friends:3693"));
        return data;
    }

}
