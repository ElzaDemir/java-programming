package day07_arithmetic_operators_casting.day04_variables_intro;

public class VariableNamingRules {
    public static void maim(String[]args){
        //int statis = 22; error, statis is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;


        int salary4 = 55;
        //int 1stmonthSalary=3000 - error, cannot start with number
        int $ = 10;
        int _ =3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine, but not recommended.
        //we should use meaningful variable names
        //int number-of-friends = 400; ERROR
        int numberOfFriends;



    }
}
