/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus.calendarioHaab;

import java.awt.Dimension;
import java.awt.Graphics;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javax.swing.ImageIcon;
import modelos.database.FechaHaabDb;
import modelos.database.InformacionDb;
import modelos.database.Utilidades;
import modelos.objetos.FechaHaab;

/**
 *
 * @author Esmeralda
 */
public class menuCalendarioHaab extends javax.swing.JPanel {

    private Date fecha = Utilidades.LocalDateToDate(LocalDate.now());
    FechaHaabDb acceso = new FechaHaabDb();

    /**
     * Creates new form calendarioHaab
     */
    public menuCalendarioHaab() {
        initComponents();

        //fondo de pantalla
        Imagen img = new Imagen();
        this.add(img);
        this.repaint();

        InformacionDb accesoInf = new InformacionDb();
        boxDate.setDate(fecha);
        infHaab.setText(accesoInf.getInformacion("inf_haab_escritorio").getDescripcionEscritorio());
        infKinal.setText(accesoInf.getInformacion("inf_kin_haab_escritorio").getDescripcionEscritorio());
        infWinal.setText(accesoInf.getInformacion("inf_uinal_haab_escritorio").getDescripcionEscritorio());
        escribirFecha();

    }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        infHaab = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        infKinal = new javax.swing.JEditorPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        infWinal = new javax.swing.JEditorPane();
        boxDate = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtMesHaab = new javax.swing.JLabel();
        lblWinal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCargador = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtDIaHaab = new javax.swing.JLabel();
        lblNahual = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Jenna Sue", 1, 36), new java.awt.Color(204, 0, 51))); // NOI18N
        jPanel1.setOpaque(false);

        infHaab.setEditable(false);
        infHaab.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calendario Haab", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Jenna Sue", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N
        infHaab.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(infHaab);

        infKinal.setEditable(false);
        infKinal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KInal(Dia)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Jenna Sue", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N
        infKinal.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 0, 18)); // NOI18N
        infKinal.setPreferredSize(new java.awt.Dimension(150, 58));
        jScrollPane5.setViewportView(infKinal);

        infWinal.setEditable(false);
        infWinal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winal (Mes)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Jenna Sue", 1, 24), new java.awt.Color(255, 153, 0))); // NOI18N
        infWinal.setFont(new java.awt.Font("Noto Sans CJK JP DemiLight", 0, 18)); // NOI18N
        infWinal.setToolTipText("");
        infWinal.setMinimumSize(new java.awt.Dimension(150, 58));
        jScrollPane6.setViewportView(infWinal);

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Lobster", 1, 14)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(boxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(221, 221, 253));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Mes"));

        jButton5.setText("Siguiente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Anterior");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtMesHaab.setText(".");

        lblWinal.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMesHaab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblWinal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtMesHaab)
                .addGap(18, 18, 18)
                .addComponent(lblWinal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)))
        );

        jPanel3.setBackground(new java.awt.Color(229, 229, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargador"));

        lblCargador.setText(".");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargador, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(223, 223, 253));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDIaHaab.setText(".");

        lblNahual.setText(" ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtDIaHaab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNahual, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtDIaHaab)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblNahual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mesSiguiente();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mesAnterior();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fechaSiguiente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fechaAnterior();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!boxDate.isValid()|| boxDate.getDate()==null) {
            System.out.println("fecha invalida en calendario haab");
        } else {
            fecha = boxDate.getDate();
            escribirFecha();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public final void escribirFecha() {
        FechaHaab fechaActual = acceso.getFechaEspecifica(Utilidades.DateToLocalDate(fecha));
        txtDIaHaab.setText(fechaActual.getNahual().getNombre());
        txtMesHaab.setText(fechaActual.getWinal().getNombre());
        fechaActual.getNahual().getImagen().colocarImagen(lblNahual,135,135);
        fechaActual.getWinal().getImagen().colocarImagen(lblWinal,135,135);
        fechaActual.getCargador().colocarImagen(lblCargador);
    }

    public void fechaSiguiente() {
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        temp = temp.plusDays(2);
        System.out.println("antes: " + fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: " + fecha.toString());
        boxDate.setDate(fecha);
        escribirFecha();
    }

    public void fechaAnterior() {
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        temp = temp.minusDays(0);
        System.out.println("antes: " + fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: " + fecha.toString());
        boxDate.setDate(fecha);
        escribirFecha();
    }

    public void mesSiguiente() {
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        if (temp.getDayOfYear() > 360) {
            temp = LocalDate.of(temp.getYear() + 1, Month.JANUARY, temp.getDayOfYear() - 360);
        } else if (temp.getDayOfYear() > 345) {
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 31);
        } else {
            temp = temp.plusDays(21);
        }
        System.out.println("antes: " + fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: " + fecha.toString());
        boxDate.setDate(fecha);
        escribirFecha();
    }

    public void mesAnterior() {
        LocalDate temp = Utilidades.DateToLocalDate(fecha);
        if (temp.getDayOfYear() <= 5) {
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 26 + temp.getDayOfYear());
        } else if (temp.getDayOfYear() <= 20) {
            temp = LocalDate.of(temp.getYear(), Month.DECEMBER, 31);
        } else {
            temp = temp.minusDays(19);
        }
        System.out.println("antes: " + fecha.toString());
        fecha = Utilidades.LocalDateToDate(temp);
        System.out.println("despues: " + fecha.toString());
        boxDate.setDate(fecha);
        escribirFecha();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser boxDate;
    private javax.swing.JEditorPane infHaab;
    private javax.swing.JEditorPane infKinal;
    private javax.swing.JEditorPane infWinal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCargador;
    private javax.swing.JLabel lblNahual;
    private javax.swing.JLabel lblWinal;
    private javax.swing.JLabel txtDIaHaab;
    private javax.swing.JLabel txtMesHaab;
    // End of variables declaration//GEN-END:variables
}
