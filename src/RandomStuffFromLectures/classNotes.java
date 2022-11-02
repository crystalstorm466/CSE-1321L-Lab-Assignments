package RandomStuffFromLectures;

import java.util.Scanner;

public class classNotes {
    public class Dog {

    } //smallest class; apparently this is a question on exam

    public static boolean rabid = false;
    public static double weight = 0;
    String name = " ";
    public static Scanner scan = new Scanner(System.in);
    public String name() {
        System.out.println("Name dog: ");
        name = scan.next();
        return name;
    }

}
