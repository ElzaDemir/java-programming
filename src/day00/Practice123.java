package day00;

public class Practice123 {
    static String color = "blue";
    double price = 22.5;





}
class Test5{
    public static void main(String[] args) {
        //if the instance variable is not a static --> it means you need to create a new object this instance variable
        //if the instance variable is a static --> it means you don't need to create an object to use this instance variable
        //But it doesn't mean that it is necessary to not to create an object to use the static variable

        System.out.println(Practice123.color);
        Practice123 prac1 = new Practice123();
        System.out.println(prac1.color);




    }


}
