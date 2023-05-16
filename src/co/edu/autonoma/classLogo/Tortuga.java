/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Tortuga extends Sprite implements Drawable{
    private Color color;
    private int degree;
    private Drawable drawable;

    public Tortuga(Color color, int degree, int posX, int posY) {
        super(posX, posY, 50, 50);
        this.color = color;
        this.degree = degree;
    }

    

    public void move(int distance){
        posX += Math.sin(degree)*distance;
        posY += Math.cos(degree)*distance;
        redraw();
    }
    
    @Override
    public void draw(Graphics g){
        ImageIcon tortuga = new ImageIcon(getClass().getResource("tortuga.png"));
        g.drawImage(tortuga.getImage(), posX, posY, width, height, null);
    }
    
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

    public void setDegree(int degree) {
        this.degree = degree;
    }
    
    public void changeDegree(int degree){
        setDegree(degree);
    }
    
    
    
    @Override
    public void redraw() {
        drawable.redraw();
    }
    
    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
    
    
    
}
