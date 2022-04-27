/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul5.TugasMandiri;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Cicit extends Cucu {
    public Cicit(){
        System.out.println("Nama Cucu : "+ namecucu);
    }
    
    public static void main(String[] args){
        String namecicit;
        
        namecicit = "Fikri Khairul Shaleh";
        
        Cicit cicit = new Cicit();
        System.out.println("Saya adalah CICIT");
        System.out.println("Nama Saya : "+ namecicit);
    }
}
