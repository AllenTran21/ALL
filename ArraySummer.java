
import java.util.Scanner;

public class ArraySummer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many items will there be?");
        int nbrItems = input.nextInt();

        // Create the collection of items
        // TODO: Create an array large enough to store nbrItems (and no more)
        int[] items = new int[nbrItems];

        int sum = 0;
        double average = 0;

        for (int i = 0; i < nbrItems; i++) {
            int userInput = input.nextInt();
            items[i] = userInput;
        }
        // Read in all of the items
        // TODO: Using a loop, read in all of the items and
        // store them into the array you declared above

        for (int i = 0; i < nbrItems; i++) {
            sum += items[i];
        }
        average = sum / (double)items.length;
        // Compute the sum and average
        // TODO: Compute the sum and average, store them in the
        // appropriate provided variables
        // Print the sum
        System.out.printf("Sum %d\n", sum);
        System.out.printf("Average %.2f\n", average);

        // Print all of the items in reverse order
        // TODO: Print the items in the array in reverse order,
        // one per line
        for(int i = nbrItems; i > 0; i--){
            System.out.println(items[i - 1]);
        }
    }
}
