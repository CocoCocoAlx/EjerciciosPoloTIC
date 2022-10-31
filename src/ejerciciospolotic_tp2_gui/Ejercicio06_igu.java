/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejerciciospolotic_tp2_gui;

import java.awt.event.ItemEvent;

/**
 *
 * @author ivancillo
 */
public class Ejercicio06_igu extends javax.swing.JFrame {

    boolean esHerbivoro, esMamifero, esDomestico;

    /**
     * Creates new form Ejercicio06_igu
     */
    public Ejercicio06_igu() {
        initComponents();
        if (esHerbivoroBoton.isSelected() && esMamiferoBoton.isSelected()) {
            if (esDomesticoBoton.isSelected()) {
                veranimal.setText("el caballo.");
            } else {
                veranimal.setText("el alce.");
            }
        }
        if (!esHerbivoroBoton.isSelected() && esMamiferoBoton.isSelected()) {
            if (esDomesticoBoton.isSelected()) {
                veranimal.setText("el gato.");
            } else {
                veranimal.setText("el león.");
            }
        }
        if (!esHerbivoroBoton.isSelected() && !esMamiferoBoton.isSelected()) {
            if (esDomesticoBoton.isSelected()) {
                veranimal.setText("la pitón.");
            } else {
                veranimal.setText("el cóndor.");
            }
        }
        if (esHerbivoroBoton.isSelected() && !esMamiferoBoton.isSelected()) {
            if (esDomesticoBoton.isSelected()) {
                veranimal.setText("la tortuga.");
            } else {
                veranimal.setText("el caracol.");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        esMamiferoBoton = new javax.swing.JToggleButton();
        esDomesticoBoton = new javax.swing.JToggleButton();
        esHerbivoroBoton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        veranimal = new javax.swing.JLabel();

        jToggleButton2.setText("Sí/No");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        esMamiferoBoton.setText("Sí/No");
        esMamiferoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esMamiferoBotonActionPerformed(evt);
            }
        });

        esDomesticoBoton.setText("Sí/No");
        esDomesticoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esDomesticoBotonActionPerformed(evt);
            }
        });

        esHerbivoroBoton.setText("Sí/No");
        esHerbivoroBoton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                esHerbivoroBotonStateChanged(evt);
            }
        });
        esHerbivoroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esHerbivoroBotonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Tenés estos animales para elegir:\nAlce\tGato\nCaballo\tLeón\nCaracol\tPitón\nCóndor\tTortuga\nElegí un animal y respondé a estas preguntas\ny el programa te va a decir qué animal elegiste.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("¿Es herbívoro?");

        jLabel2.setText("¿Es mamífero?");

        jLabel3.setText("¿Es doméstico?");

        jLabel4.setText("El animal que elegiste es:");

        veranimal.setText("(animal)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(esDomesticoBoton)
                                    .addComponent(esMamiferoBoton)
                                    .addComponent(esHerbivoroBoton))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel5)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(veranimal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esHerbivoroBoton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esMamiferoBoton)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esDomesticoBoton)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(veranimal))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void esMamiferoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esMamiferoBotonActionPerformed
        if (esMamiferoBoton.isSelected()) {
            esMamifero = true;
        } else {
            esMamifero = false;
        }

    }//GEN-LAST:event_esMamiferoBotonActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void esDomesticoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esDomesticoBotonActionPerformed
        if (esDomesticoBoton.isSelected()) {
            esDomestico = true;
        } else {
            esDomestico = false;
        }
    }//GEN-LAST:event_esDomesticoBotonActionPerformed

    private void esHerbivoroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esHerbivoroBotonActionPerformed
        if (esHerbivoroBoton.isSelected()) {
            esHerbivoro = true;
        } else {
            esHerbivoro = false;
        }
    }//GEN-LAST:event_esHerbivoroBotonActionPerformed

    private void esHerbivoroBotonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_esHerbivoroBotonStateChanged
    }//GEN-LAST:event_esHerbivoroBotonStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_igu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_igu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_igu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio06_igu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio06_igu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton esDomesticoBoton;
    private javax.swing.JToggleButton esHerbivoroBoton;
    private javax.swing.JToggleButton esMamiferoBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel veranimal;
    // End of variables declaration//GEN-END:variables
}