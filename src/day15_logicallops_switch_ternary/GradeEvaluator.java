package day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'a';
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'C') {
            System.out.println("Passed with " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake with " + grade);
        } else if (grade == 'E') {
            System.out.println("You fail with " + grade);
        } else {
            System.out.println("Invalid grade");
        }
        grade = 'D';
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade == 'C' || grade == 'c') {
            System.out.println("Passed with " + grade);
        } else if (grade == 'D' || grade == 'd') {
            System.out.println("Qualify for retake with " + grade);
        } else if (grade == 'E' || grade == 'e') {
            System.out.println("You fail with " + grade);
        } else {
            System.out.println("Invalid grade");
        }
    }
}
