//Project 1: "Student Grade Calculator"
//A simple command-line Java program that allows users to enter student marks and calculates
//their average and grade.
//Features:
//● Takes user input for student marks.
//● Calculates total marks and percentage.
//● Assigns grades based on percentage.
//● Displays results.

package Projects.Jan;
import java.util.Scanner;

public class StudentGradeCalculator {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input for marks in each subject
        System.out.println("Enter marks for each subject (out of 100):");

        System.out.print("Tamil: ");
        int tamil = scanner.nextInt();

        System.out.print("English: ");
        int english = scanner.nextInt();

        System.out.print("Mathematics: ");
        int mathematics = scanner.nextInt();

        System.out.print("Science: ");
        int science = scanner.nextInt();

        System.out.print("Social Science: ");
        int socialScience = scanner.nextInt();

        //Calculate total marks
        int totalMarks = tamil + english + mathematics + science + socialScience;

        //Calculate percentage
        double percentage = (double) totalMarks / 500 * 100;

        //Assign grades based on percentage
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        //Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
