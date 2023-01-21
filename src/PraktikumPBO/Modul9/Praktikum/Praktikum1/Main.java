/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul9.Praktikum.Praktikum1;

// Membaca input data karakter dari console
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Main {
    public static void main(String args[]) throws IOException{
        char inputChar;
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan sembarang karakter: ");
        inputChar = (char) bufferedReader.read();
        System.out.println("Karakter yang diinputkan : "+ inputChar);
    }
}
