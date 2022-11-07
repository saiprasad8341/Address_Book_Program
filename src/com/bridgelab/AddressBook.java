package com.bridgelab;

import java.util.ArrayList;

//UC1 - Ability to create a Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.

public class AddressBook {
    static ArrayList<ContactPerson> array = new ArrayList<ContactPerson>();
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        System.out.println(array);
    }
}
