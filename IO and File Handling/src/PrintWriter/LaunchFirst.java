package PrintWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LaunchFirst {


    public static void main(String[] args) throws IOException {

        File file = new File("Basics.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);

        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.print("Hiii");

        printWriter.println("! Mangesh");

        printWriter.println("I'm glad to see u here");

        printWriter.println("Thanks");

        printWriter.flush();
        printWriter.close();

    }


}
