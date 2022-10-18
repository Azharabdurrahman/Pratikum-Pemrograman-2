/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak201_2110817310014_muhammadazharabdurrahman;

/**
 *
 * @author LENOVO
 */
public class PRAK201_2110817310014_MuhammadAzharAbdurrahman {

    public static void main(String[] args) {
       Mangga Arumanis = new Mangga("Arumanis", 0.3f, 13, 5000);
       Mangga Manalagi = new Mangga("Manalagi", 0.5f, 17, 7500);
       Mangga Madu     = new Mangga("Mangga Madu", 0.375f, 12, 6500);
       
        Arumanis.market();
        Manalagi.market();
        Madu.market();
       
    }
}
