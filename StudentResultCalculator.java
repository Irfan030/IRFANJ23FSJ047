package ClosedlabBook;

import java.util.Scanner;

public class StudentResultCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[][] marks = new int[numStudents][numSubjects];

        // Input marks for each student and each subject
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display the result for each student
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }
            double averageMarks = (double) totalMarks / numSubjects;

            System.out.println("Result for student " + (i + 1) + ":");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);

            if (averageMarks >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }

            System.out.println();
        }

        scanner.close();
    }
}

