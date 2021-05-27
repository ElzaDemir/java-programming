package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
int last4SSN = 1234;
int pinCode = 4321;

int expLast4SSN = 5678;
int expPinCode = 8765;
        if(last4SSN==expLast4SSN && pinCode==expPinCode){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication unsuccessful");
            if(last4SSN != expLast4SSN){
                System.out.println("Last 4 SSN number is incorrect");
            }
        }if (expPinCode != pinCode){
            System.out.println("Pin Code is incorrect");
        }
//if(last4SSN==expLast4SSN){
//}if( pinCode==expPinCode){
//    System.out.println("Authentication successful");
//}else{
//            System.out.println("Incorrect pass code");
//        }else{
//            System.out.println("Incorrect pin code");
//        }
    }
}
