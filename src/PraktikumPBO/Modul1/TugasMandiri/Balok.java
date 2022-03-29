/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul1.TugasMandiri;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Balok {
    int luas, keliling, volume;
    
    public int luas(int panjang, int lebar, int tinggi){
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luas;
    }
    
     public int keliling(int panjang, int lebar, int tinggi){
        keliling = 4 * (panjang + lebar + tinggi);
        return keliling;
    }
     
     public int volume(int panjang, int lebar, int tinggi){
        volume = panjang * lebar * tinggi;
        return volume;
    }
}
