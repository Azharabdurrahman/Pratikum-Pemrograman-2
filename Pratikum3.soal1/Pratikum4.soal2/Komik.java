/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum4.soal2;

/**
 *
 * @author LENOVO
 */
public class Komik extends Buku {
   private int volume;
   private String sinopsis;
   String KomikDetail;

public Komik(String j, String p, String t, int v, String s ){
    super.namajudul=j;
    super.namapenulis=p;
    super.tahun=Integer.valueOf(t);
    volume=v;
    sinopsis=s;
}
public  String getKomikDetail() {
    return "Data yang baru di inputkan adalah\nSebuah Komik dengan judul \"" + namajudul
            +"\".nKomik tersebut dibuat oleh " + namapenulis + "dan diterbitkan pada tahun"
            + tahun + ".Sampai saat ini komik tersebut memiliki jumlah volume sebanyak" 
            + volume + "buah." + "/nSinopsis : " + sinopsis.substring(0, 64) + "...";
}
}
