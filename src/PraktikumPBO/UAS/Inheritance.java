/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.UAS;

/**
 *
 * @author fikri
 */
class MakhlukHidup {
    public void cetakMakhlukHidup(){
        System.out.println("Macam-Macam Makhluk Hidup");
    }
}

// Manusia mengextends MakhlukHidup
class Manusia extends MakhlukHidup {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Jenis Makhluk Hidup : Manusia");
    }
}

// Hewan mengextends MakhlukHidup
class Hewan extends MakhlukHidup {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Jenis Makhluk Hidup : Hewan");
    }
}

// Tumbuhan mengextends MakhlukHidup
class Tumbuhan extends MakhlukHidup {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Jenis Makhluk Hidup : Tumbuhan");
    }
}

// Virus mengextends MakhlukHidup
class Virus extends MakhlukHidup {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Jenis Makhluk Hidup : Virus");
    }
}

// Subclass dari class manusia
class Fikri extends Manusia {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Nama Saya Fikri dan saya Manusia");
    }
}

class Khairul extends Manusia {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Nama Saya Khairul dan saya Manusia");
    }
}


// Subclass dari class Hewan
class Sapi extends Hewan {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Saya sapi dan saya Hewan");
    }
}

class Kambing extends Hewan {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Saya kambing dan saya Hewan");
    }
}

// Subclass dari class Tumbuhan
class Anggrek extends Tumbuhan {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Saya anggrek dan saya Tumbuhan");
    }
}

class Kaktus extends Tumbuhan {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Saya kaktus dan saya Tumbuhan");
    }
}

// Subclass dari class Virus
class Corona extends Virus {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Saya corona dan saya virus");
    }
}

class Hiv extends Virus {
    @Override
    public void cetakMakhlukHidup(){
        System.out.println("Saya Hiv dan saya virus");
    }
}

public class Inheritance {
    public static void main(String[] args){
        MakhlukHidup makhlukHidup = new MakhlukHidup();
        Manusia manusia = new Manusia();
        Hewan hewan = new Hewan();
        Tumbuhan tumbuhan = new Tumbuhan();
        Virus virus= new Virus();
        Fikri fikri = new Fikri();
        Khairul khairul = new Khairul();
        Sapi sapi = new Sapi();
        Kambing kambing = new Kambing();
        Anggrek anggrek = new Anggrek();
        Kaktus kaktus = new Kaktus();
        Corona corona = new Corona();
        Hiv hiv = new Hiv();
        
        System.out.println("Superclass : Makhluk Hidup");
        makhlukHidup.cetakMakhlukHidup();
        
        System.out.println("");
        
        System.out.println("Jenis-Jenis Makhluk Hidup Extends Superclass Makhluk Hidup");
        manusia.cetakMakhlukHidup();
        hewan.cetakMakhlukHidup();
        tumbuhan.cetakMakhlukHidup();
        virus.cetakMakhlukHidup();
        
        System.out.println("");
        
        System.out.println("Subclass Dari Manusia Extends Makhluk Hidup");
        fikri.cetakMakhlukHidup();
        khairul.cetakMakhlukHidup();
        
        System.out.println("");
        
        System.out.println("Subclass Dari Hewan Extends Makhluk Hidup");
        sapi.cetakMakhlukHidup();
        kambing.cetakMakhlukHidup();
        
        System.out.println("");
        
        System.out.println("Subclass Dari Tumbuhan Extends Makhluk Hidup");
        anggrek.cetakMakhlukHidup();
        kaktus.cetakMakhlukHidup();
        
        System.out.println("");
        
        System.out.println("Subclass Dari Virus Extends Makhluk Hidup");
        corona.cetakMakhlukHidup();
        hiv.cetakMakhlukHidup();
    }
}
