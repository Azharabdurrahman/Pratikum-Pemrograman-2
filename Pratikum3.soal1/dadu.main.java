/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum3.soal1;


import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Pratikum3Soal1 {

  public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        dadu daduAcak = new dadu();
        
        int inputUser = input.nextInt();
        
        daduAcak.setInput(inputUser);
        
        daduAcak.nilai();
        daduAcak.cetak();
}
    }
    

