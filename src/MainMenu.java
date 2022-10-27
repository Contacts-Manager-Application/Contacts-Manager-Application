import util.Input;
import util.Methods;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static util.Methods.printOutEverything;

public class MainMenu extends Methods{
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
            case 1:
                printOutEverything();
                break;
            case 2:
                System.out.println("Enter a contact name");
                String newContact = scanner.next();
                System.out.println("Enter the contact number for: " + newContact);
                int newContactNumber = scanner.nextInt();
                System.out.println("The contact name and number you entered is: " + newContact + ", " + newContactNumber);
                Files.write(Paths.get("contacts.txt"), Arrays.asList(newContact + "|" + newContactNumber), StandardOpenOption.APPEND);;
                printOutEverything();
                break;
            case 3:
                System.out.println("something");
            case 4:
                System.out.println("something");
            case 5:
                System.out.println("Have a good day!");
                break;
        }
//        void printOutEverything() {
//            try {
//                Path path = FileSystems.getDefault().getPath("contacts.txt");
//                List<String> data = Files.readAllLines(path);
//                for(String info : data) {
//                    System.out.println(info);
//                }
//            } catch(IOException e) {
//                e.printStackTrace();
//            }

        }
//        }

//    private static void addPerson() {
//        System.out.println("Enter a contact name");
//        String newContact = scanner.next();
//        System.out.println("Enter the contact number for: " + newContact);
//        int newContactNumber = scanner.nextInt();
//        System.out.println("The contact name and number you entered is: " + newContact + ", " + newContactNumber);
//        Files.write(Paths.get("contacts.txt"), Arrays.asList(newContact + "|" + newContactNumber), StandardOpenOption.APPEND);;
//        printOutEverything();
//    }
} // End of Main
//

//        while(!userChoice.equals("0")){
//                System.out.println("What would you like to do?\n" +
//                "\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category\n" +
//                "6 - Add a new movie");
//                userChoice = input.getString("Enter your choice:");
//                switch(userChoice){
//                case "0":
//                // do this
//                break;
//                case "1":
//                for (Movie movie : movies){
//                String name = movie.getName();
//                String category = movie.getCategory();
//                System.out.printf("%s -- %s%n", name, category);
//                }
//                break;
//                case "2":
//                for (Movie movie : movies){
//                String category = movie.getCategory();
//                String name = movie.getName();
//                if (category.equals("animated")){
//                System.out.printf("%s -- %s%n", name, category);
//                }
//                }
//                break;
//                case "3":
//                getAllMoviesFromCategory("drama", movies);
//                break;
//                case "4":
//                getAllMoviesFromCategory("horror", movies);
//                break;
//                case "5":
//                getAllMoviesFromCategory("scifi", movies);
//                break;
//                case "6":
//                String title = input.getString("Enter the name of the movie:");
//                String category = input.getString("Enter the category of the movie:");
//                Movie newMovie = new Movie(title, category);
//                movies = addMovie(newMovie, movies);
//                break;
//default:
//        System.out.println("Be more smarter! Follow directions!");
//        break;
//        }
//        }