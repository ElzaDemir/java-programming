package day25_loops_in_java;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars =1; stars<=15; stars++){
            System.out.print(" \uD83C\uDF1F  * ");
        }
        System.out.println();
        String myStars = "";
            //myStars = myStars+"* ";
            myStars+= "* ";
            myStars+= "* ";
            myStars+= "* ";
            myStars+= "* ";
            myStars+= "* ";
        System.out.println("myStars = " + myStars.trim());

        myStars = "";
        for (int i = 1; i<= 5; i++){
            myStars+= "* ";
        }
        System.out.println("my stars = " + myStars.trim());

    }
}