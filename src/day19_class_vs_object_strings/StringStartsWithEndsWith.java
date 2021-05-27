package day19_class_vs_object_strings;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "Tomato";
        System.out.println(word.startsWith("To"));
        System.out.println(word.endsWith("to"));

        System.out.println(word.startsWith("TOM"));
        System.out.println(word.endsWith("ATO"));

        String word2 = "intellij idea";
        System.out.println(word2.endsWith("idea"));
        System.out.println(word2.startsWith(""));

        String name = "Irina";

        if(name.endsWith("a")){
            System.out.println("Maybe, it is a female name");
        }


        String firstName = "Dr. Nadir";
        if(firstName.startsWith("Mr.")) {
            System.out.println("Man");
        }else if(firstName.startsWith("Dr.")){
            System.out.println("Dr.Nadir");
        }else if (firstName.startsWith("Mrs.")){
            System.out.println("Married Woman");
        }else if (firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if(firstName.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("Error");
        }
        String url = "https://www.cybertekschool.com/";

        if(url.endsWith(".com")){
            System.out.println(".com");
        }else if (url.endsWith(".ru")){
            System.out.println("Russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }else if(url.endsWith(".edu")){
            System.out.println("Education website");
        }else if(url.endsWith(".ord")){
            System.out.println("Organiztaion website");
        }else{
            System.out.println("Incorrect domain");
        }




    }
}
