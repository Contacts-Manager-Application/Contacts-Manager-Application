import util.Input;
import util.Methods;

import java.awt.image.BandedSampleModel;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static util.Methods.addPerson;
import static util.Methods.printOutEverything;

public class MainMenu {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        Methods methods = new Methods();

        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");

        System.out.println("Select an option from above: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

//        while (userChoice > 0 && userChoice < 6) {
//            System.out.println("1. View contacts.\n" +
//                    "2. Add a new contact.\n" +
//                    "3. Search a contact by name.\n" +
//                    "4. Delete an existing contact.\n" +
//                    "5. Exit.\n");

        System.out.println("User selected: " + userChoice);
        switch (userChoice) {
            case 1: // View contacts.
                printOutEverything();
                break;
            case 2: // Add a new contact.
                addPerson();
                printOutEverything();
                break;
            case 3: // Search a contact by name.
                System.out.println("Do you want to search for a user (yes or no?)");
                String userSelection = scanner.next();
                if (userSelection.equals("yes")) {
                    System.out.println("Enter the name of the user");
                    userSelection = scanner.next();
                    Path path = FileSystems.getDefault().getPath("contacts.txt");
                    List<String> data = Files.readAllLines(path);
                    for(String info : data) {
                        if (data.contains(userSelection)) {
                            System.out.println("User does exist");
                        } else {
                            System.out.println("User does not exist");
                        }
                    }
                }
            case 4: // Delete an existing contact.
                printOutEverything();
            case 5: // Exit.
                System.out.println("Have a good day!");
                break;
        }
    }// end of main
} // End of Class
