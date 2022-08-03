
import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names
                = {"Cartman",
                    "Stan", "Kyle", "Kenny", "Butters",
                    "Token", "Chef", "Bebe", "Wendy", "Jimmy", "Heidi",
                    "Annie", "Red", "Bradley", "Pip", "Damien", "Nathan",
                    "Nelly", "Scott", "Timmy", "Dog Poo", "Craig", "Tweak"};

        System.out.println("Please make a selection:\n"
                + "1 - In order\n"
                + "2 - Reverse order\n"
                + "3 - Evens, starting with 0\n"
                + "4 - Reverse order evens, starting with last even index\n"
                + "5 - Odds, starting with 1\n"
                + "6 - Reverse order odds, starting with last odd index");

        int response = input.nextInt();
        int i;
        switch (response) {
            case 1:
                for (i = 0; i < names.length; i++) {
                    System.out.println(names[i]);
                }
                break;
            case 2:
                for (i = 1; i <= names.length; i++) {
                    System.out.println(names[names.length - i]);
                }
                break;
            case 3:
                for (i = 0; i < names.length; i += 2) {
                    System.out.println(names[i]);
                }
                break;
            case 4:
                int startVal = (int)Math.floor(names.length / 2) * 2;
                for (i = 0; i < names.length; i += 2) {
                    System.out.println(names[startVal - i]);
                }
                break;
            case 5:
                for (i = 1; i < names.length; i += 2) {
                    System.out.println(names[i]);
                }
                break;
            case 6:
                startVal = (int) Math.ceil(names.length / 2) * 2;
                for (i = 1; i < names.length - 1; i += 2) {
                    System.out.println(names[startVal - i]);
                }
                break;
        }
    }
}
