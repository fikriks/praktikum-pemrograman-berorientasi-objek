/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul5.TugasMandiri;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Kakek {
    protected String namekakek;
    protected String address;
    
    public Kakek(){
        System.out.println("\n Program Demo Inheritance");
        System.out.println("==========================");
        System.out.println("Masukan Construktor Kakek ");
        System.out.println("-Dijalankan oleh class Bapak-");
        
        namekakek = "Joyo Cokro Aminoto";
        address = "Sleman Djogjakarta";
    }
    
    public Kakek(String name, String address){
        this.namekakek = name;
        this.address = address;
    }
    
    public String getName(){
        return namekakek;
    }
    
    public String getAddresss(){
        return address;
    }
}
