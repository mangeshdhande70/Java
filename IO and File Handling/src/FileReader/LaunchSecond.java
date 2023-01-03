package FileReader;

import java.io.*;

public class LaunchSecond {


    public static void main(String[] args) throws IOException {

        File file = new File("iNeuron.txt");

        FileReader fileReader = new FileReader(file);

        char[] charArr = new char[(int)file.length()];

        // Reading and Storing the one-one character in charArray
        fileReader.read(charArr);

        for (char ch :
                charArr) {

            System.out.print(ch);
        }






    }


}
