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
public class Mahasiswa extends Person {
    private String NIM;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String Nama, String Alamat,int Umur, String NIM){
        super(Nama, Alamat, Umur);
        this.NIM = NIM;
    }
    
    public String getNIM(){
        return NIM;
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public void infoMahasiswa(){
        System.out.println("\nInfo Mahasiswa");
        System.out.println("NIM\t\t: "+ getNIM());
        System.out.println("Nama\t\t: "+ getNama());
        System.out.println("Alamat\t\t: "+ getAlamat());
        System.out.println("Umur\t\t: "+ getUmur());
    }
}
