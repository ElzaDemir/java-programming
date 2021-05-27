package day37_methods;

public class WarmUpMethods {
    public static void main(String[] args) {
        logInVoid ("Elvira", "E12345"); //POSITIVE SCENARIO
        logInVoid("cybertek", "answer");//NEGATIVE SCENARIOS, RAINY DAY SCENARIOS
        System.out.println(login("CybertekStudent", "Cybertek123"));

        boolean isLogInSucess = login ("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLogInSucess);

        if (login("nadir", "mountain")){
            System.out.println("Welcome to Canvas");
        }else{
            System.out.println("Wrong credentials");
        }

    }
    public static void logInVoid(String userName, String password){
        String secretUsername = "Elvira";
        String secretPassword = "E12345";
        if(userName.equals(secretUsername) && (password.equals(secretPassword))){
            System.out.println("Welcome to your account");
        }else{
            System.out.println("Incorrect username or password");
        }

    }
    public static boolean login (String userName, String password){
        String secretUsername = "CybertekStudent";
        String secretPassword = "Cybertek123";
        //return userName.equals(secretUsername) && password.equals(secretPassword); //you can just use this without else and if condition. but you can also do with else and if as below
        if(userName.equals(secretUsername) && (password.equals(secretPassword))){
            return true;
        } //else{ //you can use without else also
            return false;
        }
    }

