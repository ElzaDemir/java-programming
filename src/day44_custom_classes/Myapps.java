package day44_custom_classes;

public class Myapps {
    public static void main(String[] args) {
        //String app1 = "uber"; This is just String object, just characters. Cannot do a lot with it
        App uberApp = new App();
        uberApp.name = "Uber";
        uberApp.version = 3.2;
        uberApp.open(); //call open method using object variable

        uberApp.version = 4.0;
        uberApp.open();
    }
}
