import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagementSystem {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add a contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. View all contacts");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    viewContacts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addContact() {
        System.out.println("Enter the name:");
        String name = scanner.nextLine();

        System.out.println("Enter the phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter the email:");
        String email = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber, email);
        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }

    private static void removeContact() {
        System.out.println("Enter the index of the contact to remove:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts.");
        } else {
            System.out.println("Contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(i + ". " + contacts.get(i));
            }
        }
    }
}
