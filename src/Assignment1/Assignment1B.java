import java.util.Scanner;
public class Assignment1B {

    public static void main(String args[])
    {
        float labGrade;
        float assignmentGrade;
        float midtermGrade;
        float finalGrade; //comment
        System.out.println("[CSE 1321L Final Grade Calculator]"); //this prints something
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your average lab grade: ");
        labGrade = scan.nextFloat();
        scan = new Scanner(System.in);
        System.out.print("Enter your average assignment grade: ");
        assignmentGrade = scan.nextFloat();
        scan = new Scanner(System.in);
        System.out.print("Enter your average midterm exam grade: ");
        midtermGrade = scan.nextFloat();
        scan = new Scanner(System.in);
        System.out.print("Enter your final exam grade: ");
        finalGrade = scan.nextFloat();

        double weightedLab;
        double weightedAssignment;
        double weightedMidterm;
        double weightedFinalExam;

        weightedLab = labGrade * 0.40;
        weightedAssignment = assignmentGrade * 0.10;
        weightedMidterm = midtermGrade * 0.20;
        weightedFinalExam = finalGrade * 0.30;
        System.out.println("Your weighted lab average is " + weightedLab + ".");
        System.out.println("Your weighted assignment average is " + weightedAssignment + ".");
        System.out.println("Your weighted midterm average is " + weightedMidterm + ".");
        System.out.println("Your weighted final exam average is " + weightedFinalExam + ".");
        System.out.println("Adding Numbers...");
        double totalGrade;
        totalGrade = weightedLab + weightedAssignment + weightedMidterm + weightedFinalExam;
        System.out.println("Your Final Grade in CSE 1321L is " + totalGrade);




    }
}
