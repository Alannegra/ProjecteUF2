package com.company;

public class ScreenList {
    void mostrar()  {
        Tittle tittle = new Tittle();
        tittle.mostrar("Lista de Contactos");

        for(Contact c: Main.agendaDeContactos.contacts){


            System.out.println(c.name);
            //System.out.println(contacts.description);
        }

        System.out.println("Texto a buscar");

        String textoABuscar = Main.scanner.nextLine();


        for(Contact nota: Main.agendaDeContactos.contacts){
            if(nota.name.contains(textoABuscar)){
                System.out.println(nota.name);
            } else {
                System.out.println("no extise la nota");
            }
        }

    }
}
