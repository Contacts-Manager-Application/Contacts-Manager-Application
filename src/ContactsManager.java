import contacts.Contact;

import java.io.IOException;
import java.util.*;

import static util.Methods.*;

public class ContactsManager {
    public static <userInput> void main(String[] args) throws IOException {
        HashMap<String, String> contacts = new HashMap<>();
        greeting();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while (!userInput.equals("no")) {
            mainMenu();
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
                    searchByName(contacts, scanner);
                }
                case "4" -> { // Delete an existing contact.
                    deleteContacts(contacts,scanner);
                }
                case "5" -> // Exit
                    // does break but then option to do something appears again
                    userInput = "no";
            }
        } // end of while loop
        farewell();
    }// end of main
} // End of Class
