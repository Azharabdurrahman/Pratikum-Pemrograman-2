/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak201_2110817310014_muhammadazhar.a;

/**
 *
 * @author LENOVO
 */
public class PRAK201_2110817310014_muhammadazharA {

    public static void main(String[] args) {
      mobil mobil1 = new mobil();
mobil1.merekmobil = "Toyota Raize";
mobil1.tahunkeluaran = "2021";
mobil1.kapasitas = 988;
mobil1.harga = 202700000;


mobil1.info();
mobil1.setpemilik("Kasel");
System.out.println("pemilik mobil: " + mobil1.getpemilik());
System.out.println("Pajak Mobil: Rp. " + mobil1.getpajak() );
    }
}
