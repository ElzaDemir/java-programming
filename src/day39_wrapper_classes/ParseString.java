package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(count);

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        if(price>100){
            System.out.println("expensive");
        }else{
            System.out.println("Cheap");
        }
        String sentence = "I wrote 100 lines of code";
        String [] arr = sentence.split(" ");
        int num = Integer.parseInt(arr[2]);
        System.out.println(num);

    }
}
