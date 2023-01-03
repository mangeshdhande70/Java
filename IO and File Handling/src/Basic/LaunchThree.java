/**
 * check file and count .png, .txt, .zip
 */



package Basic;

import java.io.File;
import java.io.IOException;

public class LaunchThree {

    public static void main(String[] args) throws IOException {


        String path = "D://mangesh.dhande//OneDrive - Infosys Limited//Desktop//Spring";

        File file = new File(path , "Photos.png");
        file.createNewFile();

        File file1 = new File(path);

        int jpgFileCount = 0;
        int dirCount = 0;
        int zipFileCount = 0;
        int textFileCount = 0;

        for (String name : file1.list()) {

            if (name.endsWith(".png"))
                jpgFileCount++;
            else if (name.endsWith(".zip"))
                zipFileCount++;
            else if (name.endsWith(".txt")) {
                textFileCount++;

            }
            else
                dirCount++;

        }

        System.out.println("JPG File :: "+jpgFileCount);
        System.out.println("ZIP File :: "+zipFileCount);
        System.out.println("TEXT File :: "+textFileCount);
        System.out.println("Directory Foldet :: "+dirCount);


    }

}
