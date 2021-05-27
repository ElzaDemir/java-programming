package day08_casting_scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CastingExamples {
    public static void main(String[] args) {
        //byte- short - int - long
        byte num1 = 100;
        short num2 = (byte) num1;
        int num3 = num1;
        long num4 = num1;

        //float<double
        float num6 = 124.56F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;

        System.out.println(num8);
        System.out.println("num9 = " + num9);

        int num10 = 55;
        byte num11 = (byte)num10;
        System.out.println("Number " + num11);
        long num12 = 4444L;
        int num13 = (int) num12;

        System.out.println(num12);

        int num14 = 22;
        byte num15 = (byte)num14;
        short num16 = (short)num14;

        System.out.println("num14 = " + num14);
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);
        double num17 = 55.3;
        float num18 = (float)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

        double num19 = 12345.5;
        int num20 = (int) num19;

        System.out.println("num19 = " + num19);
        System.out.println("num20 = " + num20);

        int num21 = 300;
        byte num22 = (byte) num21;

        System.out.println("num22 = " + num22);

        char letter = 'E';
        int numletter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numletter = " + numletter);







    }
}
