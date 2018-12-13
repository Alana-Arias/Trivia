
package appproyecto;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmJuego extends javax.swing.JFrame {

            Juego jug1 = new Juego();
            Juego jug2 = new Juego();
            boolean alternar=true;
            Pregunta pregunta;
            private static int cantidadPre=0;
            Jugador jug;
            String jugador1;
            String jugador2;  
            
    public FrmJuego() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/appproyecto/logo proyecto2.jpg")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGrpRespuestas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLblNomJugador1 = new javax.swing.JLabel();
        jTxtNomJug1 = new javax.swing.JTextField();
        jBtnNomJug1 = new javax.swing.JButton();
        jLblCategoria1 = new javax.swing.JLabel();
        jCboCatJug1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLblNomJugador2 = new javax.swing.JLabel();
        jTxtNomJug2 = new javax.swing.JTextField();
        jBtnNomJug2 = new javax.swing.JButton();
        jLblCategoria2 = new javax.swing.JLabel();
        jCboCatJug2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTxtPregunta = new javax.swing.JTextField();
        jBtnVerificarRespuesta = new javax.swing.JButton();
        jCboRespuestas = new javax.swing.JComboBox<>();
        jLblTurnos = new javax.swing.JLabel();
        jBtnEmpezarPreguntas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxAGanadores = new javax.swing.JTextArea();
        jBtnJuegoNuevo = new javax.swing.JButton();
        jBtnCalificaciones = new javax.swing.JButton();
        jBtnRendirse = new javax.swing.JButton();
        jBtnSalir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Juego Trivia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jugador 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 13), new java.awt.Color(153, 0, 0))); // NOI18N

        jLblNomJugador1.setText("Nombre ");

        jTxtNomJug1.setToolTipText("Debe Ingresar el nombre del jugador 1");

        jBtnNomJug1.setText("Aceptar");
        jBtnNomJug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNomJug1ActionPerformed(evt);
            }
        });

        jLblCategoria1.setText("Categoría");

        jCboCatJug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboCatJug1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnNomJug1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLblNomJugador1)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtNomJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblCategoria1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCboCatJug1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNomJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNomJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCategoria1)
                    .addComponent(jCboCatJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnNomJug1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jugador 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 13), new java.awt.Color(153, 0, 0))); // NOI18N

        jLblNomJugador2.setText("Nombre ");

        jTxtNomJug2.setToolTipText("Debe ingresar el nombre del jugador 2");

        jBtnNomJug2.setText("Aceptar");
        jBtnNomJug2.setEnabled(false);
        jBtnNomJug2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNomJug2ActionPerformed(evt);
            }
        });

        jLblCategoria2.setText("Categoría");

        jCboCatJug2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboCatJug2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnNomJug2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLblNomJugador2)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtNomJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLblCategoria2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCboCatJug2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNomJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNomJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCategoria2)
                    .addComponent(jCboCatJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnNomJug2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        jTxtPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPreguntaActionPerformed(evt);
            }
        });

        jBtnVerificarRespuesta.setText("Verficar");
        jBtnVerificarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarRespuestaActionPerformed(evt);
            }
        });

        jLblTurnos.setText("Turno");

        jBtnEmpezarPreguntas.setText("Empezar");
        jBtnEmpezarPreguntas.setEnabled(false);
        jBtnEmpezarPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEmpezarPreguntasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jCboRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnVerificarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jBtnEmpezarPreguntas)))
                    .addComponent(jLblTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCboRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnVerificarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEmpezarPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTxAGanadores.setColumns(20);
        jTxAGanadores.setRows(5);
        jScrollPane1.setViewportView(jTxAGanadores);

        jBtnJuegoNuevo.setText("Volver a Jugar");
        jBtnJuegoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnJuegoNuevoActionPerformed(evt);
            }
        });

        jBtnCalificaciones.setText("Tabla Calificaciones");
        jBtnCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalificacionesActionPerformed(evt);
            }
        });

        jBtnRendirse.setText("Rendirse");
        jBtnRendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRendirseActionPerformed(evt);
            }
        });

        jBtnSalir2.setText("Salir del Juego");
        jBtnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnJuegoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRendirse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnCalificaciones, jBtnJuegoNuevo, jBtnRendirse});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jBtnCalificaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnRendirse)
                        .addGap(62, 62, 62)
                        .addComponent(jBtnJuegoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jBtnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnCalificaciones, jBtnJuegoNuevo, jBtnRendirse});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNomJug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNomJug1ActionPerformed
        jugador1=jTxtNomJug1.getText();
         int indice=jCboCatJug1.getSelectedIndex();
         if(jugador1.matches("[\\w]+")){
            JOptionPane.showMessageDialog(null, "Nombre jugador uno válido");
        
        }
        else{
            jTxtNomJug1.requestFocus();
            jTxtNomJug1.selectAll();
        }
        
        if(indice>=0){
            JOptionPane.showMessageDialog(null, jCboCatJug1.getSelectedItem());
            JOptionPane.showMessageDialog(null, "Recuerde, que no pueden seleccionar la misma categoria");
            jBtnNomJug1.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna categoria");
        }
         jBtnNomJug2.setEnabled(true);
         jTxtNomJug2.requestFocus();
    }//GEN-LAST:event_jBtnNomJug1ActionPerformed

    private void jBtnNomJug2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNomJug2ActionPerformed
        jugador2=jTxtNomJug2.getText();
        int indice=jCboCatJug2.getSelectedIndex();
        if(jugador2.matches("[\\w]+")){
         JOptionPane.showMessageDialog(null, "Nombre jugador dos válido");          
        }
        else{
            jTxtNomJug2.requestFocus();
            jTxtNomJug2.selectAll();
        }
        
        if(indice>=0){
            JOptionPane.showMessageDialog(null, jCboCatJug2.getSelectedItem());  
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna categoria");           
        }  
        
        JOptionPane.showMessageDialog(null, "Debe seleccionar el botón Empezar, para iniciar el juego");
        jBtnEmpezarPreguntas.setEnabled(true);
    }//GEN-LAST:event_jBtnNomJug2ActionPerformed

    private void jCboCatJug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboCatJug1ActionPerformed
    
    }//GEN-LAST:event_jCboCatJug1ActionPerformed

    private void jCboCatJug2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboCatJug2ActionPerformed
     
    }//GEN-LAST:event_jCboCatJug2ActionPerformed

    private void jBtnCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalificacionesActionPerformed
            jTxAGanadores.setText("");
            jTxAGanadores.setText("El puntaje de " + jTxtNomJug1.getText() +   
                    " es de: " + String.valueOf(jug2.getPuntajeP())+"\n"+
                    "El puntaje de " + jTxtNomJug2.getText() +   
                    " es de: " + String.valueOf(jug1.getPuntajeP())
            );
        
    }//GEN-LAST:event_jBtnCalificacionesActionPerformed

    private void jBtnRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRendirseActionPerformed
        if(alternar){
            JOptionPane.showMessageDialog(null, "El ganador es " + jugador1);
            jug2.ganador(jugador2);
            jTxAGanadores.setText(jug2.toString());
        }
        else{
            JOptionPane.showMessageDialog(null, "El ganador es " + jugador2);
            jug1.ganador(jugador1);
            jTxAGanadores.setText(jug.toString());
        }
        jBtnJuegoNuevo.doClick();
        
    }//GEN-LAST:event_jBtnRendirseActionPerformed

    private void jBtnJuegoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnJuegoNuevoActionPerformed
        jTxtNomJug1.setText("");
        jTxtNomJug2.setText("");
        jTxtPregunta.setText("");
        jTxAGanadores.setText("");
        jCboCatJug1.setSelectedIndex(-1);
        jCboCatJug2.setSelectedIndex(-1);
        jCboRespuestas.removeAllItems();
        jTxtNomJug1.requestFocus();
        jBtnEmpezarPreguntas.setEnabled(false);
        jBtnNomJug2.setEnabled(false);
        
        FrmBienvenida frmBienvenida = new FrmBienvenida();
        frmBienvenida.setLocationRelativeTo(null);
        frmBienvenida.setVisible(true);      
    }//GEN-LAST:event_jBtnJuegoNuevoActionPerformed

    private void jTxtPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPreguntaActionPerformed
        
    }//GEN-LAST:event_jTxtPreguntaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Categoria [] cat=jug1.getCat();
        for(Categoria cat1: cat){
            jCboCatJug1.addItem(cat1.getNombre());
        }
        jCboCatJug1.setSelectedIndex(-1);        
         
        for(Categoria cat1: cat){
            jCboCatJug2.addItem(cat1.getNombre());
        }
        jCboCatJug2.setSelectedIndex(-1);
    }//GEN-LAST:event_formWindowOpened

    private void jBtnEmpezarPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEmpezarPreguntasActionPerformed
       
        String [] boton= new String[3];
        cantidadPre++;
       if(cantidadPre<=10){
          if(alternar){
            pregunta= jug1.enviarPregunta(jCboCatJug1.getSelectedIndex());
            jTxtPregunta.setText(pregunta.getPregunta());
            boton= pregunta.getRespuestas();  
            jLblTurnos.setText(jugador1);
              for (String boton1 : boton) {
                  jCboRespuestas.addItem(boton1);
              }
            alternar=false;
        }
        else{
            pregunta= jug2.enviarPregunta(jCboCatJug2.getSelectedIndex());
            jTxtPregunta.setText(pregunta.getPregunta());
            boton= pregunta.getRespuestas();  
            jLblTurnos.setText(jugador2);
            for (String boton1 : boton) {
                jCboRespuestas.addItem(boton1);
              }
            alternar=true;
        }
        
       }
         
        if(cantidadPre==10){
           if(jug1.getCorrectas()==jug2.getCorrectas()){
               jug1.ganador(jugador1);
               jug2.ganador(jugador2);
               JOptionPane.showMessageDialog(null, "Hubo un empate");
           }
           else{
               if(jug1.getCorrectas()>jug2.getCorrectas()){
                    jug1.ganador(jugador1);
                    JOptionPane.showMessageDialog(null, "El ganador fue " + jugador1);
               }
               else{                  
                   jug2.ganador(jugador2);
                   JOptionPane.showMessageDialog(null, "El ganador fue " + jugador2);
               }
            }
        }
        
    }//GEN-LAST:event_jBtnEmpezarPreguntasActionPerformed

    private void jBtnVerificarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarRespuestaActionPerformed
       int indice=jCboRespuestas.getSelectedIndex();
       
        if(indice>-1){
            if(alternar){
            JOptionPane.showMessageDialog(null, (jug1.respuestaCorrecta(indice)==true?"Respuesta Correcta": "Respuesta Incorrecta"));
            jCboRespuestas.removeAllItems();
            jBtnEmpezarPreguntas.doClick();            
            jCboRespuestas.requestFocus();
            alternar=false;
            }
            else{
              JOptionPane.showMessageDialog(null, (jug2.respuestaCorrecta(indice)==true?"Respuesta Correcta": "Respuesta Incorrecta"));
              jCboRespuestas.removeAllItems();
              jBtnEmpezarPreguntas.doClick();
              jCboRespuestas.requestFocus(); 
              alternar=true;
            }
        }
    }//GEN-LAST:event_jBtnVerificarRespuestaActionPerformed

    private void jBtnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalir2ActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por escogernos");
        System.exit(0);
        
    }//GEN-LAST:event_jBtnSalir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCalificaciones;
    private javax.swing.JButton jBtnEmpezarPreguntas;
    private javax.swing.JButton jBtnJuegoNuevo;
    private javax.swing.JButton jBtnNomJug1;
    private javax.swing.JButton jBtnNomJug2;
    private javax.swing.JButton jBtnRendirse;
    private javax.swing.JButton jBtnSalir2;
    private javax.swing.JButton jBtnVerificarRespuesta;
    private javax.swing.JComboBox<String> jCboCatJug1;
    private javax.swing.JComboBox<String> jCboCatJug2;
    private javax.swing.JComboBox<String> jCboRespuestas;
    private javax.swing.ButtonGroup jGrpRespuestas;
    private javax.swing.JLabel jLblCategoria1;
    private javax.swing.JLabel jLblCategoria2;
    private javax.swing.JLabel jLblNomJugador1;
    private javax.swing.JLabel jLblNomJugador2;
    private javax.swing.JLabel jLblTurnos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxAGanadores;
    private javax.swing.JTextField jTxtNomJug1;
    private javax.swing.JTextField jTxtNomJug2;
    private javax.swing.JTextField jTxtPregunta;
    // End of variables declaration//GEN-END:variables
}
