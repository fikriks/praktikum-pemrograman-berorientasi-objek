/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul4.Praktikum.Praktikum2;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Buku {
    String pengarang, judul;
    
    Buku(){
        this.pengarang = pengarang;
        this.judul = judul;
    }
    
    Buku(String pengarang, String judul){
        this.pengarang = pengarang;
        this.judul = judul;
    }
    
    void cetakKeLayar(){
        if(judul == null && pengarang == null)
        return;
        System.out.println("Judul : "+ judul +", Pengarang : "+ pengarang);
    }
}
