/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak201_2110817310014_muhammadazharabdurrahman;

/**
 *
 * @author LENOVO
 */
public class Mangga {
    String namabuah;
    float berat;
    int jumlahbeli;
    int totalharga;
    
    
    public Mangga (String nama, float beratmangga,int jumlah ,int harga){
        namabuah = nama;
        berat = beratmangga;
        jumlahbeli = jumlah;
        totalharga = harga;
    }
    
    public void market (){
        System.out.println("Nama Mangga:" + namabuah);
        System.out.println("beratmangga:" + berat);
        System.out.println("jumlah:" + jumlahbeli);
        System.out.println("Total Berat : " + (berat*jumlahbeli) + " kg");
        System.out.println("Total Harga:" + totalharga*jumlahbeli);
        System.out.println("");
    }
}
