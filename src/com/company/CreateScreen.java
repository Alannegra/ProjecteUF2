package com.company;

public class CreateScreen {
    void mostrar() {
        Tittle tittle = new Tittle();
        tittle.mostrar("CREAR NOTA");     // tittle = "CREAR NOTA"

        System.out.println("Nombre");

        String name = Main.scanner.nextLine();

        System.out.println("Telefono");

        String telefon = Main.scanner.nextLine();

        Main.db.insertContact(name, telefon);

//        Main.agendaDeContactos.contacts.add(contacts);

    }
}

