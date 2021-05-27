package day47_contructors;

public class Address {
    private String street, city, state, zipCode;
    private String country = "USA";

    public void setStreet (String street){
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

