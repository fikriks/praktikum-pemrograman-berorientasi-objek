/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul4.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
class Tanaman {
    String nama;
    String warna;

    public Tanaman(String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }

    void cetak(){
        System.out.println("Bunga "+ this.nama +" Berwarna "+ warna);
    }
}

class RunTanaman{
    public static void main(String args[]){
        Tanaman tanaman = new Tanaman("Anggrek", "Ungu");
        tanaman.cetak();
    }
}
