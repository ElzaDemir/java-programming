package SaimTasksMyPractices;
import java.util.Scanner;
/*
You are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
 */
public class ThreeJudges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge1, judge2, judge3;
        int personscore1, personscore2;
        System.out.println("Judge 1 - Score: ");
        judge1 = scan.nextInt();
        System.out.println(" ");
        System.out.println("Judge 2 - Score: ");
        judge2 = scan.nextInt();
        System.out.println(" ");
        System.out.println("Judge 3 - Score: ");
        judge3 = scan.nextInt();
        System.out.println("Person 1 - Score: ");
        personscore1 = scan.nextInt();
        System.out.println("Person 2 - Score: ");
        personscore2 = scan.nextInt();

        double averagescore = (judge1+judge2+judge3)/3;
         if(averagescore>personscore1 && averagescore>personscore2){
             System.out.println("First Place!!!");
         }else if(averagescore>personscore1 || averagescore>personscore2){
             System.out.println("Second Place!");
         }else if (averagescore<personscore1 && averagescore <personscore2){
             System.out.println("Third Place!");
         }
    }
    }


