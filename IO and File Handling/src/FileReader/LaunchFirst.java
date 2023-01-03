package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFirst {

    public static void main(String[] args) throws IOException {


        File file = new File("iNeuron.txt");
        FileReader fileReader = new FileReader(file);

        // Reading the only one character

        int i = fileReader.read();
        while (i!=-1) {
            System.out.print((char) i);
            i= fileReader.read();
        }


    }


}
