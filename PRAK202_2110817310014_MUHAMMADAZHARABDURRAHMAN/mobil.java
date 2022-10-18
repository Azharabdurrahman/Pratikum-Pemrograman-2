/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak201_2110817310014_muhammadazhar.a;

/**
 *
 * @author LENOVO
 */
public class mobil {
    String merekmobil;
     int harga;
    String tahunkeluaran;
    int kapasitas;
    String pemilikmobil;
    
    

    public void info (){
        System.out.println("merek mobil: " + merekmobil);
        System.out.println("harga: " + harga);
        System.out.println("Tahun keluaran: " + tahunkeluaran);
        System.out.println("kapasitas: " + kapasitas);
    }
    public void setpemilik(String pemilik){
        pemilikmobil = pemilik;
    }
    
    public String getpemilik(){
        return pemilikmobil;
    }
    
    public int getpajak(){
        return harga * 2/100;
    }
    
    public String getmerekmobil() {
        return merekmobil;
    }
    
    public String gettahunkeluaran(){
        return tahunkeluaran;
    }
    
    public int getkapasitasmobil(){
        return kapasitas;
    }
    
    public int gethargamobil(){
        return harga;
    }
    
}
    

