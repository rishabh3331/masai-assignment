import java.util.ArrayList;
import java.util.Collections;

public class SortNumbers {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Step 2: Add some unsorted numbers
        numbers.add(34);
        numbers.add(12);
        numbers.add(45);
        numbers.add(7);
        numbers.add(89);
        numbers.add(23);

        // Step 3: Sort the list in ascending order
        Collections.sort(numbers);

        // Step 4: Print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}
