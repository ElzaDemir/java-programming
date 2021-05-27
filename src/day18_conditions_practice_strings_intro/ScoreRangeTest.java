package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 70;

        if (score >= 1 && score <= 40){
        System.out.println("Score is D");
    }else if(score >=41 && score<= 60) {
            System.out.println("Score is C");
        }else if (score>=60 && score <= 90) {
            System.out.println("Score is B");
        }else if (score>=90 && score <= 100){
            System.out.println("Score is A");
        }else{
            System.out.println("Invalid Score");
        }
    }
}
