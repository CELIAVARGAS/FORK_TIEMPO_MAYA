/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.menuPrincipal;

import api.login.ArchivoLogin;
import frontend.gui.CalendarioHaab;
import gui.infonahuales.VentanaInfoNahuales;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import modelos.objetos.Usuario;
import principal.backend.perfil_usuario.Informacion;
import principal.frontend.gui.calendari_cholquij.FrameCalendario;
import principal.frontend.gui.perfil_usuario.FramePerfil;
import principal.ui.LineaDeTiempo;
import submenus.perfilUsuario.menuPerfil;

/**
 *
 * @author luisGonzalez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final Informacion info = new Informacion();
    public final static ImageIcon BG = new ImageIcon("src/principal/menuPrincipal/imagenes/granJaguar.jpg");
    private final Usuario user;
    private final ArchivoLogin archivoLogin = new ArchivoLogin();

    //para mostrar la info correspondiente en cuanto al calendario Cholqij
    private final int calendarioLunar = 4;
    private final int formasDeContar = 3;
    private final int diasCalendarioLunar = 2;
    private final int calendarioCholqij = 1;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Usuario user) {
        this.user = user;
        initComponents();
        setLocationRelativeTo(null);

        Imagen img = new Imagen();
        panelPrincipal.add(img);
        panelPrincipal.repaint();

        ImageIcon imIconExit = new ImageIcon("src/api/login/imagenes/editPerfil.jpg");
        Icon iconoExit = new ImageIcon(imIconExit.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        editPerfil.setIcon(iconoExit);

        ImageIcon imCS = new ImageIcon("src/api/login/imagenes/cerrarSesion.png");
        Icon iconSC = new ImageIcon(imCS.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT));
        cerrarSesion.setIcon(iconSC);

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
        btnCerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCholqij = new javax.swing.JButton();
        btnCholqij1 = new javax.swing.JButton();
        btnCholqij2 = new javax.swing.JButton();
        btnNahuales = new javax.swing.JButton();
        btnLinea = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        tabPP = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuCalendarioLunarCC = new javax.swing.JMenuItem();
        menuFormasCotarCC = new javax.swing.JMenuItem();
        menuDiasCalendarioLunarCC = new javax.swing.JMenuItem();
        menuCCInfo = new javax.swing.JMenuItem();
        menuCalculaFecha = new javax.swing.JMenuItem();
        menuNahualEnergia = new javax.swing.JMenuItem();
        menuMatrizCholqij = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        editPerfil = new javax.swing.JMenu();
        menuEditPerfil = new javax.swing.JMenuItem();
        cerrarSesion = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(184, 220, 245));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setResizable(false);

        btnCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrarSesion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Calendario Maya");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCholqij.setBackground(new java.awt.Color(204, 204, 204));
        btnCholqij.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCholqij.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij.setText("Calendario Cholqij");
        btnCholqij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqijActionPerformed(evt);
            }
        });

        btnCholqij1.setBackground(new java.awt.Color(204, 204, 204));
        btnCholqij1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCholqij1.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij1.setText("Calendario Haab");
        btnCholqij1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqij1ActionPerformed(evt);
            }
        });

        btnCholqij2.setBackground(new java.awt.Color(204, 204, 204));
        btnCholqij2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCholqij2.setForeground(new java.awt.Color(0, 0, 0));
        btnCholqij2.setText("Rueda Calendarica");
        btnCholqij2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCholqij2ActionPerformed(evt);
            }
        });

        btnNahuales.setBackground(new java.awt.Color(204, 204, 204));
        btnNahuales.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnNahuales.setForeground(new java.awt.Color(0, 0, 0));
        btnNahuales.setText("Nahuales");
        btnNahuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNahualesActionPerformed(evt);
            }
        });

        btnLinea.setBackground(new java.awt.Color(204, 204, 204));
        btnLinea.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnLinea.setForeground(new java.awt.Color(0, 0, 0));
        btnLinea.setText("Linea de Tiempo");
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineaActionPerformed(evt);
            }
        });

        btnPerfil.setBackground(new java.awt.Color(204, 204, 204));
        btnPerfil.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil.setText("Perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(tabPP, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(184, 220, 245));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(64, 60));

        jMenu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setText("Nahuales");
        jMenu5.setFont(new java.awt.Font("Jenna Sue", 1, 30)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(93, 40));
        jMenuBar1.add(jMenu5);

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Calendario Maya");
        jMenu1.setFont(new java.awt.Font("Jenna Sue", 1, 30)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Calendario Cholqij");
        jMenu2.setFont(new java.awt.Font("Jenna Sue", 1, 30)); // NOI18N

        menuCalendarioLunarCC.setText("Calendario Lunar");
        menuCalendarioLunarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalendarioLunarCCActionPerformed(evt);
            }
        });
        jMenu2.add(menuCalendarioLunarCC);

        menuFormasCotarCC.setText("Formas de Contar");
        menuFormasCotarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormasCotarCCActionPerformed(evt);
            }
        });
        jMenu2.add(menuFormasCotarCC);

        menuDiasCalendarioLunarCC.setText("Dias calendario Lunar");
        menuDiasCalendarioLunarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDiasCalendarioLunarCCActionPerformed(evt);
            }
        });
        jMenu2.add(menuDiasCalendarioLunarCC);

        menuCCInfo.setText("Calendario Cholqij Informacion");
        menuCCInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCCInfoActionPerformed(evt);
            }
        });
        jMenu2.add(menuCCInfo);

        menuCalculaFecha.setText("Calcular fecha Cholqij");
        menuCalculaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalculaFechaActionPerformed(evt);
            }
        });
        jMenu2.add(menuCalculaFecha);

        menuNahualEnergia.setText("Nahual -Energia Cholqij-");
        menuNahualEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNahualEnergiaActionPerformed(evt);
            }
        });
        jMenu2.add(menuNahualEnergia);

        menuMatrizCholqij.setText("Matriz Cholqij");
        menuMatrizCholqij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMatrizCholqijActionPerformed(evt);
            }
        });
        jMenu2.add(menuMatrizCholqij);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Calendario Haab");
        jMenu3.setFont(new java.awt.Font("Jenna Sue", 1, 30)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(141, 45));
        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setText("Rueda Calendarica");
        jMenu4.setFont(new java.awt.Font("Jenna Sue", 1, 30)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(171, 45));
        jMenuBar1.add(jMenu4);

        jMenu6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setText("Linea de Tiempo");
        jMenu6.setFont(new java.awt.Font("Jenna Sue", 1, 30)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(141, 45));
        jMenuBar1.add(jMenu6);

        editPerfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuEditPerfil.setText("Editar Perfil");
        menuEditPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditPerfilActionPerformed(evt);
            }
        });
        editPerfil.add(menuEditPerfil);

        jMenuBar1.add(editPerfil);

        cerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenuItem10.setText("Cerrar Sesion");
        cerrarSesion.add(jMenuItem10);

        jMenuBar1.add(cerrarSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCholqij)
                .addGap(18, 18, 18)
                .addComponent(btnCholqij1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCholqij2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNahuales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLinea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNahuales)
                    .addComponent(btnCholqij2)
                    .addComponent(btnCholqij1)
                    .addComponent(btnCholqij)
                    .addComponent(jButton1)
                    .addComponent(btnLinea))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCholqijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqijActionPerformed
        try {
            // TODO code application logic here
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra el estilo, por lo tanto se utlizara por defecto...");
        }
        FrameCalendario calendarioCholquij = new FrameCalendario();
        calendarioCholquij.setVisible(true);
    }//GEN-LAST:event_btnCholqijActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        //cambiar el parametro nombre por el indicado
        Usuario user2 = info.buscarDatos(user.getUsername());
        if (user2 != null) {
            FramePerfil perfil = new FramePerfil(null, true, user);
            perfil.setVisible(true);
        }
    }//GEN-LAST:event_btnPerfilActionPerformed
    private void setBackground() {

        JLabel backgroundLbl = new JLabel();
        backgroundLbl.setSize(1095, 500);
        backgroundLbl.setLocation(0, 0);
        backgroundLbl.setIcon(BG);
        this.add(backgroundLbl);
        backgroundLbl.setVisible(true);

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

    private void btnCholqij1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqij1ActionPerformed
        CalendarioHaab calendario = new CalendarioHaab();
        calendario.setVisible(true);
    }//GEN-LAST:event_btnCholqij1ActionPerformed

    private void btnCholqij2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCholqij2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCholqij2ActionPerformed

    private void btnNahualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNahualesActionPerformed
        VentanaInfoNahuales ventanaInfoNahuales = new VentanaInfoNahuales();
        ventanaInfoNahuales.setVisible(true);
    }//GEN-LAST:event_btnNahualesActionPerformed

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed

        LineaDeTiempo linea = new LineaDeTiempo(user);
        linea.setVisible(true);
    }//GEN-LAST:event_btnLineaActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        archivoLogin.escribirArchivo(null);
        System.exit(0);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuEditPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditPerfilActionPerformed
        Usuario user2 = info.buscarDatos(user.getUsername());
        if (user2 != null) {
            /*            FramePerfil perfil = new FramePerfil(null, true, user);
            perfil.setVisible(true);
            
             */
            String nombreTab = menuEditPerfil.getText();
            tabPP.removeAll();
            menuPerfil mp = new menuPerfil(null, true, user);
            tabPP.add(mp);
            tabPP.setTitleAt(0, nombreTab);

        }
    }//GEN-LAST:event_menuEditPerfilActionPerformed

    private void menuCalendarioLunarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalendarioLunarCCActionPerformed
         String nombreTab = menuCalendarioLunarCC.getText();
        tabPP.removeAll();

        submenus.calendarioCholquij.panelInformacionCalendarioCholqij infoCC = new submenus.calendarioCholquij.panelInformacionCalendarioCholqij(calendarioLunar, user);
        tabPP.add(infoCC);
        tabPP.setTitleAt(0, nombreTab);


    }//GEN-LAST:event_menuCalendarioLunarCCActionPerformed

    private void menuFormasCotarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormasCotarCCActionPerformed
        String nombreTab = menuFormasCotarCC.getText();
        tabPP.removeAll();

        submenus.calendarioCholquij.panelInformacionCalendarioCholqij infoCC = new submenus.calendarioCholquij.panelInformacionCalendarioCholqij(formasDeContar, user);
        tabPP.add(infoCC);
        tabPP.setTitleAt(0, nombreTab);

    }//GEN-LAST:event_menuFormasCotarCCActionPerformed

    private void menuDiasCalendarioLunarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDiasCalendarioLunarCCActionPerformed
        String nombreTab = menuDiasCalendarioLunarCC.getText();
        tabPP.removeAll();

        submenus.calendarioCholquij.panelInformacionCalendarioCholqij infoCC = new submenus.calendarioCholquij.panelInformacionCalendarioCholqij(diasCalendarioLunar, user);
        tabPP.add(infoCC);
        tabPP.setTitleAt(0, nombreTab);

    }//GEN-LAST:event_menuDiasCalendarioLunarCCActionPerformed

    private void menuCCInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCCInfoActionPerformed
        String nombreTab = menuCCInfo.getText();
        tabPP.removeAll();

        submenus.calendarioCholquij.panelInformacionCalendarioCholqij infoCC = new submenus.calendarioCholquij.panelInformacionCalendarioCholqij(calendarioCholqij, user);
        tabPP.add(infoCC);
        tabPP.setTitleAt(0, nombreTab);

    }//GEN-LAST:event_menuCCInfoActionPerformed

    private void menuCalculaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalculaFechaActionPerformed

        String nombreTab = menuCalculaFecha.getText();
        tabPP.removeAll();

        submenus.calendarioCholquij.panelFechaCholqij fechaCC = new  submenus.calendarioCholquij.panelFechaCholqij();
        tabPP.add(fechaCC);
        tabPP.setTitleAt(0, nombreTab);
    }//GEN-LAST:event_menuCalculaFechaActionPerformed

    private void menuNahualEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNahualEnergiaActionPerformed
        String nombreTab = menuNahualEnergia.getText();
        tabPP.removeAll();

        submenus.calendarioCholquij.panelNahualEnergiaCholqij fechaCC = new  submenus.calendarioCholquij.panelNahualEnergiaCholqij();
        tabPP.add(fechaCC);
        tabPP.setTitleAt(0, nombreTab);
    }//GEN-LAST:event_menuNahualEnergiaActionPerformed

    private void menuMatrizCholqijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMatrizCholqijActionPerformed
        String nombreTab = menuMatrizCholqij.getText();
        tabPP.removeAll();

        submenus.calendarioCholquij.panelMatrizCholqij matrizCC = new  submenus.calendarioCholquij.panelMatrizCholqij();
        tabPP.add(matrizCC);
        tabPP.setTitleAt(0, nombreTab);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMatrizCholqijActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCholqij;
    private javax.swing.JButton btnCholqij1;
    private javax.swing.JButton btnCholqij2;
    private javax.swing.JButton btnLinea;
    private javax.swing.JButton btnNahuales;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JMenu cerrarSesion;
    private javax.swing.JMenu editPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem menuCCInfo;
    private javax.swing.JMenuItem menuCalculaFecha;
    private javax.swing.JMenuItem menuCalendarioLunarCC;
    private javax.swing.JMenuItem menuDiasCalendarioLunarCC;
    private javax.swing.JMenuItem menuEditPerfil;
    private javax.swing.JMenuItem menuFormasCotarCC;
    private javax.swing.JMenuItem menuMatrizCholqij;
    private javax.swing.JMenuItem menuNahualEnergia;
    private javax.swing.JPanel panelPrincipal;
    public static javax.swing.JTabbedPane tabPP;
    // End of variables declaration//GEN-END:variables
}