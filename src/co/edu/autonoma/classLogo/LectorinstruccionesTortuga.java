/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;
 
/**
 *
 * @author ASUS
 */
public class LectorinstruccionesTortuga {
    private Controlador controlador;
    
    public boolean read(String movimiento) {
        String[] division = movimiento.split(" ");
        String instruccion = division[0].toLowerCase();
        switch (instruccion) {
            case "fd", "forward" -> {
                controlador.forward();
            }
            case "bd", "backward" -> {
                controlador.backward();
            }
            case "rt", "rigthturn" -> {
                controlador.rigthTurn();
            }
            case "ld", "leftturn" -> {
                controlador.leftTurn();
            }
            case "sc", "setcolor" -> {
                controlador.setColor();
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

    public LectorinstruccionesTortuga() {
    }

    

    public String returnMove() {
        return "";
    }
}
