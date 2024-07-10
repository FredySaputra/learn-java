/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class switchStatement {
    public static void main(String[] args) {
        var nilai = 'A';
        
        switch(nilai){
            case 'A':
                System.out.println("Wow, nilai anda sangat bagus");
                break;
            case 'B':
            case 'C':
                System.out.println("Nilai anda cukup");
                break;
            case'D':
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
                break;
                
    
        }
        
        //Jika menggunakan jdk 14 keatas, bisa langsung seperti ini (switch lambda)
        //Agar tidak repot menulis break berulang-ulang
        switch (nilai){
            case 'A' -> {System.out.println("Wow, nilai anda sangat bagus");}
            case 'B','C' -> System.out.println("Nilai anda cukup");
            case 'D' -> System.out.println("Anda tidak lulus");
            default -> {System.out.println("Anda salah jurusan");}
        }
        
        
        //di java 14 keatas juga bisa menggunakan yield expression seperti dibawah
        String ucapan  = switch(nilai){
            case 'A':
                yield "Wow, nilai anda sangat bagus";
            case 'B','C':
                yield "Nilai anda cukup";
            case 'D':
                yield "Anda tidak lulus";
            default:
                yield "Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
