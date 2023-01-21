/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul8.Praktikum.Praktikum2;

/**
 *
 * @author Fikri Khairul Shaleh
 */

// Class Main
public class MainPesan implements Pesan {
    /*
    Main Class
    Class main dapat mengimplementasikan method yang
    telah di deklarasikan di interface pesan 
    */
    
    // Method void main utama
    public static void main(String args[]){
        // Inisiasi Objek ps
        MainPesan ps = new MainPesan();
        
        // Tampil method pesan
        ps.tampilPesan1();
        ps.tampilPesan2();
        ps.tampilPesan3();
    }
    
    @Override
    public void tampilPesan1(){
        System.out.println("Tampilkan Pesan 1");
    }
    
    @Override
    public void tampilPesan2(){
        System.out.println("Tampilkan Pesan 2");
    }
    
    @Override
    public void tampilPesan3(){
        System.out.println("Tampilkan Pesan 3");
    }
}
