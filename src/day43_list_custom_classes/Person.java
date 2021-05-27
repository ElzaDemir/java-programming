package day43_list_custom_classes;

public class Person {
    //Data -> variables
    String firstName;
    int age;
    char gender;
    //behaviour
    public void speak(){
        System.out.println("Person is speaking");
    }

}
class People{ // class for running with main method
    public static void main(String[] args) {
        //create object of person class = Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "El";
        person1.age = 33;
        person1.gender = 'F';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Aslan";
        person2.age = 34;
        person2.gender = 'M';
        person2.speak();
       // person2 email = "mike@gmail.com"; does not work because you don't have it in your class Person.
        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

    }
}