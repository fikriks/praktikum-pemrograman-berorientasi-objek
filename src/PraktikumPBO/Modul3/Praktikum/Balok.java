/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.Praktikum;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Balok {
    // Deklarasi Attribut
    double panjang, lebar, tinggi;
    
    // Deklarasi Setter
    public void setPanjang(double panjang){ this.panjang = panjang; }
    public void setLebar(double lebar){ this.lebar = lebar; }
    public void setTinggi(double tinggi){ this.tinggi = tinggi; }
    
    // Deklarasi Getter
    public double getPanjang(){ return panjang; }
    public double getLebar(){ return lebar; }
    public double getTinggi(){ return tinggi; }
    public double getVolume(){ return panjang * lebar * tinggi; }
    
    public static void main(String[] args)
    {
        double volume;
        Balok bl = new Balok();
        bl.panjang = 7;
        bl.lebar = 4;
        bl.tinggi = 5;
        volume = bl.panjang * bl.lebar * bl.tinggi;
        System.out.println("Volume Balok = "+ volume +"Cm3");
    }
}
