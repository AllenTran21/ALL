
import java.util.Scanner;

/**
 *
 */
public class Chp10NumericalConversions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current age?");
        String ageStr = input.next();

        int age = 0;

        // TODO: convert the string ageStr into an int and store in age
        age = Integer.parseInt(ageStr);
        System.out.printf("Your age in 5 years will be %d\n", age + 5);

        System.out.println("What is your current gpa?");
        String gpaStr = input.next();

        double gpa = 0.0;

        // TODO: convert the string gpaStr into a double and store in gpa
        gpa = Double.parseDouble(gpaStr);
        if (gpa >= 3.5) {
            System.out.printf("You will graduate with honors with a %f\n", gpa);
        } else if (gpa >= 2.0) {
            System.out.printf("You will not graduate with honors with a %f\n", gpa);
        } else {
            System.out.printf("You may not graduate at all with a %f\n", gpa);
        }

        System.out.println("What is the binary number to convert?");
        String binaryStr = input.next();
        int binary = 0;

        // TODO: convert the string binaryStr into an int and store in binary
        int currentVal = 8;
        for (int i = 0; i < 4; i++) {
            if (binaryStr.charAt(i) == '1') {
                binary += currentVal;
            }
            currentVal = currentVal / 2;

        }

        binary = Integer.parseInt(binaryStr);
        System.out.printf("%s is %d in decimal\n", binaryStr, binary);
    }
}
