package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "Cybertek123";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)){
            System.out.println("Welcome to your account " + Instant.now());
        }else{
        }if (!expUserName.equalsIgnoreCase(userName)){
            System.out.println("Fail - username is incorrect");
        }else{
            System.out.println("Fail - password is incorrect");
        }

    }
}
