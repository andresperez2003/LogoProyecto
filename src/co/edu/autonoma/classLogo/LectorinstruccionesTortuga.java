/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.autonoma.classLogo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
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
                String value = division[1].toLowerCase();
                String colortoSelect = defineColor(value);
                    controlador.setColor(colortoSelect);
                    this.getIntrucciones().add(movimiento);
            }
            case "r", "reset" -> {
                controlador.reset();
            }
            case "h", "home" -> {
                controlador.home();
            }
            case "l", "load" -> {
                ArrayList<String> comand = load();
                for(String comandos : comand ){
                this.getIntrucciones().add(comandos);
                read(comandos);
            }
            }
            case "s", "save" -> {
                save(this.getIntrucciones());
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
    
    public String defineColor(String color){
        String newColor = color.toLowerCase();
        return switch (newColor) {
            case "magenta" -> "#FF00FF";
            case "orange" -> "#FF8000";
            case "pink" -> "#FF0080";
            case "white" -> "#FFFFFF";
            case "yellow" -> "#FFFF00";
            case "black" -> "#000000";
            case "blue" -> "#0000FF";
            case "cyan" -> "#00FFFF";
            case "gray" -> "#9B9B9B";
            case "green" -> "#00FF00";
            case "red" -> "#FF0000";
            default -> "#000000";
        };
    }

    
        public ArrayList<String> load(){
        ArrayList<String> comandos = new ArrayList<>();
        JFileChooser seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.setApproveButtonText("Guardar");
        seleccionarArchivo.showSaveDialog(null);
        
        FileReader archivo;
        BufferedReader lectorArchivo;

        
        try {
            archivo = new FileReader(seleccionarArchivo.getSelectedFile());
            if (archivo.ready()){
                lectorArchivo = new BufferedReader(archivo);
                String cadena;
                while((cadena = lectorArchivo.readLine()) != null){
                comandos.add(cadena);
            }
                System.out.println(comandos);
            return comandos;
            }
        } catch (Exception e) {
        }
        return null;
    }
        
    public void save(ArrayList<String> comandos){

        JFileChooser guardarComo = new JFileChooser();
        guardarComo.setApproveButtonText("Guardar");
        guardarComo.showSaveDialog(null);
        File f;
        FileWriter escritorArchivo;
        f = new File(guardarComo.getSelectedFile()+".txt");
        
        try {
            escritorArchivo = new FileWriter(f);
            
            BufferedWriter bw = new BufferedWriter(escritorArchivo);
            PrintWriter salida = new PrintWriter(bw);
            for(String comando: comandos){
                salida.write(comando+'\n');
            }
            salida.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * @return the intrucciones
     */
    public ArrayList<String> getIntrucciones() {
        return intrucciones;
    }

    
    
    
}
