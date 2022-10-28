import java.util.ArrayList;
import java.util.Arrays;

public class skeleton {
    public static void main(String [] args) {
       int count = 1;
       int [] [] twoDArray = new int [4] [5];

        int[][] grid = new int[4][5];
        //getting the rows in the array
        for (int row = 0; row < 4; row++)
        {
            //populate the values in the array (row) we're currently on from the outer loop
            for (int column = 0; column < 5; column++){
                grid[row][column] = count;
                count++;
            }
        }

        for(int item[] : grid)
        {
            //for each element in the array (row) we're currently on from the outer loop
            for (int number : item) {
                System.out.print(number + ",");
                if(number % 5 == 0)
                { System.out.println(" "); }
            }
        }

        int n = 2;
       ArrayList<String> colors = new ArrayList<String> (n);

       colors.add("purple");
       colors.add("pink");
       colors.add("green");
    }
}
