/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul8.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class JenisTumbuhan implements MakhlukHidup {
    @Override
    public void jenis(String jenis){
        System.out.println("Jenis Tumbuhan = "+ jenis);
    }
    
    @Override
    public void warna(String warna){
        System.out.println("Warna Tumbuhan = "+ warna +"\n");
    }
}
