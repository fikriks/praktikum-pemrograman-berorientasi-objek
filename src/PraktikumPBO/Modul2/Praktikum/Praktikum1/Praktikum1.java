/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul2.Praktikum.Praktikum1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Praktikum1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama, kota;
        
        System.out.print("Nama Anda : ");
        nama = br.readLine();
        
        System.out.print("Kota Asal : ");
        kota = br.readLine();
        
        System.out.println("Selamat Datang "+ nama +" dari "+ kota);
    }
}
