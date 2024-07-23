/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Modelo.Conexion;
import Modelo.Singleton;
import Vista.Panel_INICIO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Panel_Prin_InicioDAO {
    Panel_INICIO inicio;
    Singleton singleton = Singleton.getInstance();

    public Panel_Prin_InicioDAO(Panel_INICIO inicio) {
        this.inicio = inicio;
        
        String nombreCompleto = buscarNombreCompletoDoctor(singleton.getId_Doctor());
        this.inicio.getLblNombeApellidoDocPrincipal().setText(nombreCompleto);
    }

    public String buscarNombreCompletoDoctor(int idDoctor) {
        Conexion cone = new Conexion();
        String nom = "";
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.sql.Connection con = cone.getConexion();

        String sql = "SELECT CONCAT(p.prim_Nombre, ' ', IFNULL(p.seg_Nombre, ''), ' ', p.prim_Apellido, ' ', IFNULL(p.seg_Apellido, '')) AS nombreCompleto " +
                     "FROM Doctor d " +
                     "JOIN Persona p ON d.Id_Persona = p.Id_Persona " +
                     "WHERE d.Id_Doctor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDoctor);
            rs = ps.executeQuery();

            if (rs.next()) {
                nom = rs.getString("nombreCompleto");
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return nom;
    }
}
