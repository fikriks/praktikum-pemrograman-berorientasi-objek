/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul5.TugasMandiri;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Cucu extends Bapak {
    protected String namecucu;
    
    public Cucu(){
        System.out.println("Nama Bapak :"+ namebapak);
        System.out.println("Address Bapak :"+ addressbapak);
        
        namecucu = "Rio Andriyat Krisdiawan";
        
        System.out.println("Saya adalah CUCU");
        System.out.println("Nama Saya : "+ namecucu);
        System.out.println("");
        System.out.println("--Dijalankan oleh class Cicit--");
    }
    
    public static void main(String args[]){
        Cucu lagan = new Cucu();
    }
}
