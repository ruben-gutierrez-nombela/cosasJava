
package com.tiernoparla.cosasjava;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Simulacro {
    public static void main (String[] args){
    
    int N = 10;
    int[] size = new int[N];
    int x = 0;
    int tmp = 0;
    
    String[] f = {"U","O"};
     
    for (int i = 0; i < size.length; i++) {
        size[x] = (int)(Math.random()*10);
        size[(int)(Math.random()*10)] = size[tmp];
        System.out.println("size x es: " + size[x]);
        System.out.println("size tmp es: " + size[tmp]);
        size[tmp] = size[x];
        System.out.println("size "+ size[tmp] + " es la posicion "+ size[tmp]);
        
        
        
        
        
        
    }// for
        
        
        
        
    }// main
}// Simulacro