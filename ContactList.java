import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {
    private HashMap<String, Integer> contacts = new HashMap<>();

    // Method to add a contact
    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    // a) Check if a particular key exists
    public boolean hasContact(String name) {
        return contacts.containsKey(name);
    }

    // b) Check if a particular value exists
    public boolean hasPhoneNumber(Integer phoneNumber) {
        return contacts.containsValue(phoneNumber);
    }

    // c) Use Iterator to loop through the map
    public void printContacts() {
        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        contactList.addContact("John Doe", 1234567890);
        contactList.addContact("Jane Smith", 987654321);

        System.out.println("Does John Doe exist? " + contactList.hasContact("John Doe"));
        System.out.println("Does phone number 987654321 exist? " + contactList.hasPhoneNumber(987654321));

        System.out.println("Contacts:");
        contactList.printContacts();
    }
}

