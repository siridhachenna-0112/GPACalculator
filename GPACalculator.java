import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of courses: ");
        int numberOfCourses = scanner.nextInt();
        
        double totalPoints = 0;
        int totalCredits = 0;
        
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Enter the grade for course " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            System.out.println("Enter the credits for course " + (i + 1) + ": ");
            int credits = scanner.nextInt();
            
            totalPoints += grade * credits;
            totalCredits += credits;
        }
        
        double gpa = totalPoints / totalCredits;
        System.out.println("Your GPA is: " + gpa);
        
        scanner.close();
}
}
