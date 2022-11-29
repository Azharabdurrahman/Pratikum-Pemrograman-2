/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author LENOVO
 */
public class Cylinder extends Shape {
    private final double radius;
    private final double height;
     // Constructor: Sets up the Cylinder.
    
    
 public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    } 
 // Returns the surface area of the Cylinder.
    
    @Override
    public double area(){
        return Math.PI * radius * radius * height;
    }

     // Returns the Cylinder  as a String.
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
