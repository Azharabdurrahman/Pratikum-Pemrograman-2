/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak104_2110817310014_muhammadazharabdurrahman;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Prak104_2110817310014_muhammadazharabdurrahman {

    public static void main(String[] args) {
         Scanner ling = new Scanner(System.in);
        System.out.println("Kartu Andi : ");
        int andi1 = ling.nextInt();
        int andi2 = ling.nextInt();
        int andi3 = ling.nextInt();
        
        System.out.println("Kartu Budi : ");
        int budi1 = ling.nextInt();
        int budi2 = ling.nextInt();
        int budi3 = ling.nextInt();
        
int x = andi1 + andi2 + andi3;
int y= budi1 + budi2 + budi3;

if (x > y ) {
    System.out.print("andi menang");
} else if (x==y) {
    System.out.print("seri");
} else 
    System.out.print("budi menang");
    }
}




       
                
     