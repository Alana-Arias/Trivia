
package appproyecto;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmBienvenida extends javax.swing.JFrame {

    public FrmBienvenida() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/appproyecto/logo proyecto2.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnReglas = new javax.swing.JButton();
        jBtnComenzarTrivia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnSalirJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Bienvenida");
        setBackground(new java.awt.Color(0, 51, 51));

        jBtnReglas.setText("Reglas de Juego");
        jBtnReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReglasActionPerformed(evt);
            }
        });

        jBtnComenzarTrivia.setText("Comenzar Trivia");
        jBtnComenzarTrivia.setEnabled(false);
        jBtnComenzarTrivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComenzarTriviaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appproyecto/Bienvenida.png"))); // NOI18N

        jBtnSalirJuego.setText("Salir del Juego");
        jBtnSalirJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnReglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnComenzarTrivia, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jBtnSalirJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnComenzarTrivia, jBtnReglas});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBtnComenzarTrivia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnReglas)
                .addGap(18, 18, 18)
                .addComponent(jBtnSalirJuego)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnComenzarTrivia, jBtnReglas, jBtnSalirJuego});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnComenzarTriviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComenzarTriviaActionPerformed
         FrmJuego frmJuego = new FrmJuego();
         frmJuego.setVisible(true);
         frmJuego.setLocationRelativeTo(null);
         frmJuego.setDefaultCloseOperation(frmJuego.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jBtnComenzarTriviaActionPerformed

    private void jBtnReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReglasActionPerformed
       JOptionPane.showMessageDialog(null, "1. El juego consta de 5 categorías debe seleccionar una única opción." 
                                    + "\n 2. Se debe seleccionar una respuesta definitiva."
                                    + "\n 3. El jugador que desea rendirse pierde automaticamente el juego."
                                    + "\n 4. El juego va alternando el turno de cada jugador, con sus preguntas segun la categoria escogida."
                                    + "\n 5. Gana el jugador con mas respuestas correctas."
                                    + "\n 6. Al finalizar el juego, los jugadores tienen la opcion de finalizar el juego, iniciar otra partida desde cero.");
       jBtnComenzarTrivia.setEnabled(true);
    }//GEN-LAST:event_jBtnReglasActionPerformed

    private void jBtnSalirJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirJuegoActionPerformed
        System.exit(0);
        JOptionPane.showMessageDialog(null, "Gracias por seleccionar este juego");
    }//GEN-LAST:event_jBtnSalirJuegoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnComenzarTrivia;
    private javax.swing.JButton jBtnReglas;
    private javax.swing.JButton jBtnSalirJuego;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
