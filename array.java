/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava;

/**
 *
 * @author Fred
 */
public class array {
    public static void main(String[] args) {
        
        //Berikut cara menulis array
        String[] arrayString;
        arrayString = new String[3];
        
        arrayString[0]= "Fredy";
        arrayString[1]= "Dwi";
        arrayString[2]= "Saputra";
        
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        
        arrayString[2] = "Budiman";
        
        System.out.println(arrayString[2]);
        
        //array juga bisa dibuat dengan seperti ini
        System.out.println();
        String[] namaku = {
            "fredy","dwi","saputra"
        };
        
        System.out.println(namaku[0]);
        System.out.println(namaku[1]);
        System.out.println(namaku[2]);
        
        int[] nomor= {
        1,2,3,4,5
        };
        
        
        System.out.println(nomor[0]);
        
        //bisa juga seperti ini
        long[] iniLong = new long[]{
        10000L,200000L,21113131
        };
        
        System.out.println(iniLong[1]);
        System.out.println(iniLong.length);
        
        //array didalam array
        String[][] dalamArray = {
            {"Fredy", "Dwi", "Saputra"},{"kuking","kukangkang"}
        };     
        
        System.out.println(dalamArray[0][1]);
        System.out.println(dalamArray[1][0]);
    }
        
    }

