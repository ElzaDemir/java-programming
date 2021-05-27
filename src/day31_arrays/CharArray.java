package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char each : letters){
            System.out.print(each + " ");
        }

        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);
        
        String item = "wooden spoon";
        char [] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String [] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for(String eachFruit: fruits){
             System.out.print(eachFruit + " - ");
             fruitStr+=eachFruit + " - ";
         }
        System.out.println("fruitStr = " + fruitStr);
        
        String [] languages = {"java", "python", "c++", "sql", "ruby"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join("##",languages));
        String joinedlangugaes = String.join("<>", languages);
        System.out.println("joinedlangugaes = " + joinedlangugaes);;


    }
}
