import util.Input;
import util.Methods;
import java.awt.image.BandedSampleModel;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static util.Methods.*;

public class MainMenu {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        boolean continueYesNo = true;

        do {
            mainMenu();
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1: // View contacts.
                    addNameAndNumber();
                    printOutEverything();
//                    continueYesNo = Input.yesNo();
                    break;
                case 2: // Add a new contact.
                    addPerson();
                    printOutEverything();
//                    continueYesNo = Input.yesNo();
                    break;
                case 3: // Search a contact by name.
                    System.out.println("Do you want to search for a user (yes or no?)");
                    String userSelection = scanner.next();
                    if (userSelection.equals("yes")) {
                        System.out.println("Enter the name of the user");
                        userSelection = scanner.next();
                        Path path = FileSystems.getDefault().getPath("contacts.txt");
                        List<String> data = Files.readAllLines(path);
                        for (String info : data) {
                            if (data.contains(userSelection)) {
                                System.out.println("User does exist");
                            } else {
                                System.out.println("User does not exist");
                            }
                        }
                    }
                    // This means boolean continueYesNo = true = Do you want to continue Y/N?
//                    continueYesNo = Input.yesNo();
                    break;
                case 4: // Delete an existing contact.
                    List<String> lines = Files.readAllLines(Paths.get("contact"));
                    List<String> newList = new ArrayList<>();
                    userSelection = scanner.next();
                    for (String line : lines) {
                        System.out.println(line);
//                    if (!line.equals(userSelection)) {
//                        newList.add(line);
//                        continue;
                    }
//                    newList.add(line);
//                Files.write(Paths.get("data", "groceries.txt"), newList);
//                    continueYesNo = Input.yesNo();
                case 5: // Exit.
                    System.out.println("Have a good day!");
                    continueYesNo = false;
                    break;
            } // End of switch case
        } while (!(userChoice == 5)); // End of while loop
    }// End of main
} // End of Class
