/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul2.PostTest;

import java.io.*;

public class VolumeBalok {
     // Deklarasi method utama
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double volume;
        // Instan objek dari class balok
        Balok bl = new Balok();
        
        System.out.print("Masukkan Panjang Balok = ");
        bl.panjang = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Lebar Balok = ");
        bl.lebar = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Tinggi Balok = ");
        bl.tinggi = Integer.parseInt(br.readLine());
        
        // Hitung
        volume = bl.panjang * bl.lebar * bl.tinggi;
        System.out.println("Volume Balok = "+ volume +" cm3");
    }
}
