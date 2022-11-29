/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author LENOVO
 */
public class Paint {
    private double coverage; //number of square feet per gallon
    
    public Paint(double c){ 
        coverage = c;
}
// Constructor: Sets up the paint object.
//---------------------------------------------------
// Returns the amount of paint (number of gallons)
// needed to paint the shape given as the parameter.
//---------------------------------------------------
public double amount(Shape s){
    System.out.println ("Computing amount for " + s);
return s.area()/coverage;
}
}
