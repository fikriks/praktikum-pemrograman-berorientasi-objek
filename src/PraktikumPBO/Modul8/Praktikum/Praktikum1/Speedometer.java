/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul8.Praktikum.Praktikum1;

/**
 *
 * @author Fikri Khairul Shaleh
 */

// Deklarasi Interface
public interface Speedometer {
    public void tambahKecepatan();
    public void kurangiKecepatan();
}

// Implementasi Interface
class Mobil implements Speedometer {
    public void tambahKecepatan(){
        System.out.println("Injak kopling lebih tinggi & Gas mobilnya");
    }
    
    public void kurangiKecepatan(){
        System.out.println("Rem mobilnya & pindah gear yang lebih rendah");
    }
}

class Motor implements Speedometer {
    public void tambahKecepatan(){
        System.out.println("Pindah ke gear yang lebih tinggi & Gas motornya");
    }
    
    public void kurangiKecepatan(){
        System.out.println("Rem motornya dengan rem belakang + depan, lalu " + "Pindah gear yang lebih rendah");
    }
}

class TestKendaraan {
    public static void main(String args[]){
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        
        System.out.print("Cara ngebut pake motor: ");
        motor.tambahKecepatan();
        System.out.print("Cara berhentinya: ");
        motor.kurangiKecepatan();
        
        System.out.print("Cara balapan pake mobil: ");
        mobil.tambahKecepatan();
        System.out.print("Kalo udah puas: ");
        mobil.kurangiKecepatan();
    }
}