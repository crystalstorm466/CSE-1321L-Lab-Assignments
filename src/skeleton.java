import java.util.Arrays;

public class skeleton {
    public static void main(String [] args) {


       int[] newArray = {34, 67, 54, 43, 56, 555, 55343, 555};

       System.out.println(newArray[2]);

        newArray[2] = 4;
        System.out.println(newArray[2]);

        System.out.println(newArray.length);
        int i;
        for (i = 0; i < newArray.length; i++) {
            newArray[i] = 4;
            System.out.println(Arrays.toString(newArray));
        }
    }
}
