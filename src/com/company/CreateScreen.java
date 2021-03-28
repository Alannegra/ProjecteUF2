package com.company;

public class CreateScreen {
    void mostrar() {
        Tittle tittle = new Tittle();
        tittle.mostrar("CREAR NOTA");     // tittle = "CREAR NOTA"

        Contact contacts = new Contact();



        System.out.println("Nombre");

        contacts.name = Main.scanner.nextLine();

        System.out.println("Telefono");

        contacts.telefon = Main.scanner.nextLine();

        Main.agendaDeContactos.contacts.add(contacts);

    }
}

