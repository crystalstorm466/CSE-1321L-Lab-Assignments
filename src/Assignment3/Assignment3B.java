package Assignment3;
import java.util.*;
public class Assignment3B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Martial Art Belt]");

        int beltGrade;

        System.out.print("What belt grade are you? ");
        beltGrade = scan.nextInt();
        scan.nextLine();
        switch (beltGrade) {
            case 0:
                System.out.println("You have a Black Belt,\n with 0 stripes!");
                break;
            case 1:
                System.out.println("You have a Brown Belt,\n with 2 stripes!");
                break;
            case 2:
                System.out.println("You have a Brown Belt,\n with 1 stripes!");
                break;
            case 3:
                System.out.println("You have a Green Belt,\n with 2 stripes!");
                break;
            case 4:
                System.out.println("You have a Green Belt,\n with 1 stripes!");
                break;
            case 5:
                System.out.println("You have a Blue Belt,\n with 2 stripes!");
                break;
            case 6:
                System.out.println("You have a Blue Belt,\n with 1 stripes!");
                break;
            case 7:
                System.out.println("You have a Yellow Belt,\n with 2 stripes!");
                break;
            case 8:
                System.out.println("You have a Yellow Belt,\n with 1 stripes!");
                break;
            case 9:
                System.out.println("You have a White Belt,\n with 0 stripes!");
                break;
            case 10:
                System.out.println("You have a White Belt,\n with 1 stripes!");
                break;
            default:
                System.out.println("You have no belt...");
        }


    }
}
