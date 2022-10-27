package util;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Methods {
    // Path to our file
    static Path p = Paths.get("src","ContactsInfo","contacts.txt");

    // This is our main menu methods
    public static void mainMenu(){
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
        System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
    }
    public static void printOutEverything() {
        try {
            Path path = FileSystems.getDefault().getPath("contacts.txt");
            List<String> data = Files.readAllLines(path);
            for(String info : data) {
                System.out.println(info);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    } // end of printOutEverything

    private static List<String> readLines() {
        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }
    public static void addNameAndNumber (){
        System.out.println("Name | Phone number:\n" + "------------------");
    }
    public static void addPerson() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a contact name");
        String newContact = scanner.next();
        System.out.println("Enter the contact number for: " + newContact);
        int newContactNumber = scanner.nextInt();
        System.out.println("The contact name and number you entered is: " + newContact + ", " + newContactNumber);
        Files.write(Paths.get("contacts.txt"), Arrays.asList(newContact + "|" + newContactNumber), StandardOpenOption.APPEND);;
        printOutEverything();
    } // end of addPerson

    private static void deleteName(){
//        List<String> updatedNames = new ArrayList<>();
//        for (String name : readLines()) {
//            if (!name.equalsIgnoreCase(nameToDelete)) {
//                updatedNames.add(name);
//            }
//        }
    }

} // end of Methods

