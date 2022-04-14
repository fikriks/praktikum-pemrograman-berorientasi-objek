/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul2.Praktikum.Praktikum2;

import javax.swing.JOptionPane;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Praktikum2 {
    public static void main(String[] args)
    {
        String nama, kota;
        
        nama = JOptionPane.showInputDialog("Nama Anda :");
        kota = JOptionPane.showInputDialog("Kota Asal :");
        
        System.out.println("Selamat Datang "+ nama +" dari "+ kota);
    }
}
