import java.util.Scanner;
public class Assignment1A {

    public static void main(String args[])
    {
        float width;
        float height;
        float resolution;

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the width (in pixels): ");
        width = scan.nextFloat();
        scan = new Scanner (System.in);

        System.out.print("Enter the height (in pixels): ");
        height = scan.nextFloat();
        scan = new Scanner (System.in);
        System.out.print("Enter the resolution (PPI): ");
        resolution = scan.nextFloat();

        float widthinches;
        float heightinches;
        widthinches = width / resolution;
        heightinches = height / resolution;
        System.out.println("At " + resolution + " PPI, the image is " + widthinches + " wide by " + heightinches + "'' high.");

    }
}
