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
        
        
        
            
        
    } //main
} //cosasJava