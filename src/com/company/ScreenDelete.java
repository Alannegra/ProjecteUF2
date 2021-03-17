package com.company;

import java.util.Scanner;

public class ScreenDelete {
    static Scanner scanner = new Scanner(System.in);
    void mostrar(){
        Tittle tittle = new Tittle();
        tittle.mostrar("\033[31m" + "BORRAR CONTACTO" + "\033[0m");

        int position = -1;

        for(Contact contacts: Main.agendaDeContactos.contacts){
            System.out.println(contacts.tittle);
        }

        Contact contacts = new Contact();

        System.out.println("Numero de la posicion del Contacto");
        position = Main.scanner.nextInt();



        String firstName = list.get(0);         //alex


        System.out.println(firstName);

        System.out.println(contacts[position].tittle);


    }
}
