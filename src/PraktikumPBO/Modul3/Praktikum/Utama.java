/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.Praktikum;

import java.io.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Utama {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Instat class
        Mobil mb = new Mobil();
        
        // Input
        System.out.print("Masukkan Merk Mobil = ");
        String merk_mobil = br.readLine();
        
        System.out.print("Masukkan Type Mobil = ");
        String type_mobil = br.readLine();
        
        System.out.print("Masukkan Warna Mobil = ");
        String warna_mobil = br.readLine();
        
        System.out.print("Masukkan Harga Mobil = ");
        double harga_mobil = Integer.parseInt(br.readLine());
        
        mb.setMerk(merk_mobil);
        mb.setType(type_mobil);
        mb.setWarna(warna_mobil);
        mb.setHarga(harga_mobil);
        
        // Output 
        System.out.println("Daftar Harga, Merk, Type dan Harga Mobil");
        System.out.println("Merk Mobil = "+ mb.getMerk());
        System.out.println("Type Mobil = "+ mb.getType());
        System.out.println("Warna Mobil = "+ mb.getWarna());
        System.out.println("Harga Mobil Sebelum Di Diskon = "+ mb.getHarga());
        mb.Keterangan();
    }
}
