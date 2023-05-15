/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.autonoma.GuiLogo;

import co.edu.autonoma.classLogo.Controlador;
import co.edu.autonoma.classLogo.Drawable;
import co.edu.autonoma.classLogo.LectorinstruccionesTortuga;
import co.edu.autonoma.classLogo.Tablero;
import co.edu.autonoma.classLogo.Tortuga;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Window extends javax.swing.JFrame implements Drawable{
    private LectorinstruccionesTortuga LectorInstrucciones;
    private Tablero tablero;
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        
    }
    
   public void setLector(LectorinstruccionesTortuga lector){
        this.LectorInstrucciones=lector;
    }
    
    public void setTablero(Tablero tablero){
        this.tablero=tablero;
        tablero.setDrawable(this);
    }
    
    public void setLectorInstrucciones(LectorinstruccionesTortuga LectorInstrucciones) {
        this.LectorInstrucciones = LectorInstrucciones;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtComandos = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnInstrucciones.setText("Lista instrucciones");
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });

        jButton4.setText("Cargar archivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(txtComandos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInstrucciones)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnInstrucciones)
                    .addComponent(jButton4))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
    listaInstrucciones lista  = new listaInstrucciones(this, true, LectorInstrucciones.getIntrucciones());
        System.out.println(LectorInstrucciones.getIntrucciones());
        lista.llenar();
        lista.setVisible(true);
    }//GEN-LAST:event_btnInstruccionesActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            if(!LectorInstrucciones.read(txtComandos.getText())){
            JOptionPane.showMessageDialog(rootPane, "Ingrese una opcion correcta");
        }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese la cantidad");
        }
        txtComandos.setText("");
    }//GEN-LAST:event_btnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Window window = new Window();
        Tablero tablero = new Tablero(window.getWidth(), window.getHeight());
        LectorinstruccionesTortuga Lector= new LectorinstruccionesTortuga(tablero.getControlador());
        window.setLector(Lector);
        window.setTablero(tablero);
        window.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField txtComandos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void redraw() {
        repaint();
    }


}
