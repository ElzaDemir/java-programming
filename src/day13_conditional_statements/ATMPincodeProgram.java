package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("\n***** WELCOME TO TD BANK ATM *****");
        int secretPincode = 1234;
        int intpputPincode = 1334;

        if (secretPincode==intpputPincode){
            System.out.println("\nWelcome to your account");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pincode! - " + intpputPincode);
            System.out.println("Please try again");
        }
        System.out.println("\nThank you for using TD Bank" );
    }
}
