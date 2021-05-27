package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount();

        myAccount.setAccountHolder("Elvira Demir");

        myAccount.setAccountNumber(1234456536544L);

        myAccount.setBalance(65000);
        //System.out.println("$" + myAccount.getBalance());

        myAccount.setType("Checking");

        //System.out.println(myAccount.toString());
        System.out.println(myAccount);
    }
}
