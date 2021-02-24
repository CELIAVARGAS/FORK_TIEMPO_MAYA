/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static modelos.database.UsuarioDb.VALIDACION_LOGEO;
import modelos.objetos.Usuario;
import modelos.objetos.datoCalendarioCholqij;

/**
 *
 * @author Esmeralda
 */
public class informacionCalendarioCholqijDb {

    private Mensaje mensajes = new Mensaje();

    public void crearDatoCalendarioCholqij(datoCalendarioCholqij datoCC) {//creamos dato del calendario cholqij
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("INSERT INTO datosCalendarioCholqij "
                    + "(idDato, titulo, concepto, urlImagen) "
                    + "VALUES (?,?,?,?);");
            statement.setInt(1, datoCC.getId());
            statement.setString(2, datoCC.getTitulo());
            statement.setString(3, datoCC.getContenido());
            statement.setString(4, datoCC.getUrlImagen());
            statement.executeUpdate();
            mensajes.informacion("Se ha informacion del Calendario Cholqij.");
        } catch (SQLException ex) {
            mensajes.error("Ingrese otro contenido por favor, este ya existe ");
        }
    }

    public boolean actualizarDatoCalendarioCholqij(datoCalendarioCholqij datoCC) {//actualizamos datoCC
        boolean actualizado = false;
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE datosCalendarioCholqij SET "
                    + "idDato=? , titulo =? , concepto=?,  "
                    + "urlImagen=? "
                    + "WHERE idDato=?;");
            statement.setInt(1, datoCC.getId());
            statement.setString(2, datoCC.getTitulo());
            statement.setString(3, datoCC.getContenido());
            statement.setString(4, datoCC.getUrlImagen());

            statement.executeUpdate();
            mensajes.informacion("Se ha modificado el dato con exito.");
            actualizado = true;
        } catch (SQLException ex) {
            mensajes.error("No se actualizo el dato. Asegurese que el dato exista");
            actualizado = false;
        }
        return actualizado;
    }

    public void eliminarDatoCalendarioCholqij(datoCalendarioCholqij datoCC) {//eliminamos datoCC
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("DELETE FROM datosCalendarioCholqij WHERE idDato=?;");
            statement.setInt(1, datoCC.getId());
            statement.executeUpdate();
            mensajes.informacion("Se ha eliminado el dato con exito.");
        } catch (SQLException ex) {
            mensajes.error("No se elimino el dato . Asegurese que el dato exista");
        }
    }

    public LinkedList<datoCalendarioCholqij> leerDatosCalendarioCholqij() { //mostramos todos los datosCC y devolvemos en una lista
        LinkedList<datoCalendarioCholqij> listaDatosCC = new LinkedList<>();
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM datosCalendarioCholqij;");
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                datoCalendarioCholqij usuario = convertirDato(resultado);
                listaDatosCC.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("No se leyeron los datos del calendario Cholqij de la DB");
        }
        return listaDatosCC;
    }

    public datoCalendarioCholqij leerDatoCalendarioCholqij(int idDatoCC) {//leemos un datoCC en especifico y lo devolvemos
        datoCalendarioCholqij datoBuscar = null;

        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("SELECT * FROM datosCalendarioCholqij WHERE idDato= ? ;");
            statement.setInt(1, idDatoCC);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                datoBuscar = convertirDato(resultado);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: \n no se encontro el usuario");
        }
        return datoBuscar;
    }

    public datoCalendarioCholqij convertirDato(ResultSet resultado) {//del resultado de la busqueda obtener el datoCC
        datoCalendarioCholqij datoCC = null;
        try {
            datoCC = new datoCalendarioCholqij(resultado.getInt(1), resultado.getString(2), resultado.getString(3),
                    resultado.getString(4));
        } catch (SQLException ex) {
            System.out.println("error en conversion de dato del calendario Cholqij");
        }
        return datoCC;
    }


}
