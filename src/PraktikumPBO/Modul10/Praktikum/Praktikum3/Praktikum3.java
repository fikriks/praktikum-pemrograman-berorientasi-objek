/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul10.Praktikum.Praktikum3;

import javax.swing.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
class Praktikum3 extends JFrame {
    public Praktikum3(String title){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);
        setLocation(200,150);
        setTitle(title);
        setVisible(true);
    }
    
    public static void main(String args[]){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Praktikum3("Window Utama");
    }
}