/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class TernaryOperator {
    public static void main(String[] args) {
        
        //Ternary operator digunakan jika ada kondisi if dan else digunakan (agar lebih mudah ditulis)
        var nilai = 70;
        String ucapan = nilai >=75 ? "Selamat anda lulus": "Maaf anda harus mengulang";
        
        System.out.println(ucapan);
    }
}
