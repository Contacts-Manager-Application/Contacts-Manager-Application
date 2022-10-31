package util;
import contacts.Contact;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

import static util.Input.scanner;

public class Methods {
    static HashMap<String, String> contacts = new HashMap<>();
    public static void viewMenu(){
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
        System.out.println("Select an option from above: ");
    } // end of viewMenu
    public static void addNameAndNumber (HashMap<String, String> contacts){
        System.out.println("Name | Phone number:\n" + "------------------");
        for (Map.Entry<String, String> set : contacts.entrySet()) {
            System.out.println((set.getKey() + " | " + set.getValue()));
        }
    } // end of addNameAndNumber

    public static void addNewContact(HashMap<String, String> contacts,Scanner scanner){
        System.out.println("Enter a name");
        String userName = scanner.nextLine();
        System.out.println("Enter a number");
        String userNumber = scanner.nextLine();
        Contact person = new Contact(userName, userNumber);
        contacts.put(userName, String.valueOf(userNumber));
        System.out.println(contacts.size());
    }
    public static void searchByName(HashMap<String, String> contacts,Scanner scanner){
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

    public static void deleteContacts(HashMap<String, String> contacts,Scanner scanner) throws IOException {
        System.out.println("Enter the name of the user to remove");
        System.out.println(contacts);
        String userSelection1 = scanner.nextLine();
        System.out.println(userSelection1);
        contacts.remove(userSelection1);
        writeData(contacts);

    }
    public static void loadData(HashMap<String, String> contacts) {
        try {
            Path path = FileSystems.getDefault().getPath("contacts.txt");
            List<String> data = Files.readAllLines(path);
            for(String info : data) {
                String[] Parts = info.split(";");
                contacts.put(Parts[0].strip(), new String(Parts[1].strip())) ;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    } // end of loadData

    public static void writeData(HashMap<String, String> contacts) throws IOException {
        List<String> data = new ArrayList<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            data.add(entry.getKey() + ";" + entry.getValue());
        }
        Files.write(Paths.get("contacts.txt"), data);
    } // end of writeData

    private static String[] readLines() {
        return new String[0];
    }

} // end of Methods