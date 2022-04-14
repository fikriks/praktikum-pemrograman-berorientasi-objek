/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.TugasMandiri;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Manusia {
    public String nama;
    
    public Manusia(String n)
    {
        this.nama = n;
    }
    
    public String tampilkanNama()
    {
        return nama;
    }
    
    public void makan()
    {
        System.out.println("Nyam... nyam... nyam...");
    }
    
    public void kerja()
    {
        System.out.println("Kerja...kerjaaa...");
    }
}
