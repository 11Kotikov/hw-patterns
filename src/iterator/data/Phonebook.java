package iterator.data;

import iterator.iterators.PhonebookIterator;
import iterator.iterators.ProfileIterator;
import iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

//здесь мы реализуем REST-API нашей телефонной книги
public class Phonebook implements DataStorage {
    private List<Profile> profiles;

    public Phonebook(List<Profile> phoneBook) {
        if (phoneBook != null) {
            this.profiles = phoneBook;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromPhonebook (String profilePhoneNumber) {
        System.out.println("Отправляем абоненту: " + profilePhoneNumber + "ваше сообщение");
        return findProfile(profilePhoneNumber);
    }

    public List<String> requestProfileFromPhonebookContacts(String profilePhoneNumber, String contactType) {
        System.out.println("Категория: " + contactType + " номер: " + profilePhoneNumber);
        Profile profile = findProfile(profilePhoneNumber);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileNumber) {
        for (Profile profile : profiles) {
            if (profile.getPhone().equals(profileNumber)) {
                return profile;
            }
        }
        return null;
    }

    @Override
    public ProfileIterator makeFriendsIterator(String profilePhoneNumber) {
        return new PhonebookIterator(this, "friends", profilePhoneNumber);
    }

    @Override
    public ProfileIterator makeEmployeeIterator(String profilePhoneNumber) {
        return new PhonebookIterator(this, "employee", profilePhoneNumber);
    }
}
