/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul2.TugasMandiri;

import javax.swing.JOptionPane;

public class VolumeBalok {
     // Deklarasi method utama
    public static void main(String[] args)
    {
        double volume;
        // Instan objek dari class balok
        Balok bl = new Balok();
        
        bl.panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang Balok"));
        bl.lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar Balok"));
        bl.tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi Balok"));
        
        // Hitung
        volume = bl.panjang * bl.lebar * bl.tinggi;
        System.out.println("Volume Balok = "+ volume +" cm3");
    }
}
