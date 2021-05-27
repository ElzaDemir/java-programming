package OfficeHoursPractice._03_02_2021;

public class PersonalInfo_03_02_2021 {
    public static void main(String[]args){
       String name, fullBirthDate, favoriteQuote;
       byte age;
       char gender;
       boolean student;
       short numberOfSiblings;
       long favoriteNumber;
       int year;
       double birthDate;

       name = "Elvira";
       age = 34;
       gender = 'M';
       student = true;
       numberOfSiblings = 1;
       favoriteNumber = 777L;
       birthDate = 3.2;
       year = 1988;
       fullBirthDate = "" + birthDate + '.' + year;
       System.out.println(fullBirthDate);

    }
}
