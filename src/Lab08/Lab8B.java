/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 8
 */
package Lab08;
import java.util.*;
public class Lab8B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = scan.nextInt();
        int counter = 0;
        System.out.println("I have " + rows + " rows and " + columns + " columns. I need to fill up " + rows * columns + " spaces.");
        int finalArray[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                counter++;
                finalArray[i][j] = counter;
                System.out.print(finalArray[i] [j] + "|");
            }
            System.out.println(" ");
        }
    }
}
