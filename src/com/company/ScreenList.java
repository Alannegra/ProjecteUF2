package com.company;

public class ScreenList {
    void mostrar(){
        Tittle tittle = new Tittle();
        tittle.mostrar("NOTAS GUARDADAS");

        for(Contact contacts: Main.agendaDeContactos.contacts){
            System.out.println(contacts.tittle);
        }

    }
}
