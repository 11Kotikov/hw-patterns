package iterator.iterators;

import iterator.data.Phonebook;
import iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class PhonebookIterator implements ProfileIterator {
    private Phonebook phonebook;
    private String typeOfContact;
    private String profilePhoneNumber;
    private int currentPosition = 0;
    private List<String> phoneNumbers = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    //чтобы получать всю необходимую информацию из списка контактов,
    //нужно переопределить методы основного интерфейса:

    public PhonebookIterator(Phonebook phonebook, String type, String profilePhoneNumber) {
        this.phonebook = phonebook;
        this.typeOfContact = type;
        this.profilePhoneNumber = profilePhoneNumber;
    }

    private void loadInto() {
        if (phoneNumbers.size() == 0) {
            List<String> profiles = phonebook.requestProfileFromPhonebookContacts(this.profilePhoneNumber, this.typeOfContact);
            for (String profile : profiles) {
                this.phoneNumbers.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return currentPosition < phoneNumbers.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }
        String friendPhoneNumber = phoneNumbers.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = phonebook.requestProfileFromPhonebook(friendPhoneNumber);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }
}
