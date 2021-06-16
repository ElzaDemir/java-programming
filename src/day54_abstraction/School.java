package day54_abstraction;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class School {
    public static void main(String[] args) {
        //Student student = new Student();ERROR - Cannot create object of Student
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();

    }
}
