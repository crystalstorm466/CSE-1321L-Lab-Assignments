package Assignment6;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment6A {
    public static void main(String[] args) {
        System.out.println("[Is it Sorted?]");
        boolean menu = true;
        int[] firstArray = create_random_array();
        System.out.println("Random Array: " + Arrays.toString(firstArray));
        while (menu) {
            System.out.println(" ");
            System.out.println("What do you want to do?\n" +
                    "1) Generate a new random array\n" +
                    "2) Is the array sorted?\n" +
                    "3) Sort the array\n" +
                    "4) Quit");
            Scanner scan = new Scanner(System.in);
            System.out.print("Choice: ");
            int choice = scan.nextInt();

            if (choice == 1) {
                int[] newArray = create_random_array();
                for (int i = 0; i < newArray.length; i++) {
                    firstArray[i] = newArray[i];
                }
                System.out.println("Random Array: " + Arrays.toString(firstArray));
            } else if (choice == 2) {
                boolean isSorted = is_array_sorted(firstArray);
                if (!isSorted) {
                    System.out.println("The array is not sorted.");
                } else {
                    System.out.println("The array is sorted.");
                }
            } else if (choice == 3) {
                int[] sortedArray = sort_array(firstArray);
                for (int i = 0; i < sortedArray.length; i++) {
                    firstArray[i] = sortedArray[i];
                }
                System.out.print("Sorted Array: " + Arrays.toString(firstArray));
            } else if (choice == 4) {
                System.exit(0); // or break; or menu = false;
            }

        }


}
    public static int[] create_random_array() {
        int [] methodArray = new int [10];
        Random rand = new Random();
        for (int i = 0; i < methodArray.length; i++) {
            int randInt = rand.nextInt(500);
            methodArray[i] = randInt;
        }
        return methodArray;
    }

    public static boolean is_array_sorted(int[] array) {
        boolean isTarget = false;

        for (int i = 0; i < array.length - 1; i++) {
            int check = array[i];
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
        /*for (int c = 0; c < array.length-1; c++) {
            for (int d = 0; d < array.length - c - 1; d++) {
                if (array[d] < array[d + 1]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
        */

    }

    public static int[] sort_array(int[] Sortarray) {
            int n = Sortarray.length;

            for (int i = 0; i < n-1; i++) {
                int min = i;
                for (int j = i+1; j < n; j++) {
                    if (Sortarray[j] < Sortarray[min]) {
                        min = j;
                    }

                    int temp = Sortarray[min];
                    Sortarray[min] = Sortarray[i];
                    Sortarray[i] = min;
                }
            }
            /*for (int c = 0; c < Sortarray.length - 1; c++) {
                for (int d = 0; d < Sortarray.length - c - 1; d++) {
                    if (Sortarray[d] > Sortarray[d + 1]) {
                        int newValue = Sortarray[d];
                        Sortarray[d] = Sortarray[d + 1];
                        Sortarray[d + 1] = newValue;
                    }
                }
            }*/


            return Sortarray;
        }
    }