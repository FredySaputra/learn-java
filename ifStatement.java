/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class ifStatement {
    public static void main(String[] args) {
        int absen = 70;
        int nilai = 90;
        
        if(absen>=75 && nilai>=75){
            System.out.println("Selamat anda lulus!");
        }else if(absen<75 && nilai>75){
            System.out.println("Silahkan benarkan absen anda ke dosen");
        }else if(absen>75 && nilai<75){
            System.out.println("Silahkan lakukan tinjauan nilai jika ingin lulus");
        }
        else{
            System.out.println("Mohon maaf anda harus mengulang");
        }
    }
}
