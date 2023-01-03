package com.bridgelab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookDictionary {
    static HashMap<String, AddressBook> dic = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        boolean flag = true;
        do {
            System.out.println();
            System.out.println("1. Please 1 to add Address Book");
            System.out.println("2. Please 2 to view Address Book");
            System.out.println("3. Please 3 to view the Person in City or State");
            System.out.println("4. Please 4 to exit");
            System.out.println();

            System.out.print("Please enter the Chosen Option ::: ");
            int chs = sc.nextInt();

            switch (chs){
                case 1:
                    System.out.print("Please enter the Name of the Dictionary of AddressBook ::: ");
                    String addressBookName = sc.next();
                    System.out.println("\n"+addressBookName+" has been created");
                    dic.put(addressBookName, addressBook);
                    for (Map.Entry<String, AddressBook> ele : dic.entrySet()){
                        System.out.println(ele.getKey() + " is Address book Elements are " + ele.getValue().cont);
                    }
                    addressBook.Contactlist(addressBookName,addressBook);
                    break;
                case 2:
                    for (Map.Entry<String, AddressBook> ele : dic.entrySet()){
                        System.out.println(ele.getKey() + " Elements are "+ ele.getValue().cont);
                    }
                    break;
                case 3:
                    System.out.print("Please enter the Name of the City or State ::: ");
                    String cit = sc.next();
                    dic.values().stream().forEach((ele) -> {
                        ele.cont.stream().filter(ele2 ->
                            ele2.getCity().equalsIgnoreCase(cit) || ele2.getState().equalsIgnoreCase(cit)
                        ).forEach(System.out::println);
                    });
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("\nPlease enter the valid Input:::\n");
                    break;
            }
        }while (flag);
    }
}
