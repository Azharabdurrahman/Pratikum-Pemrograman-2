/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak102_2110817310014_muhammadazharabdurrahman;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Prak102_2110817310014_muhammadazharabdurrahman {

    public static void main(String[] args) {
        Scanner ling = new Scanner (System.in);
        int bilangan=0;
        int angka = ling.nextInt(); 
        
        while ( bilangan <= 6 ){
            if(angka % 2 == 0) {
                int a;
                a = (angka / 2) - 1;
                System.out.print(" " + a +" ");
            } else {
                System.out.print(angka);
            }
            
            angka++;
            bilangan++;
            
        }
    }
}
