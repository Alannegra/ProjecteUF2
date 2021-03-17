package com.company;

public class CreateScreen {
    void mostrar() {
        Tittle tittle = new Tittle();
        tittle.mostrar("CREAR NOTA");     // tittle = "CREAR NOTA"

        Contact contacts = new Contact();

        System.out.println("Titulo del mensaje:");
        contacts.tittle = Main.scanner.nextLine();

        System.out.println("Contenido del mensaje:");
        contacts.description = Main.scanner.nextLine();

        Main.agendaDeContactos.contacts.add(contacts);
    }
}
