package com.company;

public class ScreenList {
    void mostrar()  {
        Tittle tittle = new Tittle();
        tittle.mostrar("Lista de Contactos");

        for(Contact c: Main.db.selectContacts()){


            System.out.println(c.name);
            //System.out.println(contacts.description);
        }

        System.out.println("Texto a buscar");

        String textoABuscar = Main.scanner.nextLine();


        for(Contact nota: Main.db.selectContactsConNombre(textoABuscar)){
            if(nota.name.contains(textoABuscar)){
                System.out.println(nota.name);
            } else {
                System.out.println("no extise la nota");
            }
        }




        boolean seguir = true;
        while(seguir){
            System.out.println("Dale al Enter para seguir");
            String enter = Main.scanner.nextLine();
            if(enter.equals("")){
                seguir = false;
            }
        }

    }
}
