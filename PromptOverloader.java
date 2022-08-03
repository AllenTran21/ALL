
import java.util.Scanner;

/**
 *
 * @author danaw
 */
public class PromptOverloader {
    // TODO: put your methods here!

    public static int promptForInteger(Scanner userInput, String message) {
        System.out.println(message);
        return userInput.nextInt();
    }

    public static int promptForInteger(Scanner userInput, String message, int min) {
        System.out.println(message);
        int user = userInput.nextInt();
        while (user < min) {
            System.out.println("ERROR: Invalid value");
            System.out.println(message);
            user = userInput.nextInt();
        }
        return user;
    }

    public static int promptForInteger(Scanner userInput, String message, int min, int max) {
        System.out.println(message);
        int user = userInput.nextInt();
        while(user < min || user > max){
            System.out.println("ERROR: Invalid value");
            System.out.println(message);
            user = userInput.nextInt();
        }
        return user;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = promptForInteger(input, "Enter your age: ", 1, 120);
        int house = promptForInteger(input, "Enter your house number: ", 1);
        int zip = promptForInteger(input, "Enter your zip: ", 1000, 99999);
        int budget = promptForInteger(input, "Enter this year's budget: ");

        System.out.printf("Your age is %d.\n", age);
        System.out.printf("Your house number is %d.\n", house);
        System.out.printf("Your zip is %d.\n", zip);
        System.out.printf("Your budget is %d.\n", budget);
    }
}
