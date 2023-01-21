/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul10.Praktikum.Praktikum2;

import javax.swing.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
class Praktikum2 extends JFrame {
    public Praktikum2(String title){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);
        setLocation(200,150);
        setTitle(title);
        setVisible(true);
    }
}

class Latihan7b {
    public static void main(String args[]){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Praktikum2("Window Utama");
    }
}
