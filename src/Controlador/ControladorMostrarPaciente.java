/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorMostrarPaciente {

    public List<Persona> obtenerPersonas(String filtro) {
        Conexion cnxt = new Conexion();
        List<Persona> personas = new ArrayList<>();

        String query = "SELECT Identificacion, prim_Nombre, prim_Apellido, Sexo, Telefono, Direccion FROM persona WHERE prim_Nombre LIKE ? OR Identificacion LIKE ?";
        try (Connection connection = cnxt.getConexion();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, "%" + filtro + "%");
            statement.setString(2, "%" + filtro + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String identificacion = resultSet.getString("Identificacion");
                String primNombre = resultSet.getString("prim_Nombre");
                String primApellido = resultSet.getString("prim_Apellido");
                String sexo = resultSet.getString("Sexo");
                String telefono = resultSet.getString("Telefono");
                String direccion = resultSet.getString("Direccion");

                Persona persona = new Persona();
                persona.setIdentificacion(identificacion);
                persona.setPrimNombre(primNombre);
                persona.setPrimApellido(primApellido);
                persona.setSexo(sexo);
                persona.setTelefono(telefono);
                persona.setDireccion(direccion);

                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }
}
