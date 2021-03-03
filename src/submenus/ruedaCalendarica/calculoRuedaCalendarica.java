/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus.ruedaCalendarica;

import javax.swing.JTextField;

/**
 *
 * @author Esmeralda
 */
public class calculoRuedaCalendarica {
 
    int numeroCorrelativo = 584283;
    int numeroJUlianFechaPIvote = 2451911;

    public void calculoCuentaLarga(int cantidadDiasTranscurridos, boolean Sobrepasa,
            JTextField b ,JTextField kt, JTextField t,JTextField u, JTextField txtKin) {
        int cantidadDiasJulianos = 0;
        if (Sobrepasa == true) {
            cantidadDiasJulianos = numeroJUlianFechaPIvote + cantidadDiasTranscurridos;
        } else {
            cantidadDiasJulianos = numeroJUlianFechaPIvote - cantidadDiasTranscurridos;
        }
        
        int diaMaya = cantidadDiasJulianos - numeroCorrelativo;
        System.out.println("cantidadDiasJulianos " + cantidadDiasJulianos);
        System.out.println("dia maya " + diaMaya);

        long Baktun = diaMaya / 144000;
        int numB = (int) Baktun;
        long Katun = (diaMaya % 144000) / 7200;
        int numK = (int) Katun;

        long Tun = (diaMaya - (Baktun * 144000) - (Katun * 7200)) / 360;
        int numT = (int) Tun;
        long Uinal = (diaMaya % 360) / 20;
        int numU = (int) Uinal;
        long kin = (diaMaya % 20);
        int numKi = (int) kin;
        System.out.println("CL");
        System.out.println(numB + " " + numK + " " + numT + " " + numU + " " + numKi);
        b.setText(""+numB);
        kt.setText(""+numK);
        t.setText(""+numT);
        u.setText(""+numU);
        txtKin.setText(""+numKi);
    }

}
