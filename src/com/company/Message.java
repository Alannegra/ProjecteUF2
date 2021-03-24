package com.company;

public class Message {
    void mostrarError(String texto){
        printBefore();
        System.out.println(texto);
        printAfter();
    }

    void mostrarWarn(String texto){
        printBefore();
        System.out.println( texto );
        printAfter();
    }

    void mostrarInfo(String texto){
        printBefore();
        System.out.println( texto );
        printAfter();
    }

    void printBefore(){
        System.out.println();
    }

    static void printAfter(){
        System.out.println();
        System.out.println();
    }
}
