/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum3.soal2;

import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class negara {
    String negara;
    String pemimpin;
    String presiden;
    int tanggalberapa;
    int bulanapa;
    int tahunberapa;
    
    public negara(String namanegara, String jenis, String namapresiden, int tanggal, int bulan, int tahun){
        negara = namanegara;
      pemimpin = jenis;
       presiden= namapresiden;
        tanggalberapa = tanggal;
        bulanapa  = bulan;
        tahunberapa = tahun;
    }
      public int getBulan(){
        return bulanapa;
    }

    public void getData(){
        Scanner scn = new Scanner(System.in);
        negara=scn.nextLine();
        pemimpin=scn.nextLine();
        presiden=scn.nextLine();
        if (pemimpin.equalsIgnoreCase("presiden")||pemimpin.equalsIgnoreCase("perdana menteri")) {
            tanggalberapa = scn.nextInt();
            bulanapa = scn.nextInt();
            tahunberapa = scn.nextInt();
        }
    }

    public void tampilkan(){
        HashMap<Integer, String> month = new HashMap<Integer,String>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        if (pemimpin.equalsIgnoreCase("presiden")|pemimpin.equalsIgnoreCase("perdana menteri")) {
        System.out.println("Negara "+negara+" mempunyai "+pemimpin+" bernama "+presiden);}
        
        else if (pemimpin.equalsIgnoreCase("monarki")){
            System.out.println("Negara "+negara+" mempunyai Raja"+" bernama "+presiden+"\n");
        }
       
        if (pemimpin.equalsIgnoreCase("presiden")||pemimpin.equalsIgnoreCase("perdana menteri")) {
        System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tanggalberapa+" "+month.get(getBulan())+" "+tahunberapa+"\n");}
    }
}



