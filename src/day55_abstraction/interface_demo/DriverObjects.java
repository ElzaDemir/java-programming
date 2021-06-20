package day55_abstraction.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        //WebDriver driver = new WebDriver(); //ERROR - CANNOT CRETE OBJECT OF INTERFACE
        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();

        driver1.get("https://www.google.com");
        driver.findElement("//input[@name = 'q']");
        System.out.println("Title = " + driver.getTitle());
    }
}
