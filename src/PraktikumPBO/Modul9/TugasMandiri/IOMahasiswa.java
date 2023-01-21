/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul9.TugasMandiri;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public final class IOMahasiswa {
     private String nim, nama, alamat, jk, prodi, fakultas;
     
    public void tulisFile(String nim, String nama, String alamat, String jk, String prodi, String fakultas) {
        // Nama file yang dibuat
        String namaFile = "Mahasiswa.txt";
        
        try{
            FileOutputStream outFile = new FileOutputStream(namaFile, true);
            DataOutputStream outStream = new DataOutputStream(outFile);
            
            outStream.writeUTF(nim);
            outStream.writeUTF(nama);
            outStream.writeUTF(alamat);
            outStream.writeUTF(jk);
            outStream.writeUTF(prodi);
            outStream.writeUTF(fakultas);
            outStream.close();
        }catch(IOException e){
            System.out.println("IOERROR: "+ e.getMessage() +"\n");
        }
    }
    
    public void bacaFile(){
         String namaFile = "Mahasiswa.txt";
        
         try{
           FileInputStream inFile = new FileInputStream(namaFile);
           DataInputStream inStream = new DataInputStream(inFile);
           
           while(inStream.available() > 0){
               nim = inStream.readUTF();
               nama = inStream.readUTF();
               alamat = inStream.readUTF();
               jk = inStream.readUTF();
               prodi = inStream.readUTF();
               fakultas = inStream.readUTF();
               
               System.out.println("--------------------------");
               System.out.println("NIM: "+ nim +"\nNama: "+ nama +"\nAlamat: "+alamat +"\nJenis Kelamin: "+ jk +"\n"
                       + "Program Studi: "+ prodi +"\nFakultas: "+ fakultas +"\n");
               System.out.println("--------------------------");
           }
           
           inStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File "+ namaFile +" Tidak Ada !\n");
        }catch(IOException ex){
            System.out.println("IOERROR: "+ ex.getMessage() +"\n");
        }
    }
}
