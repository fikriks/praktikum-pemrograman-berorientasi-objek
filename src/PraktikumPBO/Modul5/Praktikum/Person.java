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

// Superclass
class Person {
    private String Nama;
    private String Alamat;
    private int Umur;
    
    public Person(){
    }
    
    public Person(String Nama, String Alamat, int Umur){
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public int getUmur(){
        return Umur;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public void setUmur(int Umur){
        this.Umur = Umur;
    }
    
    public void infoPerson(){
        System.out.println("\nInfo Person");
        System.out.println("Nama\t\t: "+ getNama());
        System.out.println("Alamat\t\t: "+ getAlamat());
        System.out.println("Umur\t\t: "+ getUmur());
    }
}
