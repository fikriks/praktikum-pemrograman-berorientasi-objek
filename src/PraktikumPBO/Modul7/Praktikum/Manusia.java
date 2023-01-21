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
public class Manusia extends MakhlukHidup {
    private String Kaki;
    
    public Manusia(String Kaki){
        this.Kaki = Kaki;
    }
    
    public void berdiri(){
        System.out.println("Manusia berdiri dengan\t : "+ Kaki);
    }
}
