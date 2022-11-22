
package com.tiernoparla.cosasjava;
import java.lang.Math;

public class cosas2 {
    public static void main (String[] args){
        
        
        int N = 1435;
        int tam = 4;
        int tmp = N;
        // int cifra;
        int[] cifras = new int[tam];
        /*
        for (int i = 0; i < tam; i++) {
            cifras[i] = tmp % 10;
            System.out.println(cifras[i]);
            tmp = tmp/10;
        }
        
        System.out.println(cifras[0]*Math.pow(10,tam-1));
        System.out.println(cifras[0]*Math.pow(10,tam-2));
        System.out.println(cifras[0]*Math.pow(10,tam-3));
        System.out.println(cifras[0]*Math.pow(10,tam-4));
        */
        /*
        for (int i = 0; i < tam; i++) {
            System.out.println(cifras[i]*Math.pow(10,tam-(i+1)));
        }
        
        double x = cifras[0]*Math.pow(10,tam-1) + cifras[1]*Math.pow(10,tam-2) + cifras[2]*Math.pow(10,tam-3) + cifras[3]*Math.pow(10,tam-4);
        System.out.println(x);
        */
        System.out.println(N%10); // primera cifra
        System.out.println((N/10)%10); // segunda cifra
        System.out.println(((N/10)/10)%10); // tercera cifra
        System.out.println((((N/10)/10)/10)%10); // cuarta cifra
        
        
        
        
        
        
    }// main
}// cosas2
