/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul5.Praktikum;

/**
 *
 * @author Fikri Khairul Shaleh
 */

// Sub Class
public class Dosen extends Person {
    private String idDosen;
    
    public Dosen(){
        
    }
    
    public Dosen(String Nama, String Alamat,int Umur, String idDosen){
        super(Nama, Alamat, Umur);
        this.idDosen = idDosen;
    }
    
    public String getIdDosen(){
        return idDosen;
    }
    
    public void setIdDosen(String idDosen){
        this.idDosen = idDosen;
    }
    
    public void infoDosen(){
        System.out.println("\nInfo Dosen");
        System.out.println("idDosen\t\t: "+ getIdDosen());
        System.out.println("Nama\t\t: "+ getNama());
        System.out.println("Alamat\t\t: "+ getAlamat());
        System.out.println("Umur\t\t: "+ getUmur());
    }
}
