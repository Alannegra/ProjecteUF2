package com.company;

public class Tittle {

    void mostrar(String tittle){


        String marco = "+";

        String marco2 = "|  ";

        for (int i = 0; i < tittle.length()+4 ; i++) {
            marco+="-";

            //if(i < tittle.length()){
              //  marco2+= tittle.charAt(i);
           // }

        }

        marco2+= tittle;
        marco+="+";
        marco2+="  |";


        System.out.println(marco);
        System.out.println(marco2);
        System.out.println(marco);
        System.out.println();

    }

}
