package com.company;

import java.util.Scanner;

public class Contact {
    String name;
    String telefon;
    Scanner scanner = new Scanner(System.in);

    public Contact() {
        System.out.println("Nombre");
        this.name = scanner.nextLine();
        System.out.println("Telefono");
        this.telefon = scanner.nextLine();
    }

}


