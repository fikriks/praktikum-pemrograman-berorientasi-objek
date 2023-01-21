/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul9.PostTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Mhs {
    private static String nim, nama, jk, prodi;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan NIM Anda : ");
        nim = bufferedReader.readLine();
        
        System.out.print("Masukkan Nama Anda : ");
        nama = bufferedReader.readLine();
        
        System.out.print("Masukkan Jenis Kelamin Anda : ");
        jk = bufferedReader.readLine();
        
        System.out.print("Masukkan Program Studi Anda : ");
        prodi = bufferedReader.readLine();
        
        Mahasiswa mhs = new Mahasiswa(nim, nama, jk, prodi);
        mhs.tampilMahasiswa();
    }
}
