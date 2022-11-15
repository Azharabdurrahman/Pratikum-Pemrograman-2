/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

/**
 *
 * @author LENOVO
 */
public class Buku {
     String namajudul;
     String namapenulis;
     int tahun_terbit;

 public Buku (String j, String p, int t){
   namajudul=j;
   namapenulis=p;
   tahun_terbit=t;
 }
  public void info(){
           System.out.println("Judul adalah " + getJudul());
           System.out.println("Penulis adalah " + getPenulis());
           System.out.println("Tahun Terbit adalah " + getTahun_terbit());
  }
  public String getJudul() {
        return namajudul;
    }

    public void setJudul(String judul) {
        namajudul = judul;
    }

    public String getPenulis() {
        return namapenulis;
    }

    public void setPenulis(String penulis) {
        namapenulis = penulis;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        tahun_terbit = tahun_terbit;
    }
      
    }
    
    

