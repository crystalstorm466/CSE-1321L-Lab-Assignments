import java.util.HashMap;
import java.util.*;


//testing out a hashmap
public class hashMap { //elements of harmony source code
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //hashmaps are good for coding interviews according to youtube lol
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Unknown");

        System.out.println(capitalCities);
        String oldWorld = "old word";
        HashMap<String, String> differentWords = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.print("Enter the " + i + " word ");
            String word = scan.nextLine();
            differentWords.put(oldWorld, word);
            oldWorld = word;

        }
        differentWords.put(oldWorld, String.valueOf(capitalCities));
        System.out.println(differentWords);
    }
}
