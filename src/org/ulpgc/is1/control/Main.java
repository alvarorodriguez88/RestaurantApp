package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("611401283");
        phone.isValid();
    }
}