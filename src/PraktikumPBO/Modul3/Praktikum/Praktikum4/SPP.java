/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.Praktikum.Praktikum4;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class SPP {
    String nama, nim;
    int spt, spv, sks;
    
    // Constructor dengan parameter
    public SPP(String nama, String nim, int spt, int spv, int sks)
    {
        this.nama = nama;
        this.nim = nim;
        this.spv = spv;
        this.sks = sks;
    }
    
    // Method hitung dengan tipe int
    public int hitung()
    {
        // Method non-void harus ada nilai kembalian/return value
        return (spt+(spv*sks));
    }
}
