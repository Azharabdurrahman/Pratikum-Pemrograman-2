/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak103_2110817310014_muhammadazharabdurrahman;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Prak103_2110817310014_muhammadazharabdurrahman {

    public static void main(String[] args) {
     int angka;
     Scanner ling=new Scanner (System.in);
     
         System.out.print("Masukkan bilangan : ");
        angka = ling.nextInt();
        
        int a = 5;   
        
        do {            
            if (angka % 7 != 0){
                if (a == 5){
                   System.out.print(angka);
                } else {
                    System.out.print(", " + angka);
                }
            }
            
           angka--;
           a--;
        } while  (a > 0);
    }
}
