/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Allen
 */
public class Exercise07_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of students: ");
        int numStudents = input.nextInt();

        int i;
        int[] scores = new int[numStudents];
        int best = 0;
        System.out.println("Enter 4 scores");
        for (i = 0; i < scores.length; i++) {
            int inputScore = input.nextInt();
            scores[i] = inputScore;
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        char grade;
        for (i = 0; i < scores.length; i++) {
            if (scores[i] < best - 40) {
                grade = 'F';
            } else if (scores[i] < best - 30) {
                grade = 'D';
            } else if (scores[i] <= best - 20) {
                grade = 'C';
            } else if (scores[i] <= best - 10) {
                grade = 'B';
            } else {
                grade = 'A';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
}
