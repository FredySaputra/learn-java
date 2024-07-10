/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class Variable {
    public static void main(String[] args) {
        
        String name;
        name = "Fredy Dwi Saputra";
        System.out.println(name);
        
        
        int umur = 20;
        String country = "Indonesia";
        System.out.println(umur);
        System.out.println(country);
        
        
        name = "Saputra Dwi Fredy";
        System.out.println(name);
        
        
        //var harus langsung diikuti value setelah menuliskan variable, jika tidak maka error
        var awal = "Fredy";
        var tengah = "Dwi";
        var akhir="Saputra";
        
        System.out.println(awal);
        System.out.println(tengah);
        System.out.println(akhir);
        
        
        System.out.println();
        
        //syntax final : untuk menetapkan bahwa suatu variable tidak dapat diubah nilainya
        
        final var namaPemilik = "Fredy";
        
        System.out.println(namaPemilik);
    }
}
