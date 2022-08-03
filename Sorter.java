
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author allent
 */
public class Sorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many items will there be?");
        int nbrItems = input.nextInt();

        // Create the collection of items
        // TODO: Create an array to hold the number of items
        int[] items = new int[nbrItems];
        // Read in all of the items
        // TODO: Use a loop to read in all the items
        for (int i = 0; i < nbrItems; i++){
            int userInput = input.nextInt();
            items[i] = userInput;
        }
        // Sort the array
        // TODO: Sort the items in the array
        Arrays.sort(items);
        
        String response;
        do {
            System.out.println("What item would you like to search for?");
            int item = input.nextInt();
            
            if (Arrays.binarySearch(items, item) >= 0){
                System.out.println("Found " + item);
            }
            else{
                System.out.println("Did not find " + item);
            }
            // TODO: Search for the item,
            // if it is found, display "Found x" where x is the item
            // otherwise, display "Did not find x" where x is the item
            System.out.println("Would you like to search again? (y/n)");
            response = input.next();
        } while ("y".equalsIgnoreCase(response));
    }
}
