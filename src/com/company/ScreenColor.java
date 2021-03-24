package com.company;

public class ScreenColor {
    void mostrar() {
        Tittle tittle = new Tittle();
        tittle.mostrar("CAMBIO DE COLOR");


        Menu menu = new Menu();

        String[] colores = {"Rojo ", "Azul", "Verde", "Amarillo", "Rosa ", "Salir"};
        String color = menu.elegirOpcion(colores);


        if ("1".equals(color)) {
            System.out.println(ANSI_RESET);
            System.out.println(ANSI_RED);
            System.out.println("Usted a selecionado el color: " + colores[Integer.valueOf(color)-1]);
        } else if ("2".equals(color)) {
            System.out.println(ANSI_RESET);
            System.out.println(ANSI_BLUE);
            System.out.println("Usted a selecionado el color: " + colores[1]);

        } else if ("3".equals(color)) {
            System.out.println(ANSI_RESET);
            System.out.println(ANSI_RED);
            System.out.println("Usted a selecionado el color: " + colores[0]);

        } else if ("4".equals(color)) {
            System.out.println(ANSI_RESET);
            System.out.println(ANSI_RED);
            System.out.println("Usted a selecionado el color: " + colores[0]);

        } else if ("5".equals(color)) {
            System.out.println(ANSI_RESET);
            System.out.println(ANSI_RED);
            System.out.println("Usted a selecionado el color: " + colores[0]);

        } else if ("6".equals(color)) {

        }

    }

    public static final String ANSI_RESET = "\u001B[0m";
    //Colores de letra
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //Colores de fondo
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";



    String pedir(String prompt) {

        System.out.println("\033[31m" + prompt + ":\033[0m");

    return prompt;
    }




}
