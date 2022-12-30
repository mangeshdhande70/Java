package ResourceTry;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

public class OpenFileUsingDesktop {


    public static void main(String[] args) {

        String path = "C://Users//mangesh.dhande//Downloads//sample3.txt";

        try {
               File file = new File(path);

            if (!Desktop.isDesktopSupported()){
                System.out.println("Desktop not supported");
                return;
            }

            Desktop desktop = Desktop.getDesktop();

            if (file.exists()){
                desktop.open(file);
            }

            FileInputStream obj = new FileInputStream(file);

            System.out.println("Content is : ");

            int c =0;
            while ((c = obj.read()) !=-1)
            {
//                System.out.print("         ");
                System.out.print((char)c);
            }

        }catch (Exception e)
        {
            System.out.println("in Catch");
            e.printStackTrace();
        }

    }


}
