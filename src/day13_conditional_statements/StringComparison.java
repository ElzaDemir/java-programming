package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")){
            System.out.println("It is LA");
        }else{
            System.out.println("It is not LA");
        }
        String weather = "Sunny";
        if(weather.equals("Sunny")){
            System.out.println("Let's go out and code java!");
        }else{
        System.out.println("Let's stay indoors, and code java!");
        }
    }
}
