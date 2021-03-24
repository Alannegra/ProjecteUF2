package com.company;

public class Menu {

    String elegirOpcion(String[] opciones){

        boolean seguirPidiendo = true;
        String opcion = "";
        while(seguirPidiendo) {

            for (int i = 0; i < opciones.length; i++) {
                System.out.print((i + 1) + ". " + opciones[i] + "  ");
                if(i % 2 != 0 ){
                    System.out.println();
                }

            }

            String ask = "\nOpcion:";
            System.out.println(ask);

            opcion = Main.scanner.nextLine();

            if (Integer.valueOf(opcion) > opciones.length) {
                Message mensaje = new Message();
                mensaje.mostrarError("No existe la opcion");
            } else {
                seguirPidiendo = false;
            }
        }

        return opcion;
    }
}
