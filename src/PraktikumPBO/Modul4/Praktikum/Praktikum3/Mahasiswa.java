/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul4.Praktikum.Praktikum3;

/**
 *
 * @author Fikri Khairul Shaleh
 */

// Konstruktor dan Overloading
class Mahasiswa {
    String nama;
    String jenkel;
    
    void setNilai(String nama){
        this.nama = nama;
    }
    
    void setNilai(String nama, String jenkel){
        this.nama = nama;
        this.jenkel = jenkel;
    }
    
    void cetak(){
        System.out.println(this.nama + " adalah " + this.jenkel);
    }
}

class DemoMahasiswa{
    public static void main(String args[]){
        Mahasiswa m1, m2;
        m1 = new Mahasiswa();
        m2 = new Mahasiswa();
        
        m1.setNilai("Anggi");
        m2.setNilai("Anggi", "Laki-Laki");
        m1.cetak();
        m2.cetak();
    }
}