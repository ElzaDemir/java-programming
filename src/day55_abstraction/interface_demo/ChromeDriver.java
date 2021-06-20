package day55_abstraction.interface_demo;

public class ChromeDriver implements WebDriver{
    public ChromeDriver(){
        System.out.println("Launching Chrome Browser");
    }

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver = navigating to" + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver = locating element" + locator);

    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver = navigating to");

    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
