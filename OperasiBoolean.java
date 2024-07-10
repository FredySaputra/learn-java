/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class OperasiBoolean {
    public static void main(String[] args) {
        
        var absen = 70;
        var nilaiAkhir = 80;
        
        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;
        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
        
    }
}
