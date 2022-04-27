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
public class Bapak extends Kakek {
    protected String namebapak;
    protected String addressbapak;
    
    public Bapak(){
        System.out.println("Nama Kakek : "+ namekakek);
        System.out.println("Address Kakek : "+ address);
        System.out.println("\n");
        System.out.println("Masukan Construktor Bapak ");
        System.out.println("--Dijalankan oleh class Cucu--");
        
        namebapak = "ROHAEDI";
        addressbapak = "KUNINGAN";
    }
    
    public Bapak(String namebapak, String addressbapak){
        this.namebapak = namebapak;
        this.addressbapak = addressbapak;
    }
    
    public String getNama(){
        return namebapak;
    }
    
    public String getAddress(){
        return addressbapak;
    }
    
    public static void main(String args[]){
        Bapak sari = new Bapak();
    }
}
