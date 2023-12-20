package org.ulpgc.is1.model;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }
    public boolean isValid(){
        number.replaceAll("[\\s-]+", "");
        if (number.matches("(\\+34|0034)?[67]\\d{8}")){
            return true;
        } else {
            return false;
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber() {
        Boolean num = isValid();
        if (!num) {
            this.number = "XXXX";
        }
    }
}
