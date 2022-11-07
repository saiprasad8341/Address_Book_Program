package com.bridgelab;

public class ContactPerson {
    private String firstName;
    private String lastName;

    private String email;
    private long phoneNumber;
    private int zip;
    private String city;
    private String state;
    private String address;

//    Creating the public method to assign the contactPerson value
    public ContactPerson(String firstName, String lastName, String email, long phoneNumber, int zip, String city, String state, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zip = zip;
        this.city = city;
        this.state = state;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public  String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public int getZip() {
        return zip;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getAddress() {
        return address;
    }

//    printing the contact person details
    @Override
    public String toString(){
        return "Contact info {" +
                "\t First Name :: " + firstName +
                "\t Last Name :: " + lastName +
                "\t Email :: " + email +
                "\t Phone Number :: " + phoneNumber +
                "\t Zip :: " + zip +
                "\t City :: " + city +
                "\t State :: " + state +
                "\t address :: " + address +
                "\t } ";
    }
}
