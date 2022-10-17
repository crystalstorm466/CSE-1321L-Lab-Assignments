package RandomStuffFromLectures;
import java.util.*;

public class differentSortingNotes {
    public static void main(String[] args) {
        int [] normalArray = new int [11];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 11 numbers:");
        for (int i = 0; i < normalArray.length; i++) {
            System.out.print("Integer " + i + ": ");
            normalArray[i] = scan.nextInt();
        }
        System.out.print("What is the target number: ");
        int target = scan.nextInt();

        // insertion sort
        for (int index = 0; index < normalArray.length; index++) {
            int key = normalArray[index];
            int position = index;

            while (position > 0 && key < normalArray[position - 1]) {
                normalArray[position] = normalArray[position - 1];
                position--;
            }
            normalArray[position] = key;
        }
        System.out.println("The new array is: " + Arrays.toString(normalArray));

        // bubbleSort
        int low = 0;
        int high = normalArray.length-1;
        int mid = 0;
        boolean isTarget = false;
        for (int c = 0; c < normalArray.length-1; c++) {
            for (int d = 0; d < normalArray.length-c-1; d++) {
                if (normalArray[d] > normalArray[d+1]) {
                    int newValue = normalArray[d];
                    normalArray[d] = normalArray[d+1];
                    normalArray[d+1] = newValue;
                }
            }
        }
        System.out.println("The new array is: " + Arrays.toString(normalArray));

        //selectionSort
        while (high >= low) {
            mid = (low + high) / 2;
            if (target < normalArray[mid]) {
                high = mid - 1;
            } else if (target == normalArray[mid]) {
                isTarget = true;
                System.out.println("The target is in the set.");
                break;
            } else low = mid + 1;
            System.out.println("Low is " + low);
            System.out.println(" ");
            System.out.println("High is " + high);
            System.out.println(" ");
            System.out.println("Mid is " + mid);
            System.out.println(" ");
            System.out.println("Searching");
        }
        if (!isTarget) {
            System.out.println("The target is not in the set.");
        }

    /*
        normalArray <Person> errorList = new ArrayList<Person>();
        Arrays.sort(normalArray);
        errorList.sort(null);

     */
    }
}
