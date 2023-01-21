/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul9.Praktikum.Praktikum4;

import java.io.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class TulisFile {
    public static void main(String args[]) throws IOException {
        // Nama file yang dibuat
        String namaFile = "PBO.txt";
        
        // Isi file yang ditulis
        String namaMhs = "Fikri Khairul Shaleh\n";
        String jurusan = "Teknik Informatika\n";
        String angkatan = "2021";
        
        FileOutputStream outFile = new FileOutputStream(namaFile);
        try{
            DataOutputStream outStream = new DataOutputStream(outFile);
            outStream.writeUTF(namaMhs);
            outStream.writeUTF(jurusan);
            outStream.writeUTF(angkatan);
            outStream.close();
        }catch(IOException e){
            System.out.println("IOERROR: "+ e.getMessage() +"\n");
        }
    }
}
