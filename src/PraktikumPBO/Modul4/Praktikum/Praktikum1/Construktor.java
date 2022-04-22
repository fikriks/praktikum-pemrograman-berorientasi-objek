/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul4.Praktikum.Praktikum1;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Construktor {
    String data, data2;
    
    public Construktor(String data, String data2){
        this.data = data;
        this.data2 = data2;
    }
    
    void cetakConst(){
        System.out.printf("%s %s", this.data, this.data2);
    }
    
    public static void main(String args[]){
        Construktor a = new Construktor("RIO", "FKOM");
        // Membuat objek Const, dan mengisi data dalam constructornya
        a.cetakConst();
        // Mencetak Const
    }
}
