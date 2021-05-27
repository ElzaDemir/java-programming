package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting: World's smallest cat \uD83D\uDC08 = BBC");
        int seconds = 0;
         while(seconds<=117){
             System.out.println("Watching cat \uD83D\uDC08 video at second" + seconds);
             seconds++;
             Thread.sleep(1000);
         }
        System.out.println("Finished watching Cat Video, let's start another one");



    }
}
