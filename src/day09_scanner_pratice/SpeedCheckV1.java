package day09_scanner_pratice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        double speedlimit = 55;
        double currentspeed = 75;
        double overTheLimit = currentspeed - speedlimit;

        System.out.println("I am driving " + overTheLimit + " mph over the limit. Slow Down! ");
    }
}
