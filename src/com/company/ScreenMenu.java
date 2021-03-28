package com.company;

public class ScreenMenu {

    boolean mostrar() {
        ScreenLanguage screenLanguage = new ScreenLanguage();

        Tittle tittle = new Tittle();
        tittle.mostrar(screenLanguage.titlelan[screenLanguage.idioma]);

        Menu menu = new Menu();



        String opcion = menu.elegirOpcion(screenLanguage.opciones[screenLanguage.idioma]);

        if ("1".equals(opcion)) {
            CreateScreen createScreen = new CreateScreen();
            createScreen.mostrar();
        } else if ("2".equals(opcion)) {
            ScreenList screenList = new ScreenList();
            screenList.mostrar();
        } else if ("3".equals(opcion)) {
            ScreenDelete screenDelete = new ScreenDelete();
            screenDelete.mostrar();
        } else if ("4".equals(opcion)) {
            ScreenColor screenColor = new ScreenColor();
            screenColor.mostrar();
        } else if ("5".equals(opcion)) {
            screenLanguage.mostrar();
        }else if ("6".equals(opcion)) {
            return false;
        }
        return true;
    }
}
