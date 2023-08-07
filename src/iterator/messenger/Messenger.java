package iterator.messenger;

import iterator.data.DataStorage;
import iterator.iterators.ProfileIterator;
import iterator.profile.Profile;

//простой класс имитирующий отправку сообщений
public class Messenger {
    public DataStorage data;
    public ProfileIterator iterator;
    public Messenger (DataStorage dataFrom){
        this.data = dataFrom;
    }
    public void sendMessageToFriends (String profilePhoneNumber, String message) {
        System.out.println("\nИдём по списку друзей...\n");
        iterator = data.makeFriendsIterator(profilePhoneNumber);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getPhone(), message);
        }
    }
    public void sendMessageToEmployees(String profilePhoneNumber, String message) {
        System.out.println("\nИдём по списку сотрудников...\n");
        iterator = data.makeEmployeeIterator(profilePhoneNumber);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getPhone(), message);
        }
    }
    private void sendMessage(String phone, String message) {
        System.out.println("Отправил сообщение профилю: " + phone + "; Сообщение: " + message + "[]");
    }

}
