/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul9.Praktikum.Praktikum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class IOReadString {
    public static void main(String args[]) throws IOException {
        String nameString;
        System.out.println("Masukkan nama Anda: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        nameString = bufferedReader.readLine();
        System.out.println("Nama Anda :"+ nameString);
    }
}
