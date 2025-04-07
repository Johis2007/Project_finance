package FinanzasEducativas.igu;

import java.awt.event.ActionListener;

public class CargarDato extends javax.swing.JFrame implements ActionListener {

    public CargarDato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo1 = new javax.swing.JPanel();
        TextTitulo = new javax.swing.JLabel();
        ImagFinanzas = new javax.swing.JLabel();
        Fodo2 = new javax.swing.JPanel();
        TextNombre = new javax.swing.JLabel();
        TextApellido = new javax.swing.JLabel();
        TextEdad = new javax.swing.JLabel();
        TextBarrio = new javax.swing.JLabel();
        TextProfesion = new javax.swing.JLabel();
        TextNcel = new javax.swing.JLabel();
        TextCelectronico = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        CmbEdad = new javax.swing.JComboBox<>();
        CmboxBarrio = new javax.swing.JComboBox<>();
        textProfesion = new javax.swing.JTextField();
        textNumeroCel = new javax.swing.JTextField();
        textCorreo = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextTitulo.setFont(new java.awt.Font("Footlight MT Light", 0, 36)); // NOI18N
        TextTitulo.setForeground(new java.awt.Color(0, 0, 0));
        TextTitulo.setText("Carga De Datos");

        ImagFinanzas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanzasEducativas/igu/images.jpg"))); // NOI18N
        ImagFinanzas.setText("jLabel3");

        TextNombre.setText("Nombres:");

        TextApellido.setText("Apellidos:");

        TextEdad.setText("Edad:");

        TextBarrio.setText("Barrio:");

        TextProfesion.setText("Profesión:");

        TextNcel.setText("Numero Cel:");

        TextCelectronico.setText("Correo Electronico:");

        textNombre.addActionListener(this);

        textApellido.addActionListener(this);

        CmbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "De 5 a 10", "De 11 a 15", "De 16 a 18", "De 19 a 24", "Mayor de 25" }));

        CmboxBarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Compartir", "Soacha Central", "Danubio", "Ciudad Verde", "Hogares Soacha", "Ciudad Latina", "La Despensa ", "Cazucá ", "San Mateo", "Ducales", "San Humberto ", "Santa Ana Sur", "Torrentes", "Villa Italia", "Villa Luz", "Tucanes", "El Trébol", "Hogar del Sol", "Juan Pablo I", "La María", "León XIII", "Los Olivares", "Los Olivos", "Ocales", "Pablo VI", "Paseo de Rosales", "Potrero Grande", "Rincón de Santa Fe", "Balcanes", "Carlos Pizarro", "Casaloma", "El Arroyo", "El Progreso", "El Oasis", "Jaime Garzón", "Julio Rincón", "La Esperanza Sur ", "La Isla" }));

        textProfesion.addActionListener(this);

        textNumeroCel.addActionListener(this);

        textCorreo.addActionListener(this);

        BotonLimpiar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(this);

        ButtonGuardar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addActionListener(this);

        javax.swing.GroupLayout Fodo2Layout = new javax.swing.GroupLayout(Fodo2);
        Fodo2.setLayout(Fodo2Layout);
        Fodo2Layout.setHorizontalGroup(
            Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fodo2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fodo2Layout.createSequentialGroup()
                        .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fodo2Layout.createSequentialGroup()
                        .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Fodo2Layout.createSequentialGroup()
                                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fodo2Layout.createSequentialGroup()
                                .addComponent(TextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textProfesion)
                            .addGroup(Fodo2Layout.createSequentialGroup()
                                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CmboxBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(61, 61, 61))
            .addGroup(Fodo2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Fodo2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TextNcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNumeroCel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fodo2Layout.createSequentialGroup()
                        .addComponent(TextCelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCorreo)
                            .addGroup(Fodo2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fodo2Layout.setVerticalGroup(
            Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fodo2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextApellido))
                .addGap(9, 9, 9)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextEdad)
                    .addComponent(CmbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmboxBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextProfesion)
                    .addComponent(textProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNcel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumeroCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCelectronico)
                    .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(Fodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout Fondo1Layout = new javax.swing.GroupLayout(Fondo1);
        Fondo1.setLayout(Fondo1Layout);
        Fondo1Layout.setHorizontalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(TextTitulo))
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Fodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fondo1Layout.setVerticalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TextTitulo)
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(ImagFinanzas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fodo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == textNombre) {
            CargarDato.this.textNombreActionPerformed(evt);
        }
        else if (evt.getSource() == textApellido) {
            CargarDato.this.textApellidoActionPerformed(evt);
        }
        else if (evt.getSource() == textProfesion) {
            CargarDato.this.textProfesionActionPerformed(evt);
        }
        else if (evt.getSource() == textNumeroCel) {
            CargarDato.this.textNumeroCelActionPerformed(evt);
        }
        else if (evt.getSource() == textCorreo) {
            CargarDato.this.textCorreoActionPerformed(evt);
        }
        else if (evt.getSource() == BotonLimpiar) {
            CargarDato.this.BotonLimpiarActionPerformed(evt);
        }
        else if (evt.getSource() == ButtonGuardar) {
            CargarDato.this.ButtonGuardarActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void textApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorreoActionPerformed

    private void textNumeroCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumeroCelActionPerformed

    private void textProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProfesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProfesionActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed

        textNombre.setText("");
        textApellido.setText("");
        CmbEdad.setSelectedIndex(0);
        CmboxBarrio.setSelectedIndex(0);
        textProfesion.setText("");
        textNumeroCel.setText("");
        textCorreo.setText("");
        
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonLimpiar;
    public javax.swing.JButton ButtonGuardar;
    public javax.swing.JComboBox<String> CmbEdad;
    public javax.swing.JComboBox<String> CmboxBarrio;
    public javax.swing.JPanel Fodo2;
    public javax.swing.JPanel Fondo1;
    public javax.swing.JLabel ImagFinanzas;
    public javax.swing.JLabel TextApellido;
    public javax.swing.JLabel TextBarrio;
    public javax.swing.JLabel TextCelectronico;
    public javax.swing.JLabel TextEdad;
    public javax.swing.JLabel TextNcel;
    public javax.swing.JLabel TextNombre;
    public javax.swing.JLabel TextProfesion;
    public javax.swing.JLabel TextTitulo;
    public javax.swing.JTextField textApellido;
    public javax.swing.JTextField textCorreo;
    public javax.swing.JTextField textNombre;
    public javax.swing.JTextField textNumeroCel;
    public javax.swing.JTextField textProfesion;
    // End of variables declaration//GEN-END:variables
}
