/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul5.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Mahasiswa extends Kelas {
    private final String nama_mhs;
    
    public Mahasiswa(){
      nama = "TINFC-2021-B";
      nama_mhs = "Fikri Khairul Shaleh";
      cetak();
    }
    
    public void cetak(){
        super.cetakKeLayar();
        System.out.println("Nama Mahasiswa : "+ nama_mhs);
    }
    
    public static void main(String[] args){
        Mahasiswa mahasiswa = new Mahasiswa();
    }  
}
