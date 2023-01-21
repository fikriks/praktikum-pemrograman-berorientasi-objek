/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul8.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class DemoTumbuhan {
    public void tumbuhan(String jenis, String warna){
        JenisTumbuhan jenisTumbuhan = new JenisTumbuhan();
        jenisTumbuhan.jenis(jenis);
        jenisTumbuhan.warna(warna);
    }
    
    public static void main(String[] args){
        DemoTumbuhan demoTumbuhan = new DemoTumbuhan();
        
        demoTumbuhan.tumbuhan("Anggrek", "Putih");
        demoTumbuhan.tumbuhan("Kaktus", "Hijau");
        demoTumbuhan.tumbuhan("Mawar", "Merah");
    }
}
