package day38_methods;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        int[] nums= {5, 23, 1, 543, 90};
    ArrayUtils.printArray(nums);
    ArrayUtils.printArray(new int[]{23,64,54,25,14});
        System.out.println("total = " + ArrayUtils.sum(nums));
        System.out.println("total = " + ArrayUtils.sum(new int[]{23,64,54,25,14}));

        int [] num = {10, 12, 23};
        System.out.println("found = " + ArrayUtils.contains(nums,10));
        System.out.println("found = " + ArrayUtils.contains(nums,12));

    }

}
