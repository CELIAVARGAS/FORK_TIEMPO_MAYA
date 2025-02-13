/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus.calendarioCholquij;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import principal.backend.calendari_cholquij.matriz.manejadorCalendarioExpandido;

/**
 *
 * @author Esmeralda
 */
public class panelMatrizCholqij extends javax.swing.JPanel {

    /**
     * Creates new form panelMatrizCholqij
     */
    manejadorCalendarioExpandido manejador;

    public panelMatrizCholqij() {
        initComponents();
        manejador = new manejadorCalendarioExpandido();
        manejador.cuadricula(cuadroPanel, infoTextArea, labelNahual, labelEnergia);
        manejador.cargarDatos();

        Imagen img = new Imagen();
        this.add(img);
        this.repaint();
//        this.setLocation(null);
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

        cuadroPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        labelNahual = new javax.swing.JLabel();
        labelEnergia = new javax.swing.JLabel();

        cuadroPanel.setFont(new java.awt.Font("Waree", 0, 14)); // NOI18N

        javax.swing.GroupLayout cuadroPanelLayout = new javax.swing.GroupLayout(cuadroPanel);
        cuadroPanel.setLayout(cuadroPanelLayout);
        cuadroPanelLayout.setHorizontalGroup(
            cuadroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        cuadroPanelLayout.setVerticalGroup(
            cuadroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        infoTextArea.setEditable(false);
        infoTextArea.setBackground(new java.awt.Color(204, 204, 255));
        infoTextArea.setColumns(20);
        infoTextArea.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        infoTextArea.setLineWrap(true);
        infoTextArea.setRows(5);
        infoTextArea.setWrapStyleWord(true);
        infoTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lobster", 1, 18), new java.awt.Color(153, 0, 51))); // NOI18N
        jScrollPane2.setViewportView(infoTextArea);

        labelNahual.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nahual", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Jenna Sue", 1, 24), new java.awt.Color(204, 0, 51))); // NOI18N

        labelEnergia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Energia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Jenna Sue", 1, 24), new java.awt.Color(204, 0, 51))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cuadroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNahual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNahual, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(labelEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(cuadroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cuadroPanel;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEnergia;
    private javax.swing.JLabel labelNahual;
    // End of variables declaration//GEN-END:variables
}
