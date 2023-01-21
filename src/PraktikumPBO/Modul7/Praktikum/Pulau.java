/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul7.Praktikum;

/**
 *
 * @author Fikri Khairul Shaleh
 */
abstract class Pulau {
    static final String NEGARA = "Indonesia";
    
    public abstract String nama();
    
    public String ambilNegara(){
        return NEGARA;
    }
}

class Jawa extends Pulau {
    String namap;
    
    public String nama(){
        namap = "Pulau Jawa";
        
        return namap;
    }
}

class Kalimantan extends Pulau {
    String namap;
    
    public String nama(){
        namap = "Pulau Kalimantan";
        
        return namap;
    }
}

class JawaBarat extends Jawa {
    void namaProv(){
        System.out.println("Ini Pulau Berada di "+ ambilNegara());
        System.out.println("Ini "+ nama());
        System.out.println("Ini Provinsi Jawa Barat");
        System.out.println("Jumlah Penduduk : 232342 Jiwa");
    }
}

class KalimantanTimur extends Kalimantan {
    void namaProv(){
        System.out.println("Ini Pulau Berada di "+ ambilNegara());
        System.out.println("Ini "+ nama());
        System.out.println("Ini Provinsi Kalimantan Timur");
        System.out.println("Jumlah Penduduk : 27364 Jiwa");
    }
}

class Utama {
    public static void main(String args[]){
        JawaBarat JB = new JawaBarat();
        KalimantanTimur KT = new KalimantanTimur();
        JB.namaProv();
        System.out.println(".........:P");
        System.out.println("");
        KT.namaProv();
    }
}

