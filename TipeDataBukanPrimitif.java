/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        //Tipe data bukan primitif adalah tipe data yang tidak memiliki default value/ null
        //Dibuatnya tipe data bukan primitif adalah agar bisa dijadikan objek
        
        //byte menjadi Byte
        Byte iniByte;
        iniByte = 120;
        
        
        //int menjadi Integer
        Integer age;
        age = 20;
        
        //char menjadi Character
        Character cth;
        cth = 'A';
        System.out.println(cth);
        
        System.out.println(age);
        
        String Nama;
        Nama = "mas ganteng";
        
        System.out.println(Nama);
        System.out.println(iniByte);
        
        //konversi dari bukan primitif menjadi primitif
        
        //Integer ke int
        Integer konversi;
        konversi = 900;
        int convert = konversi.intValue();
        System.out.println(convert);
        
        
    }
   
}
