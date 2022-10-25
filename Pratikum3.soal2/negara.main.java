/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Pratikum3Soal2 {
    public static void main(String[] args) {
      String negara = "";
      String pemimpin="";
      String presiden="";
      int tanggalberapa = 0;
      int bulanapa = 0;
      int tahunberapa = 0;
             
        Scanner input = new Scanner(System.in);
   
        LinkedList<negara> llnamanegara = new LinkedList<negara>(); 
        
         int ulang;
        ulang = input.nextInt();
       for (int i=0; i<ulang; i++){
            negara namanegara = new negara(negara, pemimpin, presiden, tanggalberapa, bulanapa, tahunberapa);
            namanegara.getData();
            llnamanegara.add(namanegara);
        }

        for (int i = 0; i < llnamanegara.size(); i++){
            negara nIndex = llnamanegara.get(i);
            nIndex.tampilkan();
    }
}
}