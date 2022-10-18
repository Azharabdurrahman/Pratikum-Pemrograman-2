/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak203_2110817310014_muhammadazharabdurrahman;

/**
 *
 * @author LENOVO
 */
public class pegawai {
    public String nama;
    public String asal; //tipe data diubah dari char(satu kata saja jd tidak cocok untuk digunakan) ke String(lebih cocok untuk digunakan) //
    public String jabatan;
    public int umur;
    
    public String getNama(){
        return nama;
    }
    
    public String getAsal(){ //tipe data diubah dari char(satu kata saja jd tidak cocok untuk digunakan) ke String(lebih cocok untuk digunakan)//
        return asal;
    }
    
    public void setJabatan(String j){ //Menmbahkan String j untuk mendeklarasikan jabatan//
        this.jabatan= j; 
    }
}
