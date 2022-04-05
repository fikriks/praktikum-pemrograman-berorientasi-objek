/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul2.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class PostTest {
    public static void main(String[] args)
    {
        double luas, keliling;
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        
        persegiPanjang.lebar = 14;
        persegiPanjang.panjang = 21;
        
        luas = persegiPanjang.panjang * persegiPanjang.lebar;
        keliling = 2 * (persegiPanjang.panjang + persegiPanjang.lebar);
        
        System.out.println("Luas Persegi Panjang = "+ luas);
        System.out.println("Keliling Persegi Panjang = "+ keliling);
    }
}
