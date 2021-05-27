package day30_arrays;

import java.sql.SQLOutput;
import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5]; //1. one way to use arrays. This way useful when you don't know your values. When it comes from somewhere else.
        student1[0] = "EI7777";
        student1[1] = "Elvira";
        student1[2] =  "Demir";
        student1[3] = "Batch22";
        student1[4] = "777-666-55-44";

        String [] student2 = {"8888", "Aslan", "Demir", "Batch #20", "888-666-55-44"}; //2. second and shorter way to do is this one

        System.out.println("student1 id = "  + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " +  student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 phone #  = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if(student1.length == 5){
            System.out.println("Data array ash correct length");
        }else{
            System.out.println("Data array has incorrect length");
        }

        if(student1.length == student2.length){
            System.out.println("Data arrays length match");
        }else{
            System.out.println("Dta array length doesn't match");
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        System.out.println((student1[1] + " " + student1[2]).toUpperCase()); //another way of doiing above
        String mobileNum = student1[4];


    }
}
