package day14_multi_branch_if_statements;

public class DatActivity {
    public static void main(String[] args) {
        String weather = "snowy";
        if (weather.equals("sunny")) {
            System.out.println("Go to park, hiking, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + " - stay home, drink tea, and code java");
        } else if (weather.equals("windy")) {
            System.out.println(weather + " - Get ready for power loss, fly a kite, and code java");
        }else if (weather.equals("snowy")){
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate, and code java");
        } else {
            System.out.println(weather + " - just keep coding java");
        }
    }
}
