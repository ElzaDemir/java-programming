package day28_loops;

public class FindUniqueCharacters {
    public static void main(String[] args) {
        String word = "java";
        String n = "";

        for (int i = 0; i<word.length(); i++){

            if(!n.contains(word.charAt(i) + "")){
                n+=word.charAt(i);

            }
        }
        System.out.println(n);

    }
}
