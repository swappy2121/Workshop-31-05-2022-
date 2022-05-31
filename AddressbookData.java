package com.bridgelabz;

public class AddressbookData {
    public String firstName;
    public String lastName;
    public String emailId;
    public String mobileNumber;
    public String address;

    public AddressbookData(String firstName ,String lastName,String emailId,String mobileNumber,String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public String toString(){
        return "First name : = " + firstName + "Last name : " + lastName + "Email : "+ emailId+"mobile no. : "+mobileNumber+"Address : "+address;
    }
}
