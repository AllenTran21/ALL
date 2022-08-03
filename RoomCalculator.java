import java.util.Scanner;

/**
 * Computes the Area and Perimeter of a room based on dimensions provided by the
 * user.
 */
public class RoomCalculator {

    /**
     * @param input, from scanner, user input
     * @param message parameter from main method to be printed
     * returns user input integer 
     */
    public static int promptForInteger(Scanner input, String message) {
        
        System.out.println(message);
        return input.nextInt();
    }
/**
 * 
 * @param another, response to if user wants to calculate for another room
 * @param message, parameter from main method to be printed
 * @return input message
 */
    public static String promptForString(Scanner another, String message) {
        
        System.out.println(message);
        return another.next();
    }

    public static void displayArea(int width, int length) {
        int area = width * length;
        System.out.println("For a room " + width + "x" + length + ", you "
                + "will need " + area + "sqft of carpet");
       // return displayAreaMessage;
    }
    public static void displayPerimeter(int width, int length) {
        int perimeter = (2 * width) + (2 * length);
        
        System.out.println("For a room " + width + "x" + length + ", you "
                + "will need " + perimeter + "ft of baseboard");
        //return displayPerimeterMessage;
    }

    /**
     * Computes the Area and Perimeter of a room based on dimensions provided by
     * the user.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response;
        
        // Compute the necessary carpet and baseboard for the user based
        // on their room dimensions
        // Repeat if they indicate they want to repeat, stop otherwise
        do {
            // Get the width and length of the room from the user
            int width = promptForInteger(input, "Please enter width of room: ");
            int length = promptForInteger(input, "Please enter length of room: ");

            // Compute and display the area and perimeter
            displayArea(width, length);
            displayPerimeter(width, length);

            // Ask the user if they'd like to repeat the process
            response = promptForString(input,
                    "Would you like to compute another room? (y/Y/n/N)");

        } while (response.equalsIgnoreCase("y"));
    }
}
