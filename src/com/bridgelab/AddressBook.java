package com.bridgelab;

import java.util.*;

//UC6 - Refactor to add multiple Address Book to the System. Each Address Book has a unique Name

public class AddressBook {

    static Scanner sc = new Scanner(System.in);
    static List<ContactPerson> cont = new ArrayList<>();
//    Uses information was storing.
    public static void addContact(String firstName, String lastName, String email, long phoneNumber, int zip, String city, String state, String address){
        cont.add(new ContactPerson(firstName,lastName,email,phoneNumber,zip,city,state,address));
    }

//    Editing method is defined
    public static void editContact(String firstName){
        for (ContactPerson obj : cont){
            if(firstName.equals(obj.getFirstName())){
                obj.edit();
            }
            else{
                System.out.println("Enter name is not present in the Address Book.. \n Thanks for use the Address Book Application");
            }
//            for(ContactPerson objects : cont){
//                System.out.println(objects);
//            }
        }
    }

//   Returns a non-negative integer if a Contact with phone is exists corresponding
//   To which place in the arrayList the Contact is stored. Returns -1
    public static int haveContact(String firstName){
        for(ContactPerson object : cont){
            if(object.getFirstName().equals(firstName)){
                return cont.indexOf(object);
            }
        }
        return -1;
    }

//    Deleting method defined
    public static void deleteContact(String firstName){
        int place = (int)haveContact(firstName);
        if(place>=0){
            cont.remove(place);
            System.out.println("Contact has been deleted!!");
        } else {
            System.out.println("No Contact were present in the Address Book.. \n Thanks for use the Address Book Application..");
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
            if(haveContact(firstName)>=0){
                System.out.println(firstName+" is already exit");
                break;
            }
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

//        Editing Contact
        System.out.print("If you want to edit the contact press Y to skip press any key :: ");
        String isEdit = sc.next().toLowerCase();
        if(isEdit.equals("y")){
            System.out.print("Enter the first name want to edit :: ");
            String editName = sc.next();
            editContact(editName);
        }

//        Deleting the Contact
        System.out.print("If you want to delete the Contact press Y to skip press any key :: ");
        String isDelete = sc.next().toLowerCase();
        if(isDelete.equals("y")){
            System.out.print("Enter the first name want to be delete :: ");
            String deleteName = sc.next();
            deleteContact(deleteName);
        }

        //        Display
        for(ContactPerson objects : cont){
            System.out.println(objects);
        }
    }
}
