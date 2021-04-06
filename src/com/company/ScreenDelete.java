package com.company;

import java.util.Scanner;

public class ScreenDelete {
    static Scanner scanner = new Scanner(System.in);
    boolean mostrar(){
        Tittle tittle = new Tittle();
        tittle.mostrar("BORRAR CONTACTO");



        String[] array = new String[Main.agendaDeContactos.contacts.size()+1];



        for (int i = 0; i < array.length -1 ; i++) {

            array[i] = Main.agendaDeContactos.contacts.get(i).name;

        }

        array[array.length -1] = "salir";

        Menu menu = new Menu();


        System.out.println("Numero de la posicion del Contacto: ");

        String position = menu.elegirOpcion(array);

    

        int index = Integer.valueOf(position)-1;


        if(index == array.length -1){
            return false;
        }
        String firstName = Main.agendaDeContactos.contacts.get(index).name;

        Main.agendaDeContactos.contacts.remove(index);


        for ( Contact c : Main.agendaDeContactos.contacts) {

            System.out.println(c.name);
        }

        return true;

    }
}
