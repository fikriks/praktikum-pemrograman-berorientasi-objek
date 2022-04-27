/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul5.TugasMandiri;

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
