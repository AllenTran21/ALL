
import java.util.*;

/**
 * Allen Tran atran13@uccs.edu Encrypt and decrypt caesar-cipher messages
 */
public class Proj7Decryptor {

    /**
     * Used to print message prompt for user and get input for the message to be
     * performed on crackType is encrypt, decrypt, or brute-force to be printed
     * entry is used to determine what the user wants to perform on returns the
     * message the user input
     */
    public static String promptForString(String crackType, Scanner entry) {
        System.out.print("Enter a message to " + crackType + ":");
        String message = entry.nextLine();
        return message;
    }

    /**
     * Prompts user to enter the value of the caesar shift to shift the entered
 message entry is used to determine the promptForInteger returns promptForInteger, or
 how much to move the cipher
     */
    public static int promptForInteger(Scanner entry) {
        System.out.print("Enter a shift value:");
        int shiftValue = entry.nextInt();
        return shiftValue;
    }

    /**
     * Called when user chooses case 1, or encryption, Calls promptForString to get
 message to encrypt Calls promptForInteger and does % 26 to determine how much
 to shift message to be encrypted Prints user original message and
 encrypted message entry is used to get the message and promptForInteger does
 not return any values
     */
    public static void handleEncrypt(Scanner entry) {
        String toCrypt = promptForString("encrypt", entry);
        int shiftValue = (promptForInteger(entry) % 26);

        String encryptedMessage = encryptMessage(toCrypt, shiftValue);

        //  String encryptedMessage = toCrypt + promptForInteger;
        System.out.println("Your message: " + toCrypt);
        System.out.println("Encrypts as: " + encryptedMessage);
    }

    /**
     * Loops through to shift character by shift spaces for as many characters
     * are passed in, goes char by char and adds new chars to encryptedMessage
     * toCrypt is the message to encrypt shift is the amount to shift the cipher
     * forwards returns encryptedMessage which is all encrypted chars appended
     * together
     */
    public static String encryptMessage(String toCrypt, int shift) {
        //loop each character of message
        String encryptedMessage = "";
        for (int i = 0; i < toCrypt.length(); i++) {
            char encryptedCharacter = encryptCharacter(toCrypt.charAt(i), shift);
            encryptedMessage += encryptedCharacter;
        }
        return encryptedMessage;
    }

    /**
     * Called when user chooses case 2, or decryption, Calls promptForString to get
 message to decrypt Calls promptForInteger and does % 26 to determine how much
 to shift message to be decrypted Prints user original message and
 decrypted message entry is used to get promptForInteger and message to be
 decrypted does not return a value
     */
    public static void handleDecrypt(Scanner entry) {
        String toCrypt = promptForString("decrypt", entry);
        int shiftValue = (promptForInteger(entry) % 26);

        String decryptedMessage = decryptMessage(toCrypt, shiftValue);

        //  String encryptedMessage = toCrypt + promptForInteger;
        System.out.println("Your message: " + toCrypt);
        System.out.println("Decrypts as: " + decryptedMessage);
    }

    /**
     * Decrypts message by moving char by char, taking away the value of shift
     * for each character that there is calls decryptCharacter to find the value
     * of each character after the shift, appends each char to decryptedMessage
     * toCrypt is the message to be decrypted shift is the value to take away
     * from toCrypt for each character returns decryptedMessage which is each
     * decrypted char appended to one another
     */
    public static String decryptMessage(String toCrypt, int shift) {
        String decryptedMessage = "";
        for (int i = 0; i < toCrypt.length(); i++) {
            char decryptedCharacter = decryptCharacter(toCrypt.charAt(i), shift);
            decryptedMessage += decryptedCharacter;
        }
        return decryptedMessage;
    }

    /**
     * Calls promptForString to obtain message to decrypt, prints original message
 and all brute forced messages found, calls decryptByBruteForce which
 returns all brute forced messages entry used to find toDecrypt returns
 nothing
     */
    public static void handleBruteForce(Scanner entry) {
        String toDecrypt = promptForString("brute-force", entry);
        System.out.println("Your message: " + toDecrypt);
        String decryptedMessage = decryptByBruteForce(toDecrypt);
        System.out.println("Brute-force decrypts as:\n" + decryptedMessage);

    }

