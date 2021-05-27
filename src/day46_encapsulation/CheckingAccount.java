package day46_encapsulation;

public class CheckingAccount {
    int balance;
    long accountNumber;
    String accountHolder;
    String type;

    //SHORT CUT FOR GETTER AND SETTER > right click > generate > Getter and Setter > Select All > OK

    public void setAccountHolder (String accountHolder){

        this.accountHolder=accountHolder;
    }

    public String getAccountHolder(){

        return accountHolder;
    }
    public void setType (String type){

        this.type = type;
    }
    public String getType(){

        return type;
    }
    public void setBalance (int balance){

        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setAccountNumber(long accountNumber){

        this.accountNumber = accountNumber;
    }
    public long getAccountNumber(){

        return accountNumber;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=$" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
