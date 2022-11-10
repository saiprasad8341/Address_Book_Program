package com.bridgelab;

import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class ContactPerson {
    Scanner sc = new Scanner(System.in);
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

    public void edit(){
        System.out.println("Calling the edit method");
        System.out.print("Please Enter the First Name :: ");
        this.firstName = sc.next();
        System.out.print("Please Enter the Last Name :: ");
        this.lastName = sc.next();
        System.out.print("Please enter the Email :: ");
        this.email = sc.next();
        System.out.print("Please enter the Phone Number :: ");
        this.phoneNumber = sc.nextLong();
        System.out.print("Please enter the zip :: ");
        this.zip = sc.nextInt();
        System.out.print("Please enter the City :: ");
        this.city = sc.next();
        System.out.print("Please enter the State :: ");
        this.state = sc.next();
        System.out.print("Please enter the Address :: ");
        this.state = sc.next();
    }

//    Comparator
    public static Comparator<ContactPerson> nameComarator = new Comparator<ContactPerson>() {
        @Override
        public int compare(ContactPerson o1, ContactPerson o2) {
            String contact1 = o1.getFirstName().toLowerCase();
            String contact2 = o2.getFirstName().toLowerCase();

            return contact1.compareTo(contact2);
        }
    };

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
