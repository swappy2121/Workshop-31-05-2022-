package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressbookService {
    public List<AddressbookData> addressbookDetailsList;

    public AddressbookService(List<AddressbookData>addressbookDetailsList){
        this.addressbookDetailsList = addressbookDetailsList;
    }

    public static void main(String[] args) {
        List<AddressbookData>addressbookDetailsList = new ArrayList<>();
        AddressbookService addressbookService = new AddressbookService(addressbookDetailsList);
        Scanner readInConsole = new Scanner(System.in);
        addressbookService.readAddressbookdata(readInConsole);
        addressbookService.writeAddressbookData();

    }

    private void writeAddressbookData() {
        System.out.println("\nwriting Addressbookdata to console\n"+ addressbookDetailsList);

    }

    private void readAddressbookdata(Scanner readInConsole) {
        System.out.println("Enter First name : ");
        String firstName = readInConsole.next();
        System.out.println("Enter Last name : ");
        String lastName = readInConsole.next();
        System.out.println("Enter emailId name : ");
        String emailId = readInConsole.next();
        System.out.println("Enter Mob no. : ");
        String mobileNumber = readInConsole.next();
        System.out.println("Enter Address : ");
        String address = readInConsole.next();
        addressbookDetailsList.add(new AddressbookData(firstName,lastName,emailId,mobileNumber,address));

    }
}
