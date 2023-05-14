/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class Tortuga {
    private Color color;
    private float degree;

    public Tortuga(Color color, float degree) {
        this.color = color;
        this.degree = degree;
    }

    public void move(){
        
    }
    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the degree
     */
    public float getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(float degree) {
        this.degree = degree;
    }
    
    
    
}
