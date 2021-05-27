package Day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        int index = -1;
        char letter = 'u';

        for (int i = 0; i<word.length(); i++){
            //System.out.println(i + " - " + word.charAt(i));
            if(word.charAt(i)==letter){
                index = i;
                System.out.println(letter + " is found at Index " + index);
        }

        }
        if(index == -1){
            System.out.println("letter " + " is not present");
        }

    }
}
