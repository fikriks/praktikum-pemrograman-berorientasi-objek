/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul4.Praktikum.Praktikum4;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Teman {
    public String nama;
    public int pacar = 0, mantan = 0;
    
    public Teman(String nama){
        // Konstruktor 1
        this.nama = nama;
    }
    
    public Teman(String nama, int pacar){
        // Konsturktor 2
        this.nama = nama;
        this.pacar = pacar;
    }
    
    public Teman(String nama, int pacar, int mantan){
        // Konstruktor 3
        this.nama = nama;
        this.pacar = pacar;
        this.mantan = mantan;
    }
    
    public void cetak(){
        System.out.println("Nama\t : "+ nama);
        System.out.println("Pacar\t : "+ pacar);
        System.out.println("Mantan\t :"+ mantan);
    }
}
