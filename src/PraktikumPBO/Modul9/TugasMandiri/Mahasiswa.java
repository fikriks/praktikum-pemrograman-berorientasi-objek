/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul9.TugasMandiri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Mahasiswa extends Manusia {
    private static String nim, prodi, fakultas;
    private final IOMahasiswa ioMahasiswa = new IOMahasiswa();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.menu();
    }
    
    public void menu(){
        int pilihan;
        
        System.out.println("==========================");
        System.out.println("-------MENU PILIHAN-------");
        System.out.println("--------------------------");
        System.out.println("1. Input Data Mahasiswa");
        System.out.println("2. Lihat Data Mahasiswa");
        System.out.println("3. Keluar Program");
        System.out.println("-------------------------");
        
        try{
             System.out.print("Pilihan Anda : ");
             pilihan = Integer.parseInt(bufferedReader.readLine());
             
             switch(pilihan){
                 case 1:
                     System.out.println("");
                     input();
                     break;
                 case 2:
                     System.out.println("");
                     lihat();
                     break;
                 case 3:
                     System.exit(0);
                 default:
                     System.out.println("Pilihan Tidak Ada!");
                     menu();
                     break;
             }
        }catch(IOException e){
            System.out.println("ERROR: "+ e.getMessage() +"\n");
        }
       
    }
    
    public void input() {
        System.out.println("--------------------------");
        System.out.println("---INPUT DATA MAHASISWA---");
        System.out.println("--------------------------");
        
        try{
            System.out.print("Masukkan NIM Anda : ");
            nim = bufferedReader.readLine();

            System.out.print("Masukkan Nama Anda : ");
            nama = bufferedReader.readLine();

            System.out.print("Masukkan Alamat Anda : ");
            alamat = bufferedReader.readLine();

            System.out.print("Masukkan Jenis Kelamin Anda : ");
            jk = bufferedReader.readLine();

            System.out.print("Masukkan Program Studi Anda : ");
            prodi = bufferedReader.readLine();

            System.out.print("Masukkan Fakultas Anda : ");
            fakultas = bufferedReader.readLine();

            ioMahasiswa.tulisFile(nim, nama, alamat, jk, prodi, fakultas);
        }catch (IOException e){
            System.out.println("ERROR: "+ e.getMessage() +"\n");
        }
        
        System.out.println("\nBerhasil menambahkan data mahasiswa\n");
        
        kembali();
    }
    
    public void lihat(){
        System.out.println("--------------------------");
        System.out.println("---LIHAT DATA MAHASISWA---");
        System.out.println("--------------------------");
        ioMahasiswa.bacaFile();
        kembali();
    }
    
    public void kembali(){
        String pilihan = "";
        
        try{
            System.out.print("Apakah ingin kembali ke menu? [y/n] : ");
            pilihan = bufferedReader.readLine();
        }catch(IOException e){
             System.out.println("ERROR: "+ e.getMessage() +"\n");
        }
        
        switch(pilihan){
            case "y":
                menu();
                break;
            case "n":
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Tidak Ada!");
                kembali();
                break;
        }
    }
}
