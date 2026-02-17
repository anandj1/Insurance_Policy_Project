package utils;

import java.io.FileWriter;
import java.io.IOException;

public class Log {

    public static void info(String message) throws IOException {

        System.out.println("[INFO] " + message);

        FileWriter fw = new FileWriter("automation.log", true);
        fw.write("[INFO] " + message + "\n");
        fw.close();
    }
}