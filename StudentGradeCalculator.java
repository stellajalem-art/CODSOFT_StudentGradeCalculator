import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjects;
        int totalMarks = 0;

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        int[] marks = new int[subjects];

        for (int i = 0; i < subjects; i++) {

            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            totalMarks += marks[i];
        }

        double average = (double) totalMarks / subjects;

        char grade;

        if (average >= 90) {
            grade = 'A';
        }

        else if (average >= 80) {
            grade = 'B';
        }

        else if (average >= 70) {
            grade = 'C';
        }

        else if (average >= 60) {
            grade = 'D';
        }

        else {
            grade = 'F';
        }

        System.out.println("\n===== Result =====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
