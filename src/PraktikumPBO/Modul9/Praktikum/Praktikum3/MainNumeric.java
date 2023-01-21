/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul9.Praktikum.Praktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class MainNumeric {
     public static void main(String args[]) throws IOException {
        int inputNumber;
        String temp;
        System.out.println("Masukkan angka: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        temp = bufferedReader.readLine();
        inputNumber = Integer.parseInt(temp);
        System.out.println("Angka yang dimasukkan :"+ inputNumber);
    }
}
