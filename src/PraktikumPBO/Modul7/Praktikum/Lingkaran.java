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
class Lingkaran extends BangunDatar {
    double jari;
    
    Lingkaran(double jari){
        this.jari = jari;
    }
    
    double luas(){
        return Math.PI * jari * jari;
    }
    
    double keliling(){
        return Math.PI * 2.0 * jari;
    }
}
