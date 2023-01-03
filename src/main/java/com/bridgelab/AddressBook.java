package com.bridgelab;

import java.util.*;

//UC8 - Ability to search Person
//in a City or State across
//the multiple AddressBook

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
        }
    }

//   Returns a non-negative integer if a Contact with phone is exists corresponding
//   To which place in the arrayList the Contact is stored. Returns -1
    public static int haveContact(long phno){
        for(ContactPerson object : cont){
            if(Objects.equals(object.getPhoneNumber(), phno)){
                return cont.indexOf(object);
            }
        }
        return -1;
    }

//    Deleting method defined
    public static void deleteContact(long phno){
        int place = (int)haveContact(phno);
        if(place>=0){
            cont.remove(place);
            System.out.println("Contact has been deleted!!");
        } else {
            System.out.println("No Contact were present in the Address Book.. \n Thanks for use the Address Book Application..");
        }
    }

    public void Contactlist(String addressBookName, AddressBook addressBook) {
        String firstName, lastName, email, city, state, address;
        long phoneNumber;
        int zip;
        boolean flag = true;
        System.out.println("Welcome to the Address Book Program");
        do {
            int chs;
            System.out.println();
            System.out.println("1. press 1 for adding");
            System.out.println("2. press 2 for editing");
            System.out.println("3. press 3 for deleting");
            System.out.println("4. press 4 for Display");
            System.out.println("5. press 5 for exit");
            System.out.println();

            System.out.print("Please enter the Chosen Option ::: ");
            chs = sc.nextInt();
            switch (chs){
                case 1:
                    System.out.print("Enter the No.of contacts you would like to enter :: ");
                    int noofCont = sc.nextInt();
//      Getting input from the use
                    for (int i = 0; i < noofCont; i++) {
                        System.out.print("Please Enter the First Name :: ");
                        firstName = sc.next();
                        System.out.print("Please Enter the Last Name :: ");
                        lastName = sc.next();
                        System.out.print("Please enter the Email :: ");
                        email = sc.next();
                        System.out.print("Please enter the Phone Number :: ");
                        phoneNumber = sc.nextLong();
                        if (haveContact(phoneNumber) >= 0) {
                            System.out.println(phoneNumber + " is already exit");
                            break;
                        }
                        System.out.print("Please enter the zip :: ");
                        zip = sc.nextInt();
                        System.out.print("Please enter the City :: ");
                        city = sc.next();
                        System.out.print("Please enter the State :: ");
                        state = sc.next();
                        System.out.print("Please enter the Address :: ");
                        address = sc.next();
                        System.out.println("-------------------------------------------------------------------------------");

                        addContact(firstName, lastName, email, phoneNumber, zip, city, state, address);
                    }
                    break;
                case 2:
                    //        Editing Contact
                    System.out.print("If you want to edit the contact press Y to skip press any key :: ");
                    String isEdit = sc.next().toLowerCase();
                    if (isEdit.equals("y")) {
                        System.out.print("Enter the first name want to edit :: ");
                        String editName = sc.next();
                        editContact(editName);
                    }
                    break;
                case 3:
//        Deleting the Contact
                    System.out.print("If you want to delete the Contact press Y to skip press any key :: ");
                    String isDelete = sc.next().toLowerCase();
                    if (isDelete.equals("y")) {
                        System.out.print("Enter the Phone number want to be delete :: ");
                        long phno = sc.nextLong();
                        deleteContact(phno);
                    }
                    break;
                case 4:
                    //        Display
                    for (ContactPerson objects : cont) {
                        System.out.println(objects);
                    }
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("\nPlease enter the valid Input:::\n");
                    break;
            }
        }while (flag);
    }
}
