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
class Mobil {
    // Deklarasi
    private String merk, type, warna;
    private double harga;
    
    // Setter
    public void setMerk(String merk){ this.merk = merk; }
    public void setType(String type){ this.type = type; }
    public void setWarna(String warna){ this.warna = warna; }
    public void setHarga(double harga){ this.harga = harga; }
    
    // Getter
    public String getMerk(){ return merk; }
    public String getType(){ return type; }
    public String getWarna(){ return warna; }
    public double getHarga(){ return harga; }
    
    // Method tambahan (Cashback)
    public double CashBack()
    {
        double cashback = 0.1 * getHarga();
        double total = getHarga() - cashback;
        
        return total;
    }
    
    public void Keterangan()
    {
        System.out.println("Harga Mobil setelah dikurangi Cashback = "+ CashBack());
    }
}
