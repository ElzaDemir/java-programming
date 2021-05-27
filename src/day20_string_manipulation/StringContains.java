package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single words company");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {
            System.out.println("Title passed");
        } else {
            System.out.println("Failed");
        }
        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e arepresent");
        } else {
            System.out.println("a || e not present");
        }
        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        } else {
            System.out.println("nor a or i is present");
        }
        String email = "elvira@cybertekschool.com";
        if (email.contains("@") && email.contains(".com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
        if(email.toLowerCase().contains("v")){
            System.out.println("v is present");
        }else{
            System.out.println("v is not present");
        }
    }
}
