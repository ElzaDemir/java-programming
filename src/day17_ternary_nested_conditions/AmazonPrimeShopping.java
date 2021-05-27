package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemprice = 35;
        boolean isPrimeMember = false;

        if(isPrimeMember){
            System.out.println("Eligible for free 2 days shipping");
        }else if (itemprice>25){
                System.out.println("Eligible for free regular shipping");
        }else{
            System.out.println("Not eligible for free shipping. Fee = $10");
        }
        }
    }

