package com.tiernoparla.cosasJava;

import java.util.Scanner;
        
public class cosasJava {

    public static void main(String[] args) {
        /*
        // printear nums pares del 1 al 10
        for (int i = 0; i < 12; i = i + 2) {
            System.out.println(i);
        } //for
        */
        
        /*
        int a = 33+1;
        int b = 2;
        System.out.println(a%b);
        */
        
        /*
        if (false){
            System.out.println("era true");
        } //if
        */
        
        /*
        for (int i = 1; i < 11; i++){
            if(i%2 == 0){
                System.out.println(i);
            } //if
        } //for
        */
        
        /*
        int n = 1;
        while(n < 11){
            if(n%2 == 0){
                System.out.println(n);
            } //if
            n++;
        } //while
        */
        
        /*
        int N = 33;
        int D = 5;
        int R = N;
        int Q = 0;
        
        while (R >= D){
            R = R - D;
            Q++;      
        }
        System.out.println("El resto es: " + R);
        System.out.println("La Q da: " + Q);
        System.out.println("N es igual a D*Q+R");
        System.out.println(N + " es igual a " + (D*Q+R));
        System.out.println(N == D*Q+R);
        */
        
        /*
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Dame un número entero: ");
        N = sc.nextInt();
        System.out.println("El número que me has dado es: " + N);
        
        int C;
        int D;
        
        System.out.println("Dame N: ");
        N = sc.nextInt();
        
        System.out.println("Dame D: ");
        D = sc.nextInt();
        */
        
        /*
        // termino N de la sucesión de Fibonacci
        // arrays
        // recursividad
        
        int N = 10;
        int x1 = 1;
        int x2 = 1;
        int Fib = 0;
        for (int i = 3; i <= N; i++) {
            System.out.println(Fib);
            Fib = x2 + x1;
            x1 = x2;
            x2 = Fib;
        } // for
        System.out.println(Fib);
        */
        /*
        int x3 = x2 + x1;
        int x4 = x3 + x2;
        int x5 = x4 + x3;
        
        System.out.println(x5);
         */       
        
        String[] palabras = {"hola", "adios"};
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        
        palabras[0] = "algo aqui";
        
        System.out.println(palabras[0]);
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        
        String[] palabras2 = new String[23];
        System.out.println(palabras2[0]);
    } //main
} //cosasJava