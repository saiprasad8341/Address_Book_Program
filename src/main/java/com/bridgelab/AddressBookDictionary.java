package com.bridgelab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//UC12 - Ability to sort the entries in
//the address book by City,
//State, or Zip
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
            System.out.println("4. Please 4 to view the Person by City or State");
            System.out.println("5. Please 5 to view the count by City or State");
            System.out.println("6. Please 6 to short by Name");
            System.out.println("7. Please 7 to short by Name");
            System.out.println("8. Please 8 to exit");
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
                    System.out.print("Please enter the City or State ::: ");
                    String nm = sc.next();
                    if (nm.equalsIgnoreCase("city")){
                        System.out.print("Please enter the city ::: ");
                        String city = sc.next();
                        dic.values().stream().forEach((ele) -> {
                            ele.cityPersonMap.entrySet().stream().filter((ele2) ->
                                ele2.getKey().equalsIgnoreCase(city)
                            ).forEach((ele3) -> System.out.println(ele3));
                        });
                    } else if (nm.equalsIgnoreCase("state")) {
                        System.out.print("Please enter the state ::: ");
                        String state = sc.next();
                        dic.values().stream().forEach((ele) -> {
                            ele.statePersonMap.entrySet().stream().filter((ele2) ->
                                ele2.getKey().equalsIgnoreCase(state)
                            ).forEach((ele3) -> System.out.println(ele3));
                        });
                    } else {
                        System.out.println("Invalid input.... Please enter 'City' || 'State'");
                    }
                    break;
                case 5:
                    System.out.print("Please enter the City or State ::: ");
                    String cs = sc.next();
                    if (cs.equalsIgnoreCase("city")){
                        System.out.print("Please enter the city ::: ");
                        String city = sc.next();
                        int cityCount = 0;
                        dic.values().stream().forEach((ele) -> {
                            ele.cityPersonMap.entrySet().stream().filter((ele2) ->
                                    ele2.getKey().equalsIgnoreCase(city)
                            ).count();
                        });
                        System.out.println("Total Count ::: "+cityCount);
                    } else if (cs.equalsIgnoreCase("state")) {
                        System.out.print("Please enter the state ::: ");
                        String state = sc.next();
                        dic.values().stream().forEach((ele) -> {
                            ele.statePersonMap.entrySet().stream().filter((ele2) ->
                                    ele2.getKey().equalsIgnoreCase(state)
                            ).count();
                        });
                    } else {
                        System.out.println("Invalid input.... Please enter 'City' || 'State'");
                    }
                    break;
                case 6:
                    for (Map.Entry<String, AddressBook> ele : dic.entrySet()){
                        System.out.println("Sorting entries for AddressBook of "+ ele.getKey() + " by Name :: ");
                        ele.getValue().cont.stream().sorted((con1,con2) ->
                            con1.getFirstName().compareToIgnoreCase(con2.getFirstName())
                        ).forEach((ele2) -> System.out.println(ele2));
                    }
                    break;
                case 7:
                    System.out.print("Enter the option by which need to sort City, State and Zip code ::: ");
                    String choice = sc.next();
                    if (choice.equalsIgnoreCase("City")) {
                        for (Map.Entry<String, AddressBook> ele : dic.entrySet()){
                            System.out.println("Sorting entries for AddressBook "+ ele.getKey() + " by City ::: ");
                            ele.getValue().cont.stream().sorted((con1,con2) ->
                                con1.getCity().compareToIgnoreCase(con2.getCity())
                            ).forEach(ele2 -> System.out.println(ele2));
                        }
                    } else if (choice.equalsIgnoreCase("State")) {
                        for (Map.Entry<String, AddressBook> ele : dic.entrySet()){
                            System.out.println("Sorting entries for AddressBook "+ ele.getKey() + " by State ::: ");
                            ele.getValue().cont.stream().sorted((con1,con2) ->
                                    con1.getState().compareToIgnoreCase(con2.getState())
                            ).forEach(ele2 -> System.out.println(ele2));
                        }
                    }else if (choice.equalsIgnoreCase("Zip code")) {
                        for (Map.Entry<String, AddressBook> ele : dic.entrySet()){
                            System.out.println("Sorting entries for AddressBook "+ ele.getKey() + " by City ::: ");
                            ele.getValue().cont.stream().sorted((con1,con2) ->
                                    (con1.getZip() < con2.getZip() ? -1 : (con1.getZip() > con2.getZip()) ? 1 : 0)
                            ).forEach(ele2 -> System.out.println(ele2));
                        }
                    } else
                        System.out.println("Invalid input. Please enter the valid Input....");
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("\nPlease enter the valid Input:::\n");
                    break;
            }
        }while (flag);
    }
}
