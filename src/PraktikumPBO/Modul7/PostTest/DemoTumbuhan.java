/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul7.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class DemoTumbuhan {
    public void tumbuhan(Tumbuhan tumbuhan, String jenis, String warna){
        tumbuhan.jenis(jenis);
        tumbuhan.warna(warna);
    }
    
    public static void main(String[] args){
        DemoTumbuhan demoTumbuhan = new DemoTumbuhan();
        JenisTumbuhan jenisTumbuhan = new JenisTumbuhan();
        
        demoTumbuhan.tumbuhan(jenisTumbuhan, "Anggrek", "Putih");
        demoTumbuhan.tumbuhan(jenisTumbuhan, "Kaktus", "Hijau");
        demoTumbuhan.tumbuhan(jenisTumbuhan, "Mawar", "Merah");
    }
}
