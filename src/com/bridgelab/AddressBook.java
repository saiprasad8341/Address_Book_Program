package com.bridgelab;

import java.util.*;

//UC3 - Ability to edit existing contact person using their name

public class AddressBook {

    static Scanner sc = new Scanner(System.in);
    static List<ContactPerson> cont = new ArrayList<>();
//    Uses information was storing.
    public static void addContact(String firstName, String lastName, String email, long phoneNumber, int zip, String city, String state, String address){
        cont.add(new ContactPerson(firstName,lastName,email,phoneNumber,zip,city,state,address));
    }

    public static void editContact(String firstName){
        for (ContactPerson obj : cont){
            if(firstName.equals(obj.getFirstName())){
                obj.edit();
            }
            else{
                System.out.println();
            }
//            for(ContactPerson objects : cont){
//                System.out.println(objects);
//            }
        }
    }
    public static void main(String[] args) {
        String firstName,lastName,email,city,state,address;
        long phoneNumber;
        int zip;
        System.out.println("Welcome to the Address Book Program");
        System.out.print("Enter the No.of contacts you would like to enter :: ");
        int noofCont = sc.nextInt();
//      Getting input from the use
        for (int i = 0; i < noofCont; i++ ){
            System.out.print("Please Enter the First Name :: ");
            firstName = sc.next();
            System.out.print("Please Enter the Last Name :: ");
            lastName = sc.next();
            System.out.print("Please enter the Email :: ");
            email = sc.next();
            System.out.print("Please enter the Phone Number :: ");
            phoneNumber = sc.nextLong();
            System.out.print("Please enter the zip :: ");
            zip = sc.nextInt();
            System.out.print("Please enter the City :: ");
            city = sc.next();
            System.out.print("Please enter the State :: ");
            state = sc.next();
            System.out.print("Please enter the Address :: ");
            address = sc.next();
            System.out.println("-------------------------------------------------------------------------------");

            addContact(firstName,lastName,email,phoneNumber,zip,city,state,address);
        }

        System.out.print("If want to edit the contact press Y or N :: ");
        String isEdit = sc.next().toLowerCase();
        System.out.print("Enter the first name want to edit :: ");
        String editName = sc.next();
        if(isEdit.equals("y")){
            editContact(editName);
        }

        //        Display
        for(ContactPerson objects : cont){
            System.out.println(objects);
        }
    }
}
