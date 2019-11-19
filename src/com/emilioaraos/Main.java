package com.emilioaraos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Emilio");
        items.add(5);
        printDoubled(items);

        String [] canciones = new String[9];
        canciones[0]= " "+ 22;
        canciones[1]= " "+ 11;
        canciones[2]= " "+ 4;
        canciones[3]= " "+ 6;
        canciones[4]= " "+ 7;
        canciones[5]= " "+ 8;
        canciones[6]= " "+ 9;
        canciones[7] = " "+ 9;
        canciones[8] = " "+ 3;


        for(int i = 0; i<canciones.length;i++){
            System.out.println(canciones[i]  + canciones[i]);
        }

        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Mercedez");
        carros.add("BMW");
        carros.add("Renault");
        carros.add("FORD");
        carros.add("Chevy");

        for(int i = 0; i< carros.size(); i++){
            System.out.println(carros.get(i));
        }
    }
    private static void printDoubled(ArrayList<Integer> n){
        for(int i : n){
            System.out.println( i* 2 );
        }
    }
}
