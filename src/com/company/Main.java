package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static AgendaDeContactos agendaDeContactos = new AgendaDeContactos();

    public static void main(String[] args) {

        ScreenMenu screenMenu = new ScreenMenu();
        while(screenMenu.mostrar()) {}


    }
}
