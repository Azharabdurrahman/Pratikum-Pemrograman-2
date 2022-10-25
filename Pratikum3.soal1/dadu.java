/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum3.soal1;

import java.util.LinkedList;
/**
 *
 * @author LENOVO
 */
public class dadu {
public int inputUser;
   public int total;
    
    void setInput(int input){
        inputUser = input;
    }
    
    LinkedList<Integer> ObjDadu = new LinkedList<Integer>();
    
    void nilai(){
        for (int i = 1; i <= inputUser; i++){
            int nilai = 1 + (int)(Math.random()*6);
            
            ObjDadu.add(nilai);
            
            this.total = this.total + nilai;
        }
    }
    
    void cetak(){
        for(int i = 1; i <= inputUser; i++){
            System.out.println("Dadu ke-" + i + "bernilai " + ObjDadu.get(i-1));
        }
        
        System.out.println("Total nilai dadu keseluruhan " + this.total);
    }
}







