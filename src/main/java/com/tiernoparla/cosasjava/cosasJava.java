package com.tiernoparla.cosasJava;

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
        
        int N = 33;
        int D = 5;
        int R = N;
        int Q = 0;
        while (R >= D){
            R = R - D;
            Q++;      
        }
        System.out.println("El resto es:");
        System.out.println(R);
        System.out.println("La Q da: " + Q);
        System.out.println(Q);
        
            
        
    } //main
} //cosasJava