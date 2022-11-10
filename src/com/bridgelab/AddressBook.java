package com.bridgelab;

import java.util.ArrayList;
//<<<<<<< UC2-AddNewContacts
import java.util.Scanner;

//UC3 - Ability to edit existing contact person using their name

public class AddressBook {
    static ArrayList<ContactPerson> cont = new ArrayList<ContactPerson>();
//    Uses information was storing.
    public static void addContact(String firstName, String lastName, String email, long phoneNumber, int zip, String city, String state, String address){
        cont.add(new ContactPerson(firstName,lastName,email,phoneNumber,zip,city,state,address));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        Scanner sc = new Scanner(System.in);

//      Getting input from the use
        System.out.print("Please Enter the First Name :: ");
        String firstName = sc.next();
        System.out.print("Please Enter the Last Name :: ");
        String lastName = sc.next();
        System.out.print("Please enter the Email :: ");
        String email = sc.next();
        System.out.print("Please enter the Phone Number :: ");
        long phoneNumber = sc.nextLong();
        System.out.print("Please enter the zip :: ");
        int zip = sc.nextInt();
        System.out.print("Please enter the City :: ");
        String city = sc.next();
        System.out.print("Please enter the State :: ");
        String state = sc.next();
        System.out.print("Please enter the Address :: ");
        String address = sc.next();

        addContact(firstName,lastName,email,phoneNumber,zip,city,state,address);
        System.out.println(cont);
//////========

//UC1 - Ability to create a Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.

public class AddressBook {
    static ArrayList<ContactPerson> array = new ArrayList<ContactPerson>();
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        System.out.println(array);
//>>>>>>> master
    }
}
