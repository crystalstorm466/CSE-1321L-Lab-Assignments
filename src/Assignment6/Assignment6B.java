package Assignment6;
import java.util.*;
public class Assignment6B {
    public static void main(String[] args) {
        System.out.println("[What's my datatype?]");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int userInt = scan.nextInt();
        System.out.print("Enter a string: ");
        String userString = scan.next();
        System.out.print("Enter a float: ");
        float userFloat = scan.nextFloat();
        System.out.print("Enter a char: ");
        char userChar = scan.next().charAt(0);
        System.out.print("Enter a boolean: ");
        boolean userBoolean = scan.nextBoolean();

        System.out.println("What datatype do you want to check?");
        String choice = scan.next();
        String answer = WhatsMyType(choice, userInt, userFloat, userChar, userBoolean, userString);
        System.out.println("'" + answer + "' is a " + choice + " value!");
    }

    public static String WhatsMyType(String data, int usrInt, float usrFlo, char usCh, boolean usB, String userStr) {
      if (data.equalsIgnoreCase("int")) {
          String newType = String.valueOf(usrInt);
          return newType;
      } else if (data.equalsIgnoreCase("string")) {
          return userStr;
      } else if (data.equalsIgnoreCase("float")) {
          String newType = String.valueOf(usrFlo);
          return newType;
      } else if (data.equalsIgnoreCase("char")) {
            String newType = String.valueOf(usCh);
            return newType;
      } else if (data.equalsIgnoreCase("boolean")) {
          String newType = String.valueOf(usB);
          return newType;
      }
      return null;
    }
}
