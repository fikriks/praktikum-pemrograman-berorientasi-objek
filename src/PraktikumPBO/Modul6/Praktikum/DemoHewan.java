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
public class DemoHewan {
    public static void main(String args[]){
        Lebah HewanLebah = new Lebah();
        Paus HewanPaus = new Paus();
        Singa HewanSinga = new Singa();
        Elang HewanElang = new Elang();
        Hewan h;
        
        System.out.println("Lebah");
        h = HewanLebah;
        h.suara();
        h.berjalan();
        
        System.out.println("Singa");
        h = HewanSinga;
        h.suara();
        h.berjalan();
        
        System.out.println("Elang");
        h = HewanElang;
        h.suara();
        h.berjalan();
        
        System.out.println("Paus");
        h = HewanPaus;
        h.suara();
        h.berjalan();
    }
}
