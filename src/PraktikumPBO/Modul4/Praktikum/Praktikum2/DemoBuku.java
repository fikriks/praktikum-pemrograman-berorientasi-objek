/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul4.Praktikum.Praktikum2;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class DemoBuku {
    public static void main(String args[]){
        Buku a = new Buku("Pintar Java", "Magezine Sukses");
        Buku b = new Buku();
        
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
