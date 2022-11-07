package com.bridgelab;

public class ContactPerson {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private int zip;
    private String city;
    private String state;
    private String address;

//    Creating the public method to assign the contactPerson value
    public void contact(String firstName, String lastName, String email, int phoneNumber, int zip, String city, String state, String address){
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
    public int getPhoneNumber() {
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
                "First Name :: " + firstName +
                "Last Name :: " + lastName +
                "Email :: " + email +
                "Phone Number :: " + phoneNumber +
                "Zip :: " + zip +
                "City :: " + city +
                "State :: " + state +
                "address :: " + address +
                "} ";
    }
}
