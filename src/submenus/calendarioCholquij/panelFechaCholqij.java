/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus.calendarioCholquij;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import principal.backend.calendari_cholquij.calcular_fecha.CalcularFecha;

/**
 *
 * @author Esmeralda
 */
public class panelFechaCholqij extends javax.swing.JPanel {

    /**
     * Creates new form fechaCholqij
     */
    public panelFechaCholqij() {
        initComponents();
        //fondo panel
        Imagen img = new Imagen();
        this.add(img);
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFechaActual2 = new javax.swing.JLabel();
        lblImgEnergia = new javax.swing.JLabel();
        lblTitulop = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        dateFechaBuscar = new com.toedter.calendar.JDateChooser();
        lblFechaActual1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblImgCC = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblFechaActual2.setFont(new java.awt.Font("Lobster", 0, 36)); // NOI18N
        lblFechaActual2.setForeground(new java.awt.Color(255, 102, 0));
        lblFechaActual2.setText("Energia");

        lblImgEnergia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgEnergia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulop.setFont(new java.awt.Font("Jenna Sue", 1, 50)); // NOI18N
        lblTitulop.setForeground(new java.awt.Color(204, 0, 102));
        lblTitulop.setText("CALCULAR FECHA CHOLQ'IJ");

        lblFechaActual.setFont(new java.awt.Font("Jenna Sue", 1, 36)); // NOI18N
        lblFechaActual.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaActual.setText("Fecha Actual: ");

        lblFechaActual1.setFont(new java.awt.Font("Lobster", 0, 36)); // NOI18N
        lblFechaActual1.setForeground(new java.awt.Color(255, 102, 0));
        lblFechaActual1.setText("Calendario Cholq'ij");

        btnCalcular.setBackground(new java.awt.Color(255, 255, 204));
        btnCalcular.setFont(new java.awt.Font("Jenna Sue", 1, 36)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblImgCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgCC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(lblTitulop))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaActual)
                                    .addComponent(dateFechaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImgCC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImgEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaActual1)
                            .addComponent(lblFechaActual2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulop)
                .addGap(25, 25, 25)
                .addComponent(lblFechaActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateFechaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFechaActual1)
                                .addGap(121, 121, 121)
                                .addComponent(lblFechaActual2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImgCC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblImgEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public class Imagen extends javax.swing.JPanel {

        ImageIcon BG = new ImageIcon("src/submenus/perfilUsuario/imagenesPerfilUsuario/fondoPerfil.jpg");

        public Imagen() {
            this.setSize(1300, 650);
        }

        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();

            grafico.drawImage(BG.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

        if (!dateFechaBuscar.isValid() || dateFechaBuscar.getDate()==null) {
            System.out.println("no se ejecuto fecha invalida");
        } else {
            ManejadorCalcular manejadorCalcular = ManejadorCalcular.getInstancia();
            lblImgCC.setIcon(manejadorCalcular.getIcon(nahual(timeCholqij(dateFechaBuscar.getCalendar().getTime().getTime()))));
            lblImgEnergia.setIcon(manejadorCalcular.getIconLvl(nivel(timeCholqij(dateFechaBuscar.getCalendar().getTime().getTime()))));

        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    public int nahual(int cont) {
        System.out.println("Contador " + cont);
        int contador = cont;
        int contadorNahual = 6;
        if (contador < 0) {
            while (contador != 0) {
                if (contadorNahual == 20) {
                    contadorNahual = 1;
                } else {
                    contadorNahual++;
                }
                contador++;
            }
            return contadorNahual;
        }
        while (contador != 0) {
            if (contadorNahual == 1) {
                contadorNahual = 20;
            } else {
                contadorNahual--;
            }
            contador--;
        }
        return contadorNahual;

    }

    public int nivel(int cont) {
        System.out.println("Contador " + cont);
        int contador = cont;
        int contadorNahual = 4;
        if (contador < 0) {
            while (contador != 0) {
                if (contadorNahual == 13) {
                    contadorNahual = 1;
                } else {
                    contadorNahual++;
                }
                contador++;
            }
            return contadorNahual;
        }
        while (contador != 0) {
            if (contadorNahual == 1) {
                contadorNahual = 13;
            } else {
                contadorNahual--;
            }
            contador--;
        }
        return contadorNahual;

    }

    public int timeCholqij(long date) {
        try {
            String string = "Nov 15, 2020 00:00:00 AM";
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.ROOT);
            Date datePivote = sdf.parse(string);
//            System.out.println("DATE PIVOTE " + datePivote);
            long regresar = TimeUnit.DAYS.convert(datePivote.getTime() - date, TimeUnit.MILLISECONDS);
            return (int) regresar;
        } catch (ParseException ex) {
            Logger.getLogger(CalcularFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private com.toedter.calendar.JDateChooser dateFechaBuscar;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblFechaActual1;
    private javax.swing.JLabel lblFechaActual2;
    private javax.swing.JLabel lblImgCC;
    private javax.swing.JLabel lblImgEnergia;
    private javax.swing.JLabel lblTitulop;
    // End of variables declaration//GEN-END:variables
}
