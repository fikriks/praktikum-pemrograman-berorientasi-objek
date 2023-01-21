/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul6.Praktikum;

import java.*;
import java.io.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */

/* Class induk dengan nama BentukWajah */
class BentukWajah {
    // Membuat sebuah method respons pada class induk dimana mengembalikan
    public String respons(){
        return ("Perhatikan reaksi wajah saya\n");
    }
}  
 
/* Membuat class-class lain dengan turunan dari class BentukWajah */
class Senyum extends BentukWajah {
    public String respons(){
        return ("Senyum karena senang\n");
    }
}

class Tertawa extends BentukWajah {
    public String respons(){
        return ("Tertawa karena gembira\n");
    }
}

class Marah extends BentukWajah {
    public String respons(){
        return ("Kemarahan disebabkan bertengkat\n");
    }
}

class Sedih extends BentukWajah {
    public String respons(){
        return ("Sedih disebabkan cemburu\n");
    }
}
