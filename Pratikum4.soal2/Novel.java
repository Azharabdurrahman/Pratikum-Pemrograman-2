/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum4.soal2;

/**
 *
 * @author LENOVO
 */
public class Novel extends Buku{
    private String genre;
    private String sinopsis;
    
    public Novel (String j, String p, String t, String g, String s){
        super.namajudul=j;
        super.namapenulis=p;
        super.tahun=Integer.valueOf(t);
        genre=g;
        sinopsis=s;
    }
    public String getNovelDetail(){
        return "Data yang baru di inputkan adalah\nSebuah novel bergenre Drama dengan judul \"" +namajudul
        + "\" .\nNovel tersebut ditulis oleh " + namapenulis + " dan diterbitkan pada tahun " + tahun
        + " . \nSinopsi : " + sinopsis.substring(0, 59) + "....";
    }
    }
          

