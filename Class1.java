
import java.io.*;
import java.util.*;

public class Class1 {

    public static void main(String[] args) {
        //initializing where to read/write
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try {
            //objects to read/write
            PrintWriter output = new PrintWriter(outputFile);
            Scanner inputScanner = new Scanner(inputFile);
            //Creation of storage array
            String[] lines = new String[5];
            //read lines one line for each array slot
            for (int i = 0; i < 5; i++) {
                lines[i] = inputScanner.nextLine();
            }
            //print array in reverse order
            for (int i = 4; i >= 0; i--) {
                output.println(lines[i]);
            }

//close both files
            output.close();
            inputScanner.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("input.txt was not found");
            System.exit(0);
        }
    }
}
