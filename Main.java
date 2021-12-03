package com.company;

public class Main {

    public static void main(String[] args) {
	PhoneBook phoneBook = new PhoneBook("Telefon ktiob");

        phoneBook.getName();


        phoneBook.add("jalol", "karshiboyev", "5778383");
        phoneBook.add("akbar", "yoqubov", "5389222");
        phoneBook.add("qobil", "mallayev", "0293847");
        phoneBook.add("yaxyo", "teshayev", "12344");
        phoneBook.add("karim", "botirov", "9935262");
        phoneBook.add("bobur", "alijonov", "9465783");
        phoneBook.add("malik", "kobilov", "0385528");

        System.out.println(phoneBook.first());

        System.out.println(phoneBook.get(5));


        phoneBook.tostring();


        System.out.println(phoneBook.find("jal"));


    }
}
