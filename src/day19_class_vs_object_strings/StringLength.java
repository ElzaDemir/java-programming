package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon " .length());
        String firstName = "Elvira";
        System.out.println(firstName  + " - " + firstName.length());
        int count = firstName.length();
        System.out.println(count);

        //AMAZON PASSWORD
        String password = "abc123";
        if (password.length()>=6){
            System.out.println("Valid Amazon Password");
        }else{
            System.out.println("Password too short");
        }
    }
}
