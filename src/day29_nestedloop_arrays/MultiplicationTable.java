package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int outer  = 1; outer<=10; outer++){
            System.out.println();
            for(int inner = 1; inner<=10; inner++){
              //System.out.println(outer + " * " + inner + " = " + (outer*inner)); // one way
                System.out.print(outer*inner + " \t"); // second way
            }
            //System.out.println();



        }
    }
}
