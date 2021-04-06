package com.company;

public class Tittle {

    void mostrar(String tittle){


        String marco1 = "┏";

        String marco2 = "┃  ";

        String marco3 = "┗";

        for (int i = 0; i < tittle.length()+4 ; i++) {
            marco1+="━";
            marco3+="━";

            //if(i < tittle.length()){
              //  marco2+= tittle.charAt(i);
           // }

        }

        marco2+= tittle;
        marco1+="┓";
        marco2+="  ┃";
        marco3+="┛";


        System.out.println(marco1);
        System.out.println(marco2);
        System.out.println(marco3);
        System.out.println();

    }

}
