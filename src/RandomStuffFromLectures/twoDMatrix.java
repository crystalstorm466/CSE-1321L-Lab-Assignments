package RandomStuffFromLectures;
import java.util.*;
public class twoDMatrix {
    public static void main(String[] args) {
        int[] [] twoDArray = new int[4][4];


        for (int i = 0; i < twoDArray.length; i++) {
            for (int c = 0; c < twoDArray.length; c++) {
                twoDArray[i] [c] = i;
            }

        }
        System.out.println(Arrays.deepToString(twoDArray));
    }
}
