package Practice;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

/**
 * To save only non-duplicate mobile no
 */
public class LaunchFour {


    public static void main(String[] args) throws IOException {

       String path = "C://Users//mangesh.dhande//IdeaProjects//Java//IO and File Handling//Text Files";


       usingSimple(path);

       usingCollection(path);


    }


    public static void usingSimple(String path) throws IOException {
        File file = new File(path,"removeDupNo.txt");

        PrintWriter pr = new PrintWriter(new FileWriter(file));

        File file2 = new File(path , "Mobil.txt");

        FileReader fileReader = new FileReader(file2);

        BufferedReader br = new BufferedReader(fileReader);
        String line1 = br.readLine();

        while (line1!=null)
        {
            boolean isAvailable = false;
            BufferedReader br2 = new BufferedReader(new FileReader(file));
            String line2  = br2.readLine();

            while (line2!=null) {
                if (line1.equals(line2)) {
                    isAvailable = true;
                    break;
                }
                line2 = br2.readLine();
            }

            if (isAvailable==false) {
                pr.println(line1);
                pr.flush();
            }
            line1 = br.readLine();

        }
        pr.close();
    }



    public static void usingCollection(String path) throws IOException {

        File file2 = new File(path , "Mobil.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));

        String line = bufferedReader.readLine();

        File file = new File(path , "UsingHashSet.txt");

        PrintWriter pr = new PrintWriter(new FileWriter(file));

        HashSet hs = new HashSet();

        while (line!=null)
        {
            hs.add(line);
            line = bufferedReader.readLine();
        }


        System.out.println("list "+hs);



        Iterator iterator =  hs.iterator();

        while (iterator.hasNext())
        {
            pr.println(iterator.next());
        }

        pr.flush();
        pr.close();


    }


}
