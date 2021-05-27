package day38_methods;

/*
   import all static methods. so you can just call by method name, without classname
 */
    import static day38_methods.isPalindromeUsingMethod.*;
    public class isPalindromeUsingMethod {

    public static void main(String[] args) {
        System.out.println("civic = " + isPalindromeUsingMethod.isPalindrome("civic"));
        System.out.println("isPalindrome (kaya) = " + isPalindromeUsingMethod.isPalindrome("kayak"));
        System.out.println("isPalindrome (Cybertek) = " + isPalindrome("cybertek"));
    }
    public static boolean isPalindrome (String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;

            }
        }
        return true;

    }

}
