/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author LENOVO
 */
public abstract class Shape {
   protected String shapeName;
// Constructor: Sets up the Shape.
   
public Shape(String Nama){
    this.shapeName=Nama;
}
// Returns the surface area of the Shape.

protected abstract double area();
// Returns the Shape as a String.


public String toString(){
    return shapeName;
    }
}
