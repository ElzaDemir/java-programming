package day33_arrays;

public class LoopWith2Variables {
    public static void main(String[] args) {
        for(int i = 1, j = 1; i<=4; i++, j++){
            System.out.println("i = " + i + ", j = " + j);
        }

        System.out.println("\n2 ways for loop");
        for(int i = 1, j = 5; j>=0; i++, j--){
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
