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
public class Hewan extends MakhlukHidup {
    private String Kaki1, Kaki2;
    
    public Hewan(String Kaki1, String Kaki2){
        this.Kaki1 = Kaki1;
        this.Kaki2 = Kaki2;
    }
    
    public void berdiri(){
        System.out.println("Hewan berdiri dengan\t : "+ Kaki1 +" atau "+ Kaki2);
    }
}
