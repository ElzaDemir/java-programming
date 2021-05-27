package day34_void_methods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println(">>>>>> STARTING ETSY SEARCH SMOKE TEST <<<<<<");
        System.out.println();
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println();
        System.out.println(">>>>>> Etsy Search Smoke Test completed! <<<<<<");

    }

    public static void openBrowser(){
        System.out.println("=>=>=> Open any browser that you are comfortable with");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("=>=>=> Navigating to URL: https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("=>=>=> Search for Wooden Spoon - type \"Wooden Spoon\"");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("=>=>=> 33,603 results. Purchase one!");
    }
}
