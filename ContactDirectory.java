import java.util.ArrayList;
import java.util.HashMap;

public class ContactDirectory {
    // Step 1: Define a HashMap to store contacts
    private final HashMap<String, ArrayList<String>> contactDirectory = new HashMap<>();

    // Step 3: Method to add a contact
    public void addContact(String name, String number) {
        // If contact already exists, add number to the list
        if (contactDirectory.containsKey(name)) {
            contactDirectory.get(name).add(number);
        } else {
            // Otherwise, create a new list and add the number
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            contactDirectory.put(name, numbers);
        }
    }

    // Method to print all contacts
    public void printContacts() {
        for (String name : contactDirectory.keySet()) {
            System.out.println(name + " -> " + contactDirectory.get(name));
        }
    }

    public static void main(String[] args) {
        ContactDirectory directory = new ContactDirectory();

        // Step 2: Add contacts with multiple phone numbers
        directory.addContact("Alice", "12345");
        directory.addContact("Alice", "67890");
        directory.addContact("Bob", "54321");
        directory.addContact("Charlie", "98765");

        // Step 4: Print all contacts
        directory.printContacts();
    }
}
