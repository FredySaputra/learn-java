/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 400;
        int b = 200;
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        
        //augmented assignment : menambah dengan dirinya sendiri (lebih singkat)
        int c = 100;
        
        c += 10;
        System.out.println(c);
        
        c -= 10;
        System.out.println(c);
        
        c *= 10;
        System.out.println(c);
        
        
        //unary operator (menambah / mengurang 1)
        
        int d = 200;
        
        d++;
        System.out.println(d);
        
        d--;
        System.out.println(d);
        
        //kebalikannya
        System.out.println(!true);
        
    }
    
}
