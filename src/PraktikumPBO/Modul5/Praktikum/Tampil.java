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
public class Tampil {
    public static void main(String args[]){
        Person a = new Person("Rere", "Cijoho", 29);
        a.infoPerson();
        
        Dosen b = new Dosen("Gugun", "Kuningan", 45, "17.05.05");
        b.infoDosen();
        
        Mahasiswa c = new Mahasiswa("Ina", "Lebak Wangi", 17, "13.11.7066");
        c.infoMahasiswa();
        System.out.println("---------------------------------------");
    }
}
