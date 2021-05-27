package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Please choose language");
        int selection = 6;
        if (selection ==1){
            System.out.println("Hello, thank for your call");
        }else if(selection == 2) {
            System.out.println("Hola, gracias para llamar");
        }else if (selection == 3) {
            System.out.println("Salam, zenginiz ucun tesekkur edirik");
        }else if(selection == 4){
            System.out.println("Zdravstvuye, spasibo za vash zvonok");
            }else if (selection == 5){
            System.out.println("Merhaba, aradiginiz icin tesekkur ederiz");
        }else{
            System.out.println("None of them working. Lets speak JAVA");
        }
    }
}
