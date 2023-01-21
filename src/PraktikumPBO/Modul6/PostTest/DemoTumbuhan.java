/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul6.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class DemoTumbuhan {
    public static void main(String args[]){        
        Anggrek anggrek = new Anggrek("Anggrek", "Putih");
        anggrek.garis();
        
        Mawar mawar = new Mawar("Mawar", "Merah");
        mawar.garis();
        
        Kaktus kaktus = new Kaktus("Kaktus", "Hijau");
        kaktus.garis();
    }
}
