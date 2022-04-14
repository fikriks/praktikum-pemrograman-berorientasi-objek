/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.Praktikum.Praktikum4;

import java.io.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class BayarSPP {
    public static void main(String[] args) throws IOException
    {
        // Deklarasikan Variabel
        String nama, nim;
        int spt, spv, sks;
        
        // Proses instansiasi objek dengan inputan manual
        SPP bayar = new SPP("Irfan", "12.12.1234", 950000, 7000, 24);
        
        // Dengan inputan
        // Langkah 1 : Menginisiasi BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Langka 2 : Proses Input
        System.out.print("Nama \t\t: ");
        nama = br.readLine();
        
        System.out.print("NIM \t\t: ");
        nim = br.readLine();
        
        System.out.print("SPP Tetap \t: ");
        spt = Integer.parseInt(br.readLine());
        
        System.out.print("SPP Variabel \t: ");
        spv = Integer.parseInt(br.readLine());
        
        System.out.print("SKS \t\t: ");
        sks = Integer.parseInt(br.readLine());
        
        // Proses instansiasi objek dengan inputan
        SPP bayar2 = new SPP(nama, nim, spt, spv, sks);
        
        // Output perhitungan dengan inputan manual
        System.out.println("\n\n\n--------------- PROGRAM PERHITUNGAN SPP MANUAL ---------------\n");
        System.out.println("Nama \t\t: "+ bayar.nama);
        System.out.println("NIM \t\t: "+ bayar.nim);
        System.out.println("SPP Tetap \t: "+ bayar.spt);
        System.out.println("SPP Variabel \t: "+ bayar.spv);
        System.out.println("SKS \t\t: "+ bayar.sks);
        System.out.println("Total SPP yang harus dibayarkan : Rp "+ bayar.hitung() +",-\n");
        System.out.println("------------------------- TERIMA KASIH -------------------------\n\n");
        
        // Output perhitungan dengan inputan
        System.out.println("\n\n\n--------------- PROGRAM PERHITUNGAN SPP OTOMATIS ---------------\n");
        System.out.println("Nama \t\t: "+ bayar2.nama);
        System.out.println("NIM \t\t: "+ bayar2.nim);
        System.out.println("SPP Tetap \t: "+ bayar2.spt);
        System.out.println("SPP Variabel \t: "+ bayar2.spv);
        System.out.println("SKS \t\t: "+ bayar2.sks);
        System.out.println("Total SPP yang harus dibayarkan : Rp "+ bayar2.hitung() +",-\n");
        System.out.println("------------------------- TERIMA KASIH -------------------------\n");
    }
}
