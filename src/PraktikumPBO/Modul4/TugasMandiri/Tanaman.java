/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul4.TugasMandiri;

/**
 *
 * @author Fikri Khairul Shaleh
 */
class Tanaman {
    String nama;
    String warna;

    public Tanaman(String nama){
        this.nama = nama;
    }
    
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
        Tanaman tanaman1, tanaman2;
        
        tanaman1 = new Tanaman("Anggrek");
        tanaman2 = new Tanaman("Anggrek", "Ungu");
        
        tanaman1.cetak();
        tanaman2.cetak();
    }
}
