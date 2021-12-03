package com.company;

public class Contact {

    private String firstName;
    private String lastNmae;
    private String number;

    public Contact() {
    }

    public Contact(String firstName, String lastNmae, String number) {
        this.firstName = firstName;
        this.lastNmae = lastNmae;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastNmae='" + lastNmae + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


    public boolean izlash(String text) {
        if (this.firstName.contains(text) || this.lastNmae.contains(text) || this.number.contains(text)) {
            return true;
        } else {
            return false;
        }
    }
}
