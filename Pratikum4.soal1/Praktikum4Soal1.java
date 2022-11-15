/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4.soal1;

import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class Praktikum4Soal1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String judul;
        String penulis;
        int tahun_terbit;
        
        System.out.print("Judul: ");
         judul = input.nextLine();     
        
        System.out.print("Penulis: ");
        penulis = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun_terbit = input.nextInt();
        
        Buku Books= new Buku(judul, penulis, tahun_terbit);
        Books.info();
        
    }
}

   
    

