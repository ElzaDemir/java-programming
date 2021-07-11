package day60_exceptions;

import day59_polymorphism_exceptions.runtime_exceptions.RuntimeErrorExample;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Let's create exceptions");
//        RuntimeException e = new RuntimeException();
//        throw e;
        //throw new RuntimeException();
        String username = "";
        if (username.isEmpty()){
            throw new RuntimeException("Username cannot be empty");
        }

    }
}
