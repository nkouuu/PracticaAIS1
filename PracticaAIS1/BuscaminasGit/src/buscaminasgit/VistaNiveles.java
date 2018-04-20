/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasgit;

//import Modelo.Empresa;

import java.awt.Frame;
import javax.swing.JFrame;


/**
 *
 * @author Diegomendez1997
 */
public class VistaNiveles extends javax.swing.JFrame {
    private static final int ANCHO = 350;
    private static final int ALTO = 350;
    
    private static BuscaminasGit buscaminas;
    
    /**
     * Creates new form PrincipalAlternativa
     */
    public VistaNiveles() {
        initComponents();
        
        //this.buscaminas = new BuscaminasGit();
        
        this.setSize(ANCHO, ALTO);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(HIDE_ON_CLOSE );

        //this.setDefaultCloseOperation();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nivelPrincipianteButton = new javax.swing.JButton();
        nivelntermedioButton = new javax.swing.JButton();
        nivelExpertoButton = new javax.swing.JButton();
        nivelPersonalizadoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccionar Nivel");
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        nivelPrincipianteButton.setText("Principiante");
        nivelPrincipianteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelPrincipianteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nivelPrincipianteButton);

        nivelntermedioButton.setText("Intermedio");
        nivelntermedioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelntermedioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nivelntermedioButton);

        nivelExpertoButton.setText("Experto");
        nivelExpertoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelExpertoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nivelExpertoButton);

        nivelPersonalizadoButton.setText("Personalizado");
        nivelPersonalizadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelPersonalizadoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nivelPersonalizadoButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nivelPrincipianteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelPrincipianteButtonActionPerformed
            
        /* Creamos 3 variables para detectar qué partida ha comenzado el usuario , si es Principiante, Avanzado o Experto.*/
        
            int n = 10;
            int m = 10;
            int nomines = 10;
            buscaminas = new BuscaminasGit(n,m,nomines);
            this.setVisible(false);
          //buscaminas.setVisible(true);
            
    }//GEN-LAST:event_nivelPrincipianteButtonActionPerformed

    private void nivelntermedioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelntermedioButtonActionPerformed
            
        /* Creamos 3 variables para detectar qué partida ha comenzado el usuario , si es Principiante, Avanzado o Experto.*/
        
            int n = 16;
            int m = 16;
            int nomines = 40;
            buscaminas = new BuscaminasGit(n,m,nomines);
            this.setVisible(false);
    }//GEN-LAST:event_nivelntermedioButtonActionPerformed

    private void nivelExpertoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelExpertoButtonActionPerformed
            
        /* Creamos 3 variables para detectar qué partida ha comenzado el usuario , si es Principiante, Avanzado o Experto.*/
        
            int n = 32;
            int m = 16;
            int nomines = 99;
            buscaminas = new BuscaminasGit(n,m,nomines);
            this.setVisible(false);
    }//GEN-LAST:event_nivelExpertoButtonActionPerformed

    private void nivelPersonalizadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelPersonalizadoButtonActionPerformed
            VistaNivelPersonalizado vistaNivelPersonalizado = new VistaNivelPersonalizado();
            vistaNivelPersonalizado.setVisible(true);
            this.setVisible(false);
            
            
    }//GEN-LAST:event_nivelPersonalizadoButtonActionPerformed
/**/
    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton nivelExpertoButton;
    private javax.swing.JButton nivelPersonalizadoButton;
    private javax.swing.JButton nivelPrincipianteButton;
    private javax.swing.JButton nivelntermedioButton;
    // End of variables declaration//GEN-END:variables
}
