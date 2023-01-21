/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul7.Praktikum;

/**
 *
 * @author Fikri Khairul Shaleh
 */
abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
    
    void tampilLuas(double l){
        System.out.println("Luasnya Sebesar "+l);
    }
    
    static void staticMethod(){
        System.out.println("Static Method dapat dipanggil");
    }
}
