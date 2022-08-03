package chp9.addresses;


/** Represents a single student's data */
// TODO: Create the student class here
// TODO: Create a private data member of a String to store the name
// TODO: Create a private data member of a double to store the gpa
// TODO: Create the Student constructor with 2 parameters for the 
//       name and gpa. Copy these data into the private data members
//       to store this Student's name and gpa
// TODO: Create the getGPA method that returns the Student's gpa
// TODO: Create the getName method that returns the Student's name
public class Student {

    private String studentName = "";
    private double gpa = 0;

    public Student(String newStudentName, double newGpa) {
        studentName = newStudentName;
        gpa = newGpa;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return studentName;
    }
}
