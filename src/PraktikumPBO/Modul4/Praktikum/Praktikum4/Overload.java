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
public class Overload {
    public static void main(String args[]){
        // Memanggil Konstuktor 1
        Teman baru = new Teman("Wildan");
        System.out.println("Pada Konstruktor 1 : ");
        baru.cetak();
        
        // Memanggil Konstuktor 2
        Teman lama = new Teman("Syandu", 100);
        System.out.println("Pada Konstruktor 2 : ");
        lama.cetak();
        
        // Memanggil Konstuktor 3
        Teman cantik = new Teman("Tania", 100, 10);
        System.out.println("Pada Konstruktor 3 : ");
        cantik.cetak();
    }
}
