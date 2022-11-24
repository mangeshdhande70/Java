package String;

public class Remove_Character {

    public static void main(String[] args) {
        String str = "7030adn_+76()m$#54khfd14";
        str =  convert(str);
        System.out.println(str);

    }

    public static String convert(String str)
    {
        // numbers in ASCII start from 48 and end at 57

        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) < 48 || sb.charAt(i) > 57)
            {
               sb.deleteCharAt(i);
               i--;
            }
        }
        return sb.toString();

    }
}
