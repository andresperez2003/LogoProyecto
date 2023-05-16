/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class LectorinstruccionesTortuga {
    private Controlador controlador;
    private ArrayList<String> intrucciones;

    public LectorinstruccionesTortuga(Controlador controlador) {
        this.intrucciones = new ArrayList<>();
        this.controlador = controlador;
    }
    
    

    public boolean read(String movimiento) {
        String[] division = movimiento.split(" ");
        String instruccion = division[0].toLowerCase();
        switch (instruccion) {
            case "fd", "forward" -> {
                    int distance = Integer.parseInt(division[1]);
                    controlador.forward(distance);
                    this.getIntrucciones().add(movimiento);
            }
            case "bd", "backward" -> {
                    int distance = Integer.parseInt(division[1]);
                    controlador.backward(distance);
                    this.getIntrucciones().add(movimiento);
            }
            case "rt", "rigthturn" -> {
                int degree = Integer.parseInt(division[1]);
                controlador.rigthTurn(degree);
                this.getIntrucciones().add(movimiento);
            }
            case "ld", "leftturn" -> {
                int degree = Integer.parseInt(division[1]);
                controlador.leftTurn(degree);
                this.getIntrucciones().add(movimiento);
            }
            case "sc", "setcolor" -> {
                Color colortoSelect = defineColor(instruccion);
                if(colortoSelect != null){
                    controlador.setColor(colortoSelect);
                    this.getIntrucciones().add(movimiento);
                }
            }
            case "r", "reset" -> {
                controlador.reset();
            }
            case "h", "home" -> {
                controlador.home();
            }
            case "l", "load" -> {
                controlador.load();
            }
            case "s", "save" -> {
                controlador.save();
            }
            default -> {
                return false;
            }
        }
        return true;
    }

    public String returnMove() {
        return "";
    }
    
    public Color defineColor(String color){
        Color returnColor = null;
        String newColor = color.toLowerCase();
        switch (newColor) {
            case "black" -> returnColor = Color.BLACK;
            case "blue" -> returnColor = Color.BLUE;
            case "cyan" -> returnColor = Color.CYAN;
            case "gray" -> returnColor = Color.GRAY;
            case "green" -> returnColor = Color.GREEN;
            case "magenta" -> returnColor = Color.MAGENTA;
            case "orange" -> returnColor = Color.ORANGE;
            case "pink" -> returnColor = Color.PINK;
            case "red" -> returnColor = Color.RED;
            case "white" -> returnColor = Color.WHITE;
            case "yellow" -> returnColor = Color.YELLOW;
            default -> {
                return returnColor;
            }
        }
        return returnColor;
    }

    /**
     * @return the intrucciones
     */
    public ArrayList<String> getIntrucciones() {
        return intrucciones;
    }

    
    
    
}
