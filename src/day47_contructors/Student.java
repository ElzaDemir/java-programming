package day47_contructors;

public class Student {
    private String name;
    String age;

    //No_args constructor
     public Student(){
          System.out.println("No-Args constructor");
     }

     //constructor with 1 param: String name
     public Student (String name){
         System.out.println("name param constructor | name = " + name);
     }

     //constructor with age
     public Student (int age){
         System.out.println("age param constructor | age = " + age);
     }

     public Student (String name, int age){
         System.out.println("name & age param constructor | " + name  + " - " +age);
     }


}
