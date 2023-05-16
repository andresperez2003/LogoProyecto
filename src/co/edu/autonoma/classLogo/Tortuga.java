/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Tortuga extends Sprite implements Drawable{
    private Color color;
    private int degree;
    private Drawable drawable;
    ArrayList<Rastro> rastros ;

    public Tortuga(Color color, int degree, int posX, int posY) {
        super(posX, posY, 50, 50);
        this.color = color;
        this.degree = degree;
        this.rastros = new ArrayList<>();
    }

    

    public void move(int distance){
        int x1 = posX;
        int y1 = posY;
        posX += Math.sin(Math.toRadians(degree))*distance;
        posY += Math.cos(Math.toRadians(degree))*distance;
        int x2 = posX;
        int y2 = posY;
        
        crearRastro(x1, y1, x2, y2);
        redraw();
    }
    
    @Override
    public void draw(Graphics g){
        ImageIcon tortuga = new ImageIcon(getClass().getResource("tortuga.png"));
        g.drawImage(tortuga.getImage(), posX, posY, width, height, null);
        dibujarRastro(g);
    }
    
    public Color getColor() {
        return color;
    }
    
    
    public void crearRastro(int x1, int y1, int x2, int y2){
        Rastro rastro = new Rastro(x1, x2, y1, y2);
        rastros.add(rastro);
    }
    
    public void dibujarRastro(Graphics g) {
        for (Rastro actual : rastros) {
            g.drawLine(actual.getX1(), actual.getY1(), actual.getX2(), actual.getY2());
        }
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
        this.degree += degree;
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
