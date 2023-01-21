/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul9.Praktikum.Praktikum5;

import java.io.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class BacaFile {
    public static void main(String args[]) throws IOException {
        String namaFile = "PBO.txt";
        String namaMhs, jurusan, angkatan;
        
         try{
           FileInputStream inFile = new FileInputStream(namaFile);
           DataInputStream inStream = new DataInputStream(inFile);
           namaMhs = inStream.readUTF();
           jurusan = inStream.readUTF();
           angkatan = inStream.readUTF();
           inStream.close();
           
           System.out.println("Nama: "+ namaMhs +"\nJurusan: "+ jurusan +"\nAngkatan: "+angkatan);
        }catch(FileNotFoundException e){
            System.out.println("File "+ namaFile +" Tidak Ada !\n");
        }catch(IOException ex){
            System.out.println("IOERROR: "+ ex.getMessage() +"\n");
        }
    }
}
