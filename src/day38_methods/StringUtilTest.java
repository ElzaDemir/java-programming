package day38_methods;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");
        }
    }
}
