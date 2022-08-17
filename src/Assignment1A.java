import java.util.Scanner;
public class Assignment1A {

    public static void main(String args[])
    {
        double width;
        double height;
        double resolution;

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the width (in pixels: ");
        width = scan.nextDouble();
        scan = new Scanner (System.in);

        System.out.print("Enter the height (in pixels): ");
        height = scan.nextDouble();
        scan = new Scanner (System.in);
        System.out.print("Enter the resolution (PPI): ");
        resolution = scan.nextDouble();

        double widthinches;
        double heightinches;
        widthinches = width / resolution;
        heightinches = height / resolution;
        System.out.println("At " + resolution + " PPI, the image is " + widthinches + " wide by " + heightinches + " high.");

    }
}
