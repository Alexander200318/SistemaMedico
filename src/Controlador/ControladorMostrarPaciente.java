/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorMostrarPaciente {

    public List<Paciente> obtenerPaciente(String filtro) {
        Conexion cnxt = new Conexion();
        List<Paciente> pacientes = new ArrayList<>();

        // Verifica si el filtro no está vacío o nulo
        String whereClause = "";
        if (filtro != null && !filtro.trim().isEmpty()) {
            whereClause = " WHERE per.Identificacion LIKE ? "
                        + "OR per.prim_Nombre LIKE ? "
                        + "OR per.prim_Apellido LIKE ? "
                        + "OR per.Sexo LIKE ? "
                        + "OR per.Telefono LIKE ? "
                        + "OR per.Direccion LIKE ? ";
        }

        String query = "SELECT \n"
                + "    per.Identificacion AS Identificacion,\n"
                + "    per.prim_Nombre AS prim_Nombre,\n"
                + "    per.prim_Apellido AS prim_Apellido,\n"
                + "    per.Sexo AS Sexo,\n"
                + "    per.Telefono AS Telefono,\n"
                + "    per.Direccion AS Direccion,\n"
                + "    pac.Id_Paciente AS idPaciente\n"
                + "FROM \n"
                + "    Paciente pac\n"
                + "JOIN \n"
                + "    Persona per ON pac.Id_Persona = per.Id_Persona" 
                + whereClause;

        try (Connection connection = cnxt.getConexion(); 
             PreparedStatement statement = connection.prepareStatement(query)) {
             
            // Si hay un filtro, establece los valores en la declaración preparada
            if (!whereClause.isEmpty()) {
                String filtroLike = "%" + filtro + "%";
                for (int i = 1; i <= 6; i++) {
                    statement.setString(i, filtroLike);
                }
            }

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idPaciente = resultSet.getInt("idPaciente");
                String identificacion = resultSet.getString("Identificacion");
                String primNombre = resultSet.getString("prim_Nombre");
                String primApellido = resultSet.getString("prim_Apellido");
                String sexo = resultSet.getString("Sexo");
                String telefono = resultSet.getString("Telefono");
                String direccion = resultSet.getString("Direccion");

                Paciente pacientess = new Paciente();
                pacientess.setIdPaciente(idPaciente);
                pacientess.setIdentificacion(identificacion);
                pacientess.setPrimNombre(primNombre);
                pacientess.setPrimApellido(primApellido);
                pacientess.setSexo(sexo);
                pacientess.setTelefono(telefono);
                pacientess.setDireccion(direccion);

                pacientes.add(pacientess);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pacientes;
    }
}
