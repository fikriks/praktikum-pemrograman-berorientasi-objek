/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul6.Praktikum;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class ProgramPolimorphism {
    /** Main Method */
    public static void main(String args[]){
        System.out.println("\n Program Polimorphism");
        System.out.println("=======================");
        
        // Membuat objek-objek raut(ekspresi) dari wajah
        BentukWajah bentukWajah = new BentukWajah();
        Senyum senyum = new Senyum();
        Tertawa tertawa = new Tertawa();
        Marah marah = new Marah();
        Sedih sedih = new Sedih();
        
        // Polimorphism dari bentuk wajah ada 5 dimulai dari 0-4
        BentukWajah[] Bentuk = new BentukWajah[5];
        Bentuk[0] = bentukWajah;
        Bentuk[1] = senyum;
        Bentuk[2] = tertawa;
        Bentuk[3] = marah;
        Bentuk[4] = sedih;
        
        System.out.println("Bentuk[0]:"+ Bentuk[0].respons());
        System.out.println("Bentuk[1]:"+ Bentuk[1].respons());
        System.out.println("Bentuk[2]:"+ Bentuk[2].respons());
        System.out.println("Bentuk[3]:"+ Bentuk[3].respons());
        System.out.println("Bentuk[4]:"+ Bentuk[4].respons());
    }
}
