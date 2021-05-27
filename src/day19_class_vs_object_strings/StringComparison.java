package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Baku";
        System.out.println(city.equals("Baku")); // true
        System.out.println(city.equals("baku"));//false
        System.out.println(city.equals("BAKU")); //false

        //EqualsIgnoreCase()method  - CASE INSENSITIVE COMPARISON

        System.out.println(city.equalsIgnoreCase("Baku"));//true
        System.out.println(city.equalsIgnoreCase("BAKU"));//true
        System.out.println(city.equalsIgnoreCase("BaKu"));//true
        System.out.println(city.equalsIgnoreCase("Baaku"));//false

        if (city.equals("BAKU")){
            System.out.println("Match");
        }else{
            System.out.println("Not match");
        }
        if(city.equalsIgnoreCase("BAKU")){
            System.out.println("Match");
        }else{
            System.out.println("Not match");

        }


        }
    }

