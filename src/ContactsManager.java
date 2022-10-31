import contacts.Contact;

import java.io.IOException;
import java.util.*;

import static util.Methods.*;

public class ContactsManager {

    public static <userInput> void main(String[] args) throws IOException {
        HashMap<String, String> contacts = new HashMap<>();
        System.out.println("Would you like to make a contact list (yes or no)?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while (!userInput.equals("no")) {
            viewMenu();
            userInput = scanner.nextLine();
            switch (userInput) {
                case "1" -> { // View contacts.
                    loadData(contacts);
                    addNameAndNumber(contacts);
                }
                case "2" -> { // Add a new contact.
                    addNewContact(contacts,scanner);
                    writeData(contacts);
                }
                case "3" -> { // Search a contact by name.
                    System.out.println("Enter the name of the user");
                    String userSelection = scanner.nextLine();
                    for (Map.Entry<String, String> set : contacts.entrySet()) {
                        if (set.getKey().contains(userSelection)) {
                            System.out.println(userSelection + " " + set.getValue());
                        } else {
                            continue;
                        }
                    }
                }
                case "4" -> { // Delete an existing contact.
                    System.out.println("Enter the name of the user to remove");
                    System.out.println(contacts);
                    String userSelection1 = scanner.nextLine();
                    System.out.println(userSelection1);
                    contacts.remove(userSelection1);
                    writeData(contacts);
                }
                case "5" -> // Exit
                    // does break but then option to do something appears again
                    userInput = "no";
            }
        }
        System.out.println("Have a nice day!");
    }// end of main
} // End of Class
