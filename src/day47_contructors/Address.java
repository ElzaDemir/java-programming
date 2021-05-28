package day47_contructors;

public class Address {
    private String street, city, state, zipCode;
    private String country = "USA";

    public Address(){   // THIS IS CONSTRUCTOR - AUTOMATICALLY CALLED
        //no return type,
        System.out.println("Address constructor");
        street = "123 unknown";
        city = "Unknown";
        state = "Unknown";
        zipCode = "00000";
    }
    //second constructor, overloaded constructor - provides shortcut to initialize variables
    // in same statement: ex: Address ad - new Address ("123 java st", "Boston", "MA", "43212");
    public Address(String street, String city, String state, String zipCode){
        setStreet(street);
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setStreet (String street){
        if(street.isEmpty() || street.length()>50){
            System.out.println("ERROR: Invalid street");
        }else{
            this.street = street;
        }
        this.street = street;
    }
    public String getStreet(){
        return street;
    }
    public void setCity (String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setState (String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
//        return "Address{" +
//                "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zipCode='" + zipCode + '\'' + ", country='" + country + '\'' +
//                '}';
        return street + ", " + city + ", " + state + " " + zipCode + ", " + country;
    }
}

