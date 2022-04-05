/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul2.Praktikum;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class VolumeBalok {
    // Deklarasi method utama
    public static void main(String[] args)
    {
        double volume;
        // Instan objek dari class balok
        Balok bl = new Balok();
        bl.panjang = 7;
        bl.lebar = 4;
        bl.tinggi = 5;
        
        // Hitung
        volume = bl.panjang * bl.lebar * bl.tinggi;
        System.out.println("Volume Balok = "+ volume +" cm3");
    }
}
