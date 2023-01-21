/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Modul10.PostTest;

import javax.swing.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class PostTest {
     public static void main(String args[]){
        JFrame windowku = new JFrame("Window Utama");
        JLabel label = new JLabel();
        JTextField textField = new JTextField(16);
        JButton button = new JButton("Submit");
        JPanel panel = new JPanel();
        
        label.setText("Nama");
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        windowku.add(panel);
        windowku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowku.setSize(300,150);
        windowku.setLocation(200,150);
        windowku.show();
    }
}
