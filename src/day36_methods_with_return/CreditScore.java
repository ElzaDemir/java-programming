package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(750);

        System.out.println(getCreditScore());
        System.out.println("Credit Score = " + getCreditScore());
       int score = getCreditScore();
        System.out.println("Score = " + score);
    }
    public static void checkEligible(int creditScore){

        if(creditScore>=700){
            System.out.println("You are eligible for this car");

        }else{
            System.out.println("Sorry, you are not eligible for leasing this card");
        }

    }
    public static int getCreditScore(){
        return 800;

    }
}
