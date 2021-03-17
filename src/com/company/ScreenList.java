package com.company;

public class ScreenList {
    void mostrar(){
        Tittle tittle = new Tittle();
        tittle.mostrar("Lista de Contactos");

        for(Contact contacts: Main.agendaDeContactos.contacts){
            System.out.println(contacts.tittle);
            System.out.println(contacts.description);
        }


    }
}
