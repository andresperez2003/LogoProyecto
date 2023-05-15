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
public class Tortuga extends Sprite implements Drawable{
    private Color color;
    private int degree;

    public Tortuga(Color color, int degree, int posX, int posY, int width, int height) {
        super(posX, posY, width, height);
        this.color = color;
        this.degree = degree;
    }

    

    public void move(int distance){
        //PosY = Cost(angulo)*distance
        //PosX= Cos(angulo)*distance
        posY = posY+distance;
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
    public int getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public void redraw() {
        
    }
    
    
    
}
