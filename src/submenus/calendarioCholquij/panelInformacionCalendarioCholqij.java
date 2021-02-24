/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus.calendarioCholquij;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelos.database.Mensaje;
import modelos.database.informacionCalendarioCholqijDb;
import modelos.objetos.Usuario;
import modelos.objetos.datoCalendarioCholqij;

/**
 *
 * @author Esmeralda
 */
public class panelInformacionCalendarioCholqij extends javax.swing.JPanel {

    /**
     * Creates new form panelInformacionCalendarioCholqij
     */
    private int opcionInfo = 0;
    private final Usuario usuarioLogueado;
    private datoCalendarioCholqij datoCC;
    private final informacionCalendarioCholqijDb infCC = new informacionCalendarioCholqijDb();
    private final Mensaje mensajes = new Mensaje();

    public panelInformacionCalendarioCholqij(int opcion, Usuario user) {
        initComponents();
        //fondo de pantalla
        Imagen img = new Imagen();
        this.add(img);
        this.repaint();

        opcionInfo = opcion;
        usuarioLogueado = user;
        //dependiendo del rol se puede editar o no.
        validacionusuario();

        areaInformacion.setLineWrap(true);
        //dependiendo la opcion leemos la DB
        clasificarDatoMostrar();
    }

    private void validacionusuario() {
        int rolU = usuarioLogueado.getRol();
        if (rolU == 1) {//es admin
            areaInformacion.setEditable(true);
            btnEditar.setVisible(true);
        } else {//es invitado
            areaInformacion.setEditable(false);
            btnEditar.setVisible(false);
        }
    }

    ;


    private void clasificarDatoMostrar() {
        datoCalendarioCholqij datoLee = infCC.leerDatoCalendarioCholqij(opcionInfo);
        lblTitulo.setText(datoLee.getTitulo());
        areaInformacion.setText(datoLee.getContenido());

        ImageIcon imIconExit = new ImageIcon(datoLee.getUrlImagen());
        Icon iconoExit = new ImageIcon(imIconExit.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        iconoCalendario.setIcon(iconoExit);

        datoCC = datoLee;
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

        lblTitulo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaInformacion = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        iconoCalendario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1100, 550));

        lblTitulo2.setFont(new java.awt.Font("Jenna Sue", 1, 36)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(204, 0, 102));
        lblTitulo2.setText("CALENDARIO CHOLQIJ");

        areaInformacion.setBackground(new java.awt.Color(255, 222, 255));
        areaInformacion.setColumns(20);
        areaInformacion.setFont(new java.awt.Font("Cousine", 0, 18)); // NOI18N
        areaInformacion.setLineWrap(true);
        areaInformacion.setRows(5);
        areaInformacion.setToolTipText("");
        areaInformacion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaInformacion);

        lblTitulo.setFont(new java.awt.Font("Jenna Sue", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 0, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(" ");

        btnEditar.setBackground(new java.awt.Color(255, 255, 204));
        btnEditar.setFont(new java.awt.Font("Lobster", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(iconoCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(iconoCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //validar que no este vacio el concepto
        if (areaInformacion.getText().isEmpty()) { //caja de texto vacia
            mensajes.error("Debe ingresar informacion acerca de " + datoCC.getTitulo());
        } else {//caja de texto con info
            String concepto = areaInformacion.getText();
            //editamos el dato.
            datoCalendarioCholqij datoUpdate = new datoCalendarioCholqij(datoCC.getId(), datoCC.getTitulo(), concepto, datoCC.getUrlImagen());
            infCC.actualizarDatoCalendarioCholqij(datoCC);
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInformacion;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel iconoCalendario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    // End of variables declaration//GEN-END:variables
}