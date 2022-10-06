package com.tiernoparla.cosasJava;

import java.util.Scanner;
import java.lang.Math;
        
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
        
        /*
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
        */
        
        /*
        int[] Fib = {1, 1, 0};
        int N = 7;
        
        for (int i = 0; i <= N; i++) {
            Fib[2] = Fib[1] + Fib[0];
            Fib[0] = Fib[1];
            Fib[1] = Fib[2];
            System.out.println(Fib[2]);
        }
        */
        
        /*
        // Tengo N
        int N = 5;
        // Defino un array de tamaño N
        int[] fib = new int[N];
        // Guardo los 2 primeros terminos
        fib[0] = 1;
        fib[1] = 1;
        // Loop para calcular y guardar los siguientes hasta N
        for (int i = 2; i < N; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        for (int i = 0; i < fib.length; i++) {
            System.out.println(fib[i]);
        }
        */
        
        /*
        // Sacar las 4 cifras de un num de 4 cifras
        int N = 1435;
        int tam = 4;
        int tmp = N;
        // int cifra;
        int[] cifras = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            cifras[i] = tmp % 10;
            System.out.println(cifras[i]);
            tmp = tmp/10;
        }
        
        // Recuperar el número
        
       // System.out.println(cifras[0]*Math.pow(10,tam-1));
       // System.out.println(cifras[0]*Math.pow(10,tam-2));
       // System.out.println(cifras[0]*Math.pow(10,tam-3));
       // System.out.println(cifras[0]*Math.pow(10,tam-4));
        
        for (int i = 0; i < tam; i++) {
            System.out.println(cifras[i]*Math.pow(10,tam-(i+1)));
        }
        double x = cifras[0]*Math.pow(10,tam-1) + cifras[0]*Math.pow(10,tam-2) + cifras[0]*Math.pow(10,tam-3) + cifras[0]*Math.pow(10,tam-4);
        System.out.println(x);
        /*
        System.out.println(N%10); // primera cifra
        System.out.println((N/10)%10); // segunda cifra
        System.out.println(((N/10)/10)%10); // tercera cifra
        System.out.println((((N/10)/10)/10)%10); // cuarta cifra
        */
        
        /*
        int N = 123456;
        
        int tmp = N;
        int cifra;
        int reverso = 0;
        
        while(tmp > 0){
            cifra = tmp % 10;
            reverso = reverso*10 + cifra;
            System.out.println(tmp);
            tmp = tmp/10;
        } // while
        
        System.out.println(reverso);
        */
        
        
        // Dados N números, cuál es el menor/mayor de todos
        // CON 2 NÚMEROS
        /*
        double a = 5.43;
        double b = -43.2122;
        double min;
        
        if (a > b) {
            min = b;
        }
        else {
            min = a;
        } // if-else
        
        System.out.println("el minimo es: " + min);
        */
        // CON 5 NÚMEROS
        /*
        double a = 1;
        double b = -7.2;
        double c = 4.5;
        double d = -21;
        double e = 3.14;
        double f = 0;
        double min;
        
        if (a > b) {
            min = b;
        }
        else if (false) {
            min = a;
        }
        else if (a > c) {
            min = c;
        }
        else if (c > d) {
            min = d;
        }
        else if (d > e) {
            min = e;
        }
        else{
            min = f;
        }
        
        System.out.println("el minimo es: " + min);
        */
        /*
        // CON BUCLE FOR
        double[] num = {1, 7.2, -4.5, -21, 3.14, 0};
        double min = num[0];
        
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            } // if
            System.out.println(min);
        } // for
        
        System.out.println("el mínimo es: " + min);
        */
        
        /*
        // Calcular la media
        //CON FOR
        float[] num = {1, 2, 3, 4};
        float m = 0;
        
        for (int i = 0; i < num.length; i++) {
            m = m + num[i];
        } // for
        System.out.println("La media es: " + (m/num.length));
        
        // CON WHILE Y hasNext
        */
        
        // STRING
        String a = "zaratrustra";
        
        System.out.println(a.charAt(a.length()/2));
        
        
        
        
        
        
        
        
        
        
    } //main
} //cosasJava