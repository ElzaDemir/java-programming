package day55_abstraction.interface_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by to " + locator);

    }

    @Override
    public void quit() {
        System.out.println("");

    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
