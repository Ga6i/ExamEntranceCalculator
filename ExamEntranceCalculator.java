import java.util.Scanner;

public class ExamEntranceCalculator {
  // Constants for the weight of each assessment
  private static final double ASSESSMENT_WEIGHT = 0.1666;

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  // Get the name of the module from the user
  System.out.print("Enter the name of the module: ");
  String moduleName = scanner.nextLine();

  // Get the marks for each assessment from the user
  System.out.print("Enter the marks for the first assessment: ");
  double assessment1 = scanner.nextDouble();

  System.out.print("Enter the marks for the second assessment: ");
  double assessment2 = scanner.nextDouble();

  System.out.print("Enter the marks for the third assessment: ");
  double assessment3 = scanner.nextDouble();

  // Calculate the semester mark
  double semesterMark = (assessment1 + assessment2 + assessment3) * ASSESSMENT_WEIGHT;

  // Output the semester mark
  System.out.println("Semester mark for " + moduleName + ": " + semesterMark);

  // Check if the student has qualified to write the exam
  if (semesterMark >= 0.3) {
  System.out.println("Congratulations! You have qualified to write the exam.");
  } else {
  System.out.println("Sorry, you have not qualified to write the exam.");
  }
  }
}