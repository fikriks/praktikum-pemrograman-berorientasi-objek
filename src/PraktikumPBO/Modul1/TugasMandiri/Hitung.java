/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul1.TugasMandiri;

import java.util.Scanner;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Hitung {
    public static void main(String[] args)
    {
        int panjang, lebar, tinggi, volume, luas, keliling;
        Balok balok = new Balok();
        Scanner key = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("Program Menghitung Volume, Luas, Keliling Balok");
        System.out.println("================================================");
        
        System.out.print("Masukkan Panjang Balok: ");
        panjang = key.nextInt();
        System.out.print("Masukkan Lebar Balok: ");
        lebar = key.nextInt();
        System.out.print("Masukkan Tinggi Balok: ");
        tinggi = key.nextInt();
        
        volume = balok.volume(panjang, lebar, tinggi);
        luas = balok.luas(panjang, lebar, tinggi);
        keliling = balok.keliling(panjang, lebar, tinggi);
        
        System.out.println("===============================================");
        System.out.println("Volume Balok Adalah: "+volume);
        System.out.println("Luas Balok Adalah: "+luas);
        System.out.println("Keliling Balok Adalah: "+keliling);
    } 
}
