
package com.tiernoparla.cosasjava;

public class cosas3 {
    public static void main (String[] args){
        // Ejercicio multiplos de 3 y 5 CON METODOS
        
        // coger nums hasta cierto numero
        final int COTA = 1000;
        final int TRES = 3;
        final int CINCO = 5;
        
        int suma = sumarMultiplos(COTA, TRES, CINCO);
        
        System.out.println(suma);   
    }// main

    public static int sumarMultiplos(final int COTA, final int NUM1, 
                                    final int NUM2) {
        // sumarlos
        int suma = 0;
        
        for (int i = 0; i < COTA; i++) {
            if(esMultiploDe(i, NUM1) || esMultiploDe(i, NUM2)){
                suma += i;
            }//if
        }//for
        return suma;
    }//sumarMultiplos

    public static boolean esMultiploDe(int num, final int NUMERO) {
        // coger multiplos de 3 o 5
        return num % NUMERO == 0; //if
        //else
        
    }//esMultiploDe
}// cosas 3
