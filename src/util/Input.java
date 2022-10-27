package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;
    // This is a getter
    public Scanner getScanner() {
        return scanner;
    }
    // This is a setter
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }
    // The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public static boolean yesNo() {
        System.out.println("Do you want to continue Y/N?");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes")||userInput.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }
    // The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt(int min, int max) {
        System.out.printf("Enter a integer from %d to %d", min, max);
        int userInput = scanner.nextInt();
        if(userInput <= max && userInput >= min){
            return userInput;
        } else {
            return getInt(min, max);
        }
    }
    public int getInt() {
        System.out.println("Enter a number");
        return scanner.nextInt();
    }
    public double getDouble(double min, double max) {
        System.out.printf("Enter a integer from %.2f to %.2f", min, max);
        double userInput = scanner.nextDouble();
        if(userInput <= max && userInput >= min){
            return userInput;
        } else {
            return getDouble(min, max);
        }
    }
    public double getDouble(){
        System.out.println("Enter a number %.2f");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
    // constructor
    public Input() {
        scanner = new Scanner(System.in);
    }

} // end of Input