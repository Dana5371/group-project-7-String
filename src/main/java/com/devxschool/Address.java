package com.devxschool;

public class Address {

    public static void main(String[] args) {

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */

        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        //TODO WRITE YOUR CODE HERE


        System.out.println(getStreetAddress(address));
        System.out.println(getCity(address));
        System.out.println(getState(address));
        System.out.println(getZipcode(address));

    }


    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {
        int addr = address.indexOf(',');//"2400 E Devon Ave #215,"
        return "Street address: " + address.substring(0, addr);
    }


    public static String getCity(String address) {
        int addr = address.indexOf(',');//"2400 E Devon Ave #215,"
        String str = address.substring(addr+1).trim();//"Des Plaines, IL 60018"
        int str1 = str.indexOf(',');//Des Plaines,
        return "City: " + str.substring(0,str1);//Des Plaines
    }

    public static String getState(String address) {
        int addr = address.indexOf(',');
        String str = address.substring(addr+1).trim();
        int str1 = str.indexOf(',');
        String str2 = str.substring(str1+1).trim();
        int zip = str2.indexOf(" ");
        return "State: " + str2.substring(0,zip);
    }

    public static String getZipcode(String address) {
        int addr = address.indexOf(',');
        String str = address.substring(addr+1).trim();
        int str1 = str.indexOf(',');
        String str2 = str.substring(str1+1).trim();
        int zip = str2.indexOf(" ");
        return "Zipcode: "+ str2.substring(zip).trim();
    }
}
