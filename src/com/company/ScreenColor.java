package com.company;

public class ScreenColor {
    void mostrar() {
        Tittle tittle = new Tittle();
        tittle.mostrar("CAMBIO DE COLOR");


        Menu menu = new Menu();

        String[] colores = {"Rojo ", "Azul", "Verde", "Amarillo", "Rosa ", "Salir"};
        String color = menu.elegirOpcion(colores);


        if ("1".equals(color)) {


        } else if ("2".equals(color)) {


        } else if ("3".equals(color)) {


        } else if ("4".equals(color)) {


        } else if ("5".equals(color)) {


        } else if ("6".equals(color)) {

        }

    }



    void pedir(String prompt) {
        System.out.println("\033[31m" + prompt + ":\033[0m");

    }


}
