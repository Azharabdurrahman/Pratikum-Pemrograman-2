/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak203_2110817310014_muhammadazharabdurrahman;

/**
 *
 * @author LENOVO
 */
public class PRAK203_2110817310014_muhammadazharabdurrahman {

    public static void main(String[] args) {
    pegawai p1 = new pegawai();
        p1.nama = "Roi";//tidak ada tanda";" jd ditambahkan tanda ";"//
        p1.asal = "Kingdom of Orvel"; 
        p1.setJabatan("Assasin"); //tidak ada "setjabatan" pada file class pegawai//
        p1.umur=17; //tambahkan variabel umur//
        
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun ");//tambahkan cetka "tahun' di akhir//
    }
}
