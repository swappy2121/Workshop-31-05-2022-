package com.bridgelabz;

import java.io.FileOutputStream;

public class WritingInTheFileTXTExtention {
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("swapnil.txt");
            String details = "first name : swapnil\n last name : Pawar\n mob no. : 8600127352\n address : hastinagar\n email : swapnilPawar25@gmail.com";
            byte  list[] = details.getBytes();
            System.out.println("this is addressBook details ");
            file.write(list);
            file.close();
            System.out.println("success");

        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("All process is successful");
        }
    }
}



