package chp9.addresses;


import java.util.Scanner;

/**
 * Collect and displays student data
 */
public class Chp9StudentData {

    /**
     * Collect and displays student data
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the total number of students that will be stored
        System.out.println("How many students?");
        int nbrStudents = input.nextInt();
        input.nextLine();

        // Allocate the collection of students
        Student[] students = new Student[nbrStudents];

        // Read in all of the students' data
        for (int i = 0; i < nbrStudents; ++i) {
            // Ask for the student's name
            System.out.println("Enter the student's name: ");
            String name = input.nextLine();

            // Ask for the student's gpa
            System.out.println("Enter the student's gpa: ");
            double gpa = input.nextDouble();
            input.nextLine();

            // Store this student in the collection
            // TODO: Create a Student object, passing it
            //       the name and gpa received above
            students[i] = new Student(name, gpa);
            // TODO: Add the Student to the array of Students
            //       You can do this and create the student object
            //       in a single line or two lines, whatever is
            //       easiest for you to understand!
        }

        // Print out all of the students in reverse order
        System.out.println("Students:");
        for (int i = nbrStudents - 1; i >= 0; --i) {
            // TODO: Replace "John Doe" with the ith student's name using
            //       getName.  Replace "4.0" with the ith student's gpa using
            //       getGPA.

            System.out.printf("%-25s%9f\n", students[i].getName(), students[i].getGPA());
        }
    }
}
