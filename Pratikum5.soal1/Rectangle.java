/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
      // Constructor: Sets up the Rectangle.
    
    public Rectangle(double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    // Returns the surface area of the Rectangle.
    
    @Override
    public double area(){
        return length * width;
    }
    // Returns the Rectangle as a String.
    
    @Override
    public String toString(){
        return super.toString() + " of length " + length + " and width " + width;
    }
}

