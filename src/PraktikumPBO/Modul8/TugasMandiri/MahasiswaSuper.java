/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul8.TugasMandiri;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class MahasiswaSuper implements Atlit, Mahasiswa, Wiraswasta {
    public static void main(String[] args) {
        String nama = "Fikri Khairul Shaleh";
        MahasiswaSuper mahasiswaSuper = new MahasiswaSuper();
        
        mahasiswaSuper.tampilNamaAtlit(nama);
        mahasiswaSuper.tampilNamaMahasiswa(nama);
        mahasiswaSuper.tampilNamaWiraswasta(nama);
    }
    
    @Override
    public void tampilNamaAtlit(String nama){
        System.out.println("Nama Atlit : "+nama);
    }
    
    @Override
    public void tampilNamaMahasiswa(String nama){
        System.out.println("Nama Mahasiswa : "+nama);
    }
    
    @Override
    public void tampilNamaWiraswasta(String nama){
        System.out.println("Nama Wiraswasta : "+nama);
    }
}
