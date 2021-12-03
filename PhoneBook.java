package com.company;



public class PhoneBook {

    private String name;
    private int currentIdex = 0;
    private Contact[] arraylaist  = new Contact[10];


    public PhoneBook(String name) {
        this.name = name;
    }


    public void getName(){
        System.out.println("telefon kitobi");
    }


    public void add(String firstName, String lastNmae, String number){
       Contact contact = new Contact(firstName, lastNmae, number);
        this.arraylaist[currentIdex]=contact;
        currentIdex++;


    }

    public String first() {
        return this.arraylaist[0].toString();
    }


    public String get(int n){
        if (n > 0) {
            return this.arraylaist[n - 1].toString();
        }
        return "!!!";

    }

   public void tostring(){
       for (int i = 0; i < this.currentIdex; i++) {
           System.out.print("(" + this.arraylaist[i].toString()  + ")");
       }
   }

   public String find(String text){
       for (int i = 0; i < this.currentIdex; i++) {
           Contact contact = this.arraylaist[i];
           if (contact.izlash(text)) {
               return contact.toString();
           }

       }
       return "!!!";
   }




}
