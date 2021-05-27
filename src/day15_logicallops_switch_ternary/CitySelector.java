package day15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";

        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to Moscow");
        } else {
            System.out.println("Not considering - " + city);
        }
        String teacher = "Nadir";

        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("It is java class with " + teacher);
        } else {
            System.out.println("Soft skill class with Nadir");
        }
        teacher = "Murodil";
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("It is java class with " + teacher);
        } else if (teacher.equals("Nadir")){
            System.out.println("Soft skill class with "+ teacher);
        }else{
            System.out.println("Class with Gurhan");
        }
        String company = "Nadirtech";
        double salary = 185_000.0;
        if (company.equals ("Google") && salary >= 100_000){
            System.out.println("It is a good offer " + company);
        }else{
            System.out.println("rejecting offer from " + company);
        }


    }
}