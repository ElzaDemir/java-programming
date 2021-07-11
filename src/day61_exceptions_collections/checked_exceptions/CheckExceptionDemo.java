package day61_exceptions_collections.checked_exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");
        /**
         * Thread.sleep(1000); causes/throws an InterrruptedException, which is a checked exception.
         * 1) Handling using try catch
         */

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 2) Declaring using THROWS keyword
         */

        Thread.sleep(5000);
        System.out.println("Woke up after 5 seconds");
    }

}
