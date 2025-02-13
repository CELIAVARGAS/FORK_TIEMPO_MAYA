/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus.lineaDeTiempo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelos.database.HechoHistoricoDb;
import modelos.objetos.HechoHistorico;
import modelos.objetos.Usuario;
import static principal.menuPrincipal.MenuPrincipal.BG;

/**
 *
 * @author Esmeralda
 */
public class panelLIneaTIempo extends javax.swing.JPanel {

    public static ArrayList<EventoDeTiempo> eventos;
    private final Usuario usuario;
    private int index = 0;

    /**
     * Creates new form panelLIneaTIempo
     *
     * @param usuarioL
     */
    public panelLIneaTIempo(Usuario usuarioL) {
        initComponents();

        this.usuario = usuarioL;
        obtenerHechos();
        addPrimerHecho();

        Imagen img = new Imagen();
        this.add(img);
        this.repaint();

        ImageIcon imA = new ImageIcon("src/submenus/lineaDeTiempo/imagenesLineaTiempoMaya/adelante.png");
        Icon iconA = new ImageIcon(imA.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        btnAdelante.setIcon(iconA);

        ImageIcon imgAt = new ImageIcon("src/submenus/lineaDeTiempo/imagenesLineaTiempoMaya/atras.png");
        Icon iconAt = new ImageIcon(imgAt.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        botonAtrAas.setIcon(iconAt);

    }

    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(1300, 650); //se selecciona el tamaño del panel
        }

        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();

            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        panelPrincipal = new javax.swing.JPanel();
        botonAtrAas = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonAgregarEvento = new javax.swing.JButton();
        eliminarEvento = new javax.swing.JButton();
        editarElemento = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        panelPrincipal.setBackground(new java.awt.Color(153, 204, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelPrincipal.setOpaque(false);
        panelPrincipal.setPreferredSize(new java.awt.Dimension(735, 300));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        botonAtrAas.setBackground(new java.awt.Color(0, 102, 102));
        botonAtrAas.setFont(new java.awt.Font("Lobster", 1, 36)); // NOI18N
        botonAtrAas.setBorder(null);
        botonAtrAas.setEnabled(false);
        botonAtrAas.setOpaque(false);
        botonAtrAas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrAasActionPerformed(evt);
            }
        });

        btnAdelante.setBackground(new java.awt.Color(153, 204, 255));
        btnAdelante.setFont(new java.awt.Font("Lobster", 1, 36)); // NOI18N
        btnAdelante.setBorder(null);
        btnAdelante.setOpaque(false);
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Jenna Sue", 1, 75)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Linea De Tiempo");

        botonAgregarEvento.setBackground(new java.awt.Color(0, 102, 102));
        botonAgregarEvento.setFont(new java.awt.Font("Jenna Sue", 1, 36)); // NOI18N
        botonAgregarEvento.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarEvento.setText("Agregar Evento");
        botonAgregarEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEventoActionPerformed(evt);
            }
        });

        eliminarEvento.setBackground(new java.awt.Color(0, 102, 102));
        eliminarEvento.setFont(new java.awt.Font("Jenna Sue", 1, 36)); // NOI18N
        eliminarEvento.setForeground(new java.awt.Color(255, 255, 255));
        eliminarEvento.setText("Eliminar Evento");
        eliminarEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEventoActionPerformed(evt);
            }
        });

        editarElemento.setBackground(new java.awt.Color(0, 102, 102));
        editarElemento.setFont(new java.awt.Font("Jenna Sue", 1, 36)); // NOI18N
        editarElemento.setForeground(new java.awt.Color(255, 255, 255));
        editarElemento.setText("Editar Evento");
        editarElemento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarElementoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonAtrAas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eliminarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAgregarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAgregarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(editarElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(eliminarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdelante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAtrAas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEventoActionPerformed
        AgregarEvento ae = new AgregarEvento();
        ae.setVisible(true);
    }//GEN-LAST:event_botonAgregarEventoActionPerformed

    private void eliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEventoActionPerformed
        EventoDeTiempo e = eventos.get(index);
        HechoHistorico hI = e.devolverHH();

        HechoHistoricoDb h = new HechoHistoricoDb();
        h.eliminarHechoHistorico(hI);

        obtenerHechos();
    }//GEN-LAST:event_eliminarEventoActionPerformed

    private void botonAtrAasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrAasActionPerformed
        index--;
        panelPrincipal.removeAll();
        panelPrincipal.add(eventos.get(index));
        eventos.get(index).setVisible(true);
        panelPrincipal.validate();
        panelPrincipal.repaint();
        if (index == 0) {
            botonAtrAas.setEnabled(false);

        } else {
            botonAtrAas.setEnabled(true);
        }
        btnAdelante.setEnabled(true);
    }//GEN-LAST:event_botonAtrAasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        index++;
        panelPrincipal.removeAll();
        System.out.println("cantidad de eventos "+eventos.size());
        System.out.println("index "+index);
        
        if (eventos.size() > index) {
            panelPrincipal.add(eventos.get(index));
            eventos.get(index).setVisible(true);
            panelPrincipal.validate();
            panelPrincipal.repaint();
            if (index == eventos.size() - 1) {
                btnAdelante.setEnabled(false);

            } else {
                btnAdelante.setEnabled(true);
            }
            botonAtrAas.setEnabled(true);
        } else {

        }


    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void editarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarElementoActionPerformed
        HechoHistorico hechoHN = new HechoHistorico();
        EventoDeTiempo e = eventos.get(index);
        hechoHN = e.hechoHistoricoNuevo();
        if (hechoHN == null) {
        } else {
            HechoHistoricoDb hAc = new HechoHistoricoDb();
            hAc.actualizarHechoHistorico(hechoHN);
            obtenerHechos();
        }

    }//GEN-LAST:event_editarElementoActionPerformed

    public static final void obtenerHechos() {
        HechoHistoricoDb hechoHistoricoDb = new HechoHistoricoDb();
        LinkedList<HechoHistorico> hechoHistoricos = hechoHistoricoDb.leerHechosHistoricos();
        eventos = new ArrayList<>();

        for (int i = 0; i < hechoHistoricos.size(); i++) {

            eventos.add(new EventoDeTiempo(hechoHistoricos.get(i)));

        }
    }

    private void addPrimerHecho() {
        System.out.println(eventos.size());
        if (eventos.size() > 0) {
            panelPrincipal.add(eventos.get(0));
            eventos.get(0).setVisible(true);
            panelPrincipal.validate();
            panelPrincipal.repaint();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarEvento;
    private javax.swing.JButton botonAtrAas;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton editarElemento;
    private javax.swing.JButton eliminarEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
