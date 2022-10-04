/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak105_2110817310014_muhammadazharabdurrahman;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author LENOVO
 */
public class Prak105_2110817310014_muhammadazharabdurrahman {

    public static void main(String[] args) {
        double jari, tinggi, hasil;
        
        Scanner ling = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("input jari-jari : ");
        jari = ling.nextDouble();        System.out.print("input tinggi : ");

        
        tinggi = ling.nextDouble();
        
        hasil = 3.14 * jari * jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}

