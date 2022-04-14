/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO.Modul3.PostTest;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Indomie {
    public static void main(String[] args){
        Memasak memasak = new Memasak("Indomie");
        System.out.println("Memasak Mie = "+ memasak.merk);
        memasak.rasa();
        memasak.slogan();
    }
}