    /**
     * Decrypts by taking in toDecrypt message and subtracts 1 from each
     * character and appends message to decryptedMessage, does this by calling
     * decryptMessage and adds 1 to shift each time to find all possible
     * messages from caesar cipher toDecrypt is message returns decryptedMessage
     * which is every possible cipher meaning with a newline after each
     */
    public static String decryptByBruteForce(String toDecrypt) {
        String decryptedMessage = "";
        for (int j = 1; j < 26; j++) {
            String partMessage = decryptMessage(toDecrypt, j);
            decryptedMessage += partMessage + "\n";
        }

        return decryptedMessage;
    }
    /**
     * entry to take in message from user
     * 
     */
    public String promptForString(Scanner entry, String displayMessage) {
        System.out.println("");
        String userString = entry.nextLine();
        return userString;
    }

    public int promptForInteger(Scanner entry, String displayMessage) {
        int userInteger = entry.nextInt();
        return userInteger;
    }

    public static char encryptCharacter(char currentCharacter, int shift) {
        //decide upper or lowercase
        char encryptedCharacter = '\0';
        int charValue = (int) currentCharacter;
        int charPlusShift = charValue + (shift % 26);
        if (currentCharacter >= 65 && currentCharacter <= 90) {
            if (charPlusShift > 90) {
                encryptedCharacter = (char) (charPlusShift - 26);
            } else {
                encryptedCharacter = (char) charPlusShift;
            }
        } else if (currentCharacter >= 97 && currentCharacter <= 122) {
            if (charPlusShift > 122) {
                encryptedCharacter = (char) (charPlusShift - 26);
            } else {
                encryptedCharacter = (char) charPlusShift;
            }
        } else {
            encryptedCharacter = currentCharacter;
        }
        return encryptedCharacter;
    }

    public static char decryptCharacter(char currentCharacter, int shift) {
        char encryptedCharacter = '\0';
        int charValue = (int) currentCharacter;
        int charMinusShift = charValue - (shift % 26);
        if (currentCharacter >= 65 && currentCharacter <= 90) {
            if (charMinusShift < 65) {
                encryptedCharacter = (char) (charMinusShift + 26);
            } else {
                encryptedCharacter = (char) charMinusShift;
            }
        } else if (currentCharacter >= 97 && currentCharacter <= 122) {
            if (charMinusShift < 97) {
                encryptedCharacter = (char) (charMinusShift + 26);
            } else {
                encryptedCharacter = (char) charMinusShift;
            }
        } else {
            encryptedCharacter = currentCharacter;
        }
        return encryptedCharacter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Welcome to the Code Cracker!\n"
                + "You can encrypt or decrypt messages using the\n"
                + "Caesar cipher with this application.  Simply\n"
                + "select whether you want to encrypt or decrypt,\n"
                + "enter your message, and then enter the number\n"
                + "you want to use as the shift.");
        int userSelection;
        do {
            System.out.println("**************************************\n"
                    + "Please make a selection:\n"
                    + "1 - Encrypt a message with shift\n"
                    + "2 - Decrypt a message with shift\n"
                    + "3 - Decrypt a message with brute-force\n"
                    + "4 - Quit\n"
                    + "**************************************");
            userSelection = input.nextInt();
            if (input.hasNextLine() == true) {
                input.nextLine();
            }
            switch (userSelection) {
                case 1:
                    handleEncrypt(input);
                    break;
                case 2:
                    handleDecrypt(input);
                    break;
                case 3:
                    handleBruteForce(input);
                    break;
                case 4:
                    System.out.println("Thank you, goodbye!");
                    System.exit(0);
                    break;
                default:
            }

        } while (userSelection > 0 && userSelection <= 3);

    }
}
