
package com.tiernoparla.cosasjava;

public class fibonacci2 {
    public static void main(String[] args) {
       
        // calcular terminos de Fib
        final int HASTA = 10;
        int X1 = 1;
        int X2 = 2;
        
        int fib_hasta = calcularFibHasta(HASTA, X2, X1);

        // que no pasen de 4M
        // sumar los pares


    }// main

    public static int calcularFibHasta(final int HASTA, int X2, int X1) {
        int tmp = 0;
        
        for (int i = 3; i <= HASTA; i++) {
            tmp = X2 + X1;
            X1 = X2;
            X2 = tmp;  
        }// for
        
        return tmp;
        
    }// calcularFibHasta
    
}//fibonacci2
