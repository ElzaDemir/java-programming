package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'Y';
        String trim = "Performance";

        if (model == 'S') {
            if (trim.equals("Long Range")) {
                System.out.println("Specs for S Model Long Range trim");
                System.out.println("range: 412");
                System.out.println("top speed: 155 mph");
                System.out.println("0-60- 3.1sec");

            } else if (trim.equals("Plaid")) {
                System.out.println("Specs for S Model Plaid trim");
                System.out.println("range: 390");
                System.out.println("top speed: 200 mph");
                System.out.println("0-60- 1.99sec");

            } else if (trim.equals("Plaid+")) {
                System.out.println("Specs for S Model Plaid+ trim");
                System.out.println("range: 520+");
                System.out.println("top speed: 200 mph");
                System.out.println("0-60- <1.99sec");

            }
        }

        if (model=='X') {
            if (trim.equals("Long Range")) {
                System.out.println("Specs for X Model Long Range");
                System.out.println("range: 360");
                System.out.println("top speed: 155");
                System.out.println("0-60 - 3.8sec");
            } else if (trim.equals("Plaid")) {
                System.out.println("Specs for X Model Plaid");
                System.out.println("range: 340");
                System.out.println("top speed: 163");
                System.out.println("0-60 - 2.5sec");
            }
        }

        if (model=='Y') {
            if (trim.equals("Long Range")) {
                System.out.println("Specs for Y Model Long Range");
                System.out.println("range: 326");
                System.out.println("top speed: 135");
                System.out.println("0-60 - 4.8sec");
            } else {
                if (trim.equals("Performance")) {
                    System.out.println("Specs for Y Model Performance");
                    System.out.println("range: 303");
                    System.out.println("top speed: 155");
                    System.out.println("0-60 - 3.5sec");
                }
            }
        }
    }
}
