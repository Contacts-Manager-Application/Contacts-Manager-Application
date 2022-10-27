package util;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Methods {
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
} // end of Methods

