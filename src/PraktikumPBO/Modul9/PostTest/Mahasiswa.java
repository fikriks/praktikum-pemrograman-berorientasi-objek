/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul9.PostTest;


/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Mahasiswa {
    private String nim, nama, jk, prodi;
    
    public Mahasiswa(String nim, String nama, String jk, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.jk = jk;
        this.prodi = prodi;
    }
    
    public void tampilMahasiswa()
    {
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+jk);
        System.out.println("Program Studi: "+prodi);
        tampilFakultas();
        System.out.println("Belajar Untuk Meraih Masa Depan");
    }
    
    public void tampilFakultas()
    {
        System.out.println("FKOM");
    }
}
