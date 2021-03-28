package com.company;

public class ScreenLanguage {

   static int idioma = 0;
    String[][] opciones = {{"Crear ", "Listar", "Borrar", "Color", "Idioma", "Salir"},{"Создайте", "Список", "Удалить", "Цвет", "Идиома", "Покинуть"},{"Create ", "List", "Delete", "Color", "Idiom", "Leave"},{"Créer", "Liste", "Supprimer", "Couleur", "Langue", "Quitter"},{"Δημιουργία", "Λίστα", "Διαγραφή", "Χρώμα", "Γλώσσα", "Έξοδος"}};
    String[] titlelan = {"AGENDA DE CONTACTOS", "КОНТАКТНАЯ ПОВЕСТКА ДНЯ", "CONTACT BOOK","CONTACTER AGENDA","ΗΜΕΡΟΜΗΝΙΑ ΕΠΙΚΟΙΝΩΝΙΑΣ"};
    void mostrar() {
        Tittle tittle = new Tittle();
        tittle.mostrar("CAMBIO DE IDIOMA");




        Menu menu = new Menu();

        String[] lenguajes = {"Español", "Ruso", "Ingles ", "Frances", "Griego ", "Salir"};
        String lenguaje = menu.elegirOpcion(lenguajes);


        if ("1".equals(lenguaje)) {
            idioma=Integer.valueOf(lenguaje)-1;
            System.out.println("Usted a selecionado el lenguaje: " + lenguajes[Integer.valueOf(lenguaje)-1]);
        } else if ("2".equals(lenguaje)) {
            idioma=Integer.valueOf(lenguaje)-1;
            System.out.println("Вы выбрали язык: " + lenguajes[Integer.valueOf(lenguaje)-1]);

        } else if ("3".equals(lenguaje)) {
            idioma=Integer.valueOf(lenguaje)-1;
            System.out.println("You have selected the language: " + lenguajes[Integer.valueOf(lenguaje)-1]);

        } else if ("4".equals(lenguaje)) {
            idioma=Integer.valueOf(lenguaje)-1;
            System.out.println("Vous avez sélectionné la langue: " + lenguajes[Integer.valueOf(lenguaje)-1]);

        } else if ("5".equals(lenguaje)) {
            idioma=Integer.valueOf(lenguaje)-1;
            System.out.println("Έχετε επιλέξει τη γλώσσα: " + lenguajes[Integer.valueOf(lenguaje)-1]);

        } else if ("6".equals(lenguaje)) {

        }


    }
}
