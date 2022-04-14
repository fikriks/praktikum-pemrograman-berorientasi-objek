/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Memasak {
    public String merk;
    
    public Memasak(String merk){
        this.merk = merk;
    }
    
    public String tampilkanMerk(){
        return merk;
    }
    
    public void rasa(){
        System.out.println("Indomie Rasa Ayam Bawang...Nyammm.. Nyamm.. Nyam.. Enak");
    }
    
    public void slogan(){
        System.out.println("Indomie Seleraku");
    }
}
