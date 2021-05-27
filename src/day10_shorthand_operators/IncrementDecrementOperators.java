package day10_shorthand_operators;

import javax.sound.sampled.Line;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 2;
        i++;
        System.out.println("count = " + i);
        i++;
        ++i;
        i++;
        i++;
        ++i;
        System.out.println("i = " + i);
        
        int LinesOfCode = 15;
        System.out.println("LinesOfCode = " + LinesOfCode);
        LinesOfCode = LinesOfCode +1;
        LinesOfCode += 1;
        LinesOfCode++;
        ++LinesOfCode;
        System.out.println("linesofcode = " + LinesOfCode);
        LinesOfCode = LinesOfCode - 1;
        LinesOfCode -= 1;
        LinesOfCode--;
        --LinesOfCode;
        System.out.println("LinesOfCode = " + LinesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        --letter;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        ++letter;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        --letter;
        System.out.println("letter = " + letter);
        letter--;letter--;letter--;
        System.out.println("letter = " + letter);


    }
}
