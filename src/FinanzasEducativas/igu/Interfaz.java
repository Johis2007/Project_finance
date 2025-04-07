/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FinanzasEducativas.igu;

import java.awt.event.ActionListener;

public class Interfaz extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo0 = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        fondo1 = new javax.swing.JPanel();
        BtonCargarDatos = new javax.swing.JButton();
        BtonDatos = new javax.swing.JButton();
        BtonSalir = new javax.swing.JButton();
        img1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textTitulo.setFont(new java.awt.Font("Footlight MT Light", 0, 36)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(204, 204, 0));
        textTitulo.setText("Finanzas Educativas");

        BtonCargarDatos.setText("Cargar Datos");
        BtonCargarDatos.addActionListener(this);

        BtonDatos.setText("Ver Datos");
        BtonDatos.addActionListener(this);

        BtonSalir.setText("Salir");
        BtonSalir.addActionListener(this);

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtonDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtonCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BtonCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BtonDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanzasEducativas/igu/images.jpg"))); // NOI18N
        img1.setText("jLabel3");

        javax.swing.GroupLayout Fondo0Layout = new javax.swing.GroupLayout(Fondo0);
        Fondo0.setLayout(Fondo0Layout);
        Fondo0Layout.setHorizontalGroup(
            Fondo0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo0Layout.createSequentialGroup()
                .addGroup(Fondo0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo0Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fondo0Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(textTitulo)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        Fondo0Layout.setVerticalGroup(
            Fondo0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo0Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(textTitulo)
                .addGap(51, 51, 51)
                .addGroup(Fondo0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img1))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == BtonCargarDatos) {
            Interfaz.this.BtonCargarDatosActionPerformed(evt);
        }
        else if (evt.getSource() == BtonDatos) {
            Interfaz.this.BtonDatosActionPerformed(evt);
        }
        else if (evt.getSource() == BtonSalir) {
            Interfaz.this.BtonSalirActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void BtonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonDatosActionPerformed
       
        
        
    }//GEN-LAST:event_BtonDatosActionPerformed

    private void BtonCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonCargarDatosActionPerformed
       
       CargarDato pantalla = new CargarDato();
       pantalla.setVisible(true);
       pantalla.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BtonCargarDatosActionPerformed

    private void BtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonSalirActionPerformed
        
        
        
        
    }//GEN-LAST:event_BtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtonCargarDatos;
    public javax.swing.JButton BtonDatos;
    public javax.swing.JButton BtonSalir;
    public javax.swing.JPanel Fondo0;
    public javax.swing.JPanel fondo1;
    public javax.swing.JLabel img1;
    public javax.swing.JLabel textTitulo;
    // End of variables declaration//GEN-END:variables
}
