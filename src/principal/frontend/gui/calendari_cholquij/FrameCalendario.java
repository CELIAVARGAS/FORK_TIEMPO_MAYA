/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.frontend.gui.calendari_cholquij;

import principal.backend.calendari_cholquij.calcular_fecha.CalcularFecha;
import principal.backend.manejadores.ManejadorInformacion;
import principal.frontend.gui.calendari_cholquij.matriz.matrizCholquijFrame;

/**
 *
 * @author bryangmz
 */
public class FrameCalendario extends javax.swing.JFrame {

    private matrizCholquijFrame frame;
    private final ManejadorInformacion manejadorInformacion = ManejadorInformacion.getInstancia();
    
    /**
     * Creates new form FrameCalendario
     */
    public FrameCalendario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnCalendarioCalcularFecha = new javax.swing.JButton();
        btnNahual = new javax.swing.JButton();
        btnMatrizCalendario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnFormasDeContar = new javax.swing.JButton();
        btnInfCalendarioCholquij = new javax.swing.JButton();
        btnCalendarioLunar = new javax.swing.JButton();
        btnDias = new javax.swing.JButton();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("CALENDARIO CHOLQ'IJ");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 470, 70));

        btnCalendarioCalcularFecha.setBackground(new java.awt.Color(51, 51, 51));
        btnCalendarioCalcularFecha.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnCalendarioCalcularFecha.setForeground(new java.awt.Color(204, 204, 204));
        btnCalendarioCalcularFecha.setText("Calcular Fecha Cholq'ij");
        btnCalendarioCalcularFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioCalcularFechaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalendarioCalcularFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 330, -1));

        btnNahual.setBackground(new java.awt.Color(51, 51, 51));
        btnNahual.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnNahual.setForeground(new java.awt.Color(204, 204, 204));
        btnNahual.setText("Nahual - Energia Cholq'ij");
        btnNahual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNahualActionPerformed(evt);
            }
        });
        getContentPane().add(btnNahual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 330, -1));

        btnMatrizCalendario.setBackground(new java.awt.Color(51, 51, 51));
        btnMatrizCalendario.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        btnMatrizCalendario.setForeground(new java.awt.Color(204, 204, 204));
        btnMatrizCalendario.setText("Informacion Cholq'ij (Matriz)");
        btnMatrizCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizCalendarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnMatrizCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/frontend/gui/calendari_cholquij/Portada.png"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 900, 600));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFormasDeContar.setBackground(new java.awt.Color(204, 204, 204));
        btnFormasDeContar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnFormasDeContar.setForeground(new java.awt.Color(0, 0, 0));
        btnFormasDeContar.setText("Formas de Contar");
        btnFormasDeContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormasDeContarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFormasDeContar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, -1));

        btnInfCalendarioCholquij.setBackground(new java.awt.Color(204, 204, 204));
        btnInfCalendarioCholquij.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnInfCalendarioCholquij.setForeground(new java.awt.Color(0, 0, 0));
        btnInfCalendarioCholquij.setText("Calendario Cholq'ij (Informacion)");
        btnInfCalendarioCholquij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfCalendarioCholquijActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfCalendarioCholquij, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        btnCalendarioLunar.setBackground(new java.awt.Color(204, 204, 204));
        btnCalendarioLunar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCalendarioLunar.setForeground(new java.awt.Color(0, 0, 0));
        btnCalendarioLunar.setText("Calendario Lunar");
        btnCalendarioLunar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioLunarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalendarioLunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        btnDias.setBackground(new java.awt.Color(204, 204, 204));
        btnDias.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnDias.setForeground(new java.awt.Color(0, 0, 0));
        btnDias.setText("Dias");
        btnDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiasActionPerformed(evt);
            }
        });
        jPanel1.add(btnDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalendarioCalcularFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioCalcularFechaActionPerformed
        // TODO add your handling code here:
        CalcularFecha calcularFecha = new CalcularFecha(this, true);
        calcularFecha.setVisible(true);
    }//GEN-LAST:event_btnCalendarioCalcularFechaActionPerformed

    private void btnMatrizCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizCalendarioActionPerformed
        // TODO add your handling code here:
        if (frame == null) {
            frame = new matrizCholquijFrame();
        }
        frame.setVisible(true);
    }//GEN-LAST:event_btnMatrizCalendarioActionPerformed

    private void btnNahualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNahualActionPerformed
        // TODO add your handling code here:
        CholqijFrame cholqijFrame = new CholqijFrame();
        cholqijFrame.setVisible(true);
    }//GEN-LAST:event_btnNahualActionPerformed

    private void btnInfCalendarioCholquijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfCalendarioCholquijActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostrarInfCholquij();
    }//GEN-LAST:event_btnInfCalendarioCholquijActionPerformed

    private void btnFormasDeContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormasDeContarActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostarInfFormasDeContar();
    }//GEN-LAST:event_btnFormasDeContarActionPerformed

    private void btnCalendarioLunarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioLunarActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostrarInfCalendarioLunar();
    }//GEN-LAST:event_btnCalendarioLunarActionPerformed

    private void btnDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiasActionPerformed
        // TODO add your handling code here:
         manejadorInformacion.mostrarInfDiasCholquij();
    }//GEN-LAST:event_btnDiasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalendarioCalcularFecha;
    private javax.swing.JButton btnCalendarioLunar;
    private javax.swing.JButton btnDias;
    private javax.swing.JButton btnFormasDeContar;
    private javax.swing.JButton btnInfCalendarioCholquij;
    private javax.swing.JButton btnMatrizCalendario;
    private javax.swing.JButton btnNahual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
