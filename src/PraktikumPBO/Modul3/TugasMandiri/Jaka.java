/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.TugasMandiri;

import javax.swing.JOptionPane;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Jaka {
    public static void main(String[] args)
   {
       String nama;
       
       nama = JOptionPane.showInputDialog("Masukkan Nama");
       Manusia manusia = new Manusia(nama);
       System.out.println("Nama = "+ manusia.tampilkanNama());
       manusia.makan();
       manusia.kerja();
   }
}
