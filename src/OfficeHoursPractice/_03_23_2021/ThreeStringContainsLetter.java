package OfficeHoursPractice._03_23_2021;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordwithA = "";

        if (wordOne.contains("a") && wordOne.length() > biggestWordwithA.length()) {
            biggestWordwithA = wordOne;
        }

        if (wordTwo.contains("a") && wordTwo.length() > biggestWordwithA.length()) {
            biggestWordwithA = wordTwo;
        }

        if (wordThree.contains("a") && wordThree.length() > biggestWordwithA.length()) {
            biggestWordwithA = wordThree;

        }
        if (biggestWordwithA.isEmpty()) {
            System.out.println("No words contained A");
        } else {
            System.out.println("Longest word with A: " + biggestWordwithA);
        }

    }
}

