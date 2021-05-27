package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(8);
        int num = 7;
        count(num);
        String word = "wooden spoon";
        count(word.length());
        prinAge(1988);
        prinAge(1987);
    }
    public static void count(int num){
        for(int i = 0; i<=num; i++){
            System.out.print(i + " ");

    }
        System.out.println();
    }
    public static void prinAge(int year){
        int age  = 2021 - year;
        System.out.println("Birth year: " + year + "\nAge: " + age);

    }



}
