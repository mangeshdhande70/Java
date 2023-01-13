package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LaunchFirst {


    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C://Users//mangesh.dhande//IdeaProjects//Java//IO and File Handling//src//Properties//application.properties");

        Properties properties = new Properties();
        properties.load(fileInputStream);

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String pass = properties.getProperty("password");

        // if you not give same name in argument then return null
        String pass1 = properties.getProperty("pass");



        System.out.println("URL :: "+url);
        System.out.println("User :: "+user);
        System.out.println("password :: "+pass);


    }

}
