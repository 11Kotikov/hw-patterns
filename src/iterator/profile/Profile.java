package iterator.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private String name;
    private String phone;
    private Map<String, List<String>> contacts = new HashMap<>();
//здесь класс отвечающий за создание экземпляров различных контактов
    public Profile(String phone, String name, String... contacts) {
        this.name = name;
        this.phone = phone;

        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String contactType = "friend", contactPhone;
            if (parts.length == 1) {
                contactPhone = parts[0];
            } else {
                contactType = parts[0];
                contactPhone = parts[1];
            }
            if (!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }
            this.contacts.get(contactType).add(contactPhone);
        }
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }


}
