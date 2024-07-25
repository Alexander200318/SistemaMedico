/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Antecedentes;
import Modelo.AntecedentesFamiliares;
import Modelo.AntecedentesPersonales;
import Modelo.Conexion;
import Modelo.Docente;
import Modelo.Estudiante;
import Modelo.Paciente;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorPaciente {

    public boolean registrar(Paciente paciente, AntecedentesPersonales antecedentes,
            List<AntecedentesFamiliares> familiares, int idDoctor, String rol, Estudiante estudiante) {
        Conexion cnxt = new Conexion();
        PreparedStatement pS = null;
        Connection conectBase = cnxt.getConexion();

        // SQL para insertar en las tablas
        String sqlPersona = "INSERT INTO Persona (Identificacion, prim_Nombre, seg_Nombre, prim_Apellido, seg_Apellido, Email, Direccion, Barrio, Canton, Provincia, Telefono, Fecha_Nacimiento, Lugar, Pais, Genero, Estado_Civil, Sexo, Foto, Etnia, Fecha_Registro, Carnet_Conadis, Tipo_Discapacidad, Porct_Discapacidad, Contacto_Emergencia, Estado_Activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlPaciente = "INSERT INTO Paciente (Id_Persona, Pac_Est_Activo) VALUES (?, ?)";
        String sqlAntecedentes = "INSERT INTO Antecedentes (Alergias, Clinico, Ginecologico, Traumatologico, Quirurgico, Farmacologico, Enfermedades, Cirugias, Vacunas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlFamiliar = "INSERT INTO Familiar (Id_Paciente, Parentesco, Id_Antecedente) VALUES (?, ?, ?)";
        String sqlPersonal = "INSERT INTO Personal (Id_Paciente, Id_Antecedente) VALUES (?, ?)";
        String sqlIngreso = "INSERT INTO RegistraPaciente (Id_Paciente, Id_Doctor, Fecha) VALUES (?, ?, ?)";
        String sqlEstudiante = "INSERT INTO Alumno (Id_Paciente, Alumno_Nivel_Academico, Carrera, Alumno_Activo, Ciclo) VALUES (?, ?, ?, ?, ?)";
        String sqlDocente = "INSERT INTO Docente (Id_Paciente) VALUES (?)";

        try {
            conectBase.setAutoCommit(false); // Desactivar auto commit

            // Insertar en la tabla Persona
            pS = conectBase.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
            pS.setString(1, paciente.getPersona().getIdentificacion());
            pS.setString(2, paciente.getPersona().getPrimNombre());
            pS.setString(3, paciente.getPersona().getSegNombre());
            pS.setString(4, paciente.getPersona().getPrimApellido());
            pS.setString(5, paciente.getPersona().getSegApellido());
            pS.setString(6, paciente.getPersona().getEmail());
            pS.setString(7, paciente.getPersona().getDireccion());
            pS.setString(8, paciente.getPersona().getBarrio());
            pS.setString(9, paciente.getPersona().getCanton());
            pS.setString(10, paciente.getPersona().getProvincia());
            pS.setString(11, paciente.getPersona().getTelefono());
            pS.setDate(12, paciente.getPersona().getFechaNacimiento());
            pS.setString(13, paciente.getPersona().getLugar());
            pS.setString(14, paciente.getPersona().getPais());
            pS.setString(15, paciente.getPersona().getGenero());
            pS.setString(16, paciente.getPersona().getEstadoCivil());
            pS.setString(17, paciente.getPersona().getSexo());
            pS.setBlob(18, paciente.getPersona().getFoto());
            pS.setString(19, paciente.getPersona().getEtnia());
            pS.setDate(20, paciente.getPersona().getFechaRegistro());
            pS.setString(21, paciente.getPersona().getCarnetConadis());
            pS.setBoolean(22, paciente.getPersona().isDiscapacidad());
            pS.setString(23, paciente.getPersona().getTipoDiscapacidad());
            pS.setInt(24, paciente.getPersona().getPorctDiscapacidad());
            pS.setString(25, paciente.getPersona().getContactoEmergencia());
            pS.setBoolean(26, paciente.getPersona().isEstadoActivo());
            pS.executeUpdate();
            System.out.println("Parte 1");
            ResultSet generatedKeys = pS.getGeneratedKeys();
            int idPersona;
            if (generatedKeys.next()) {
                idPersona = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Error al obtener el ID generado para Persona.");
            }

            // Insertar en la tabla Paciente
            pS = conectBase.prepareStatement(sqlPaciente, PreparedStatement.RETURN_GENERATED_KEYS);
            pS.setInt(1, idPersona);
            pS.setBoolean(2, paciente.isPacEstActivo());
            pS.executeUpdate();

            ResultSet generatedKeysPaciente = pS.getGeneratedKeys();
            int idPaciente;
            if (generatedKeysPaciente.next()) {
                idPaciente = generatedKeysPaciente.getInt(1);
            } else {
                throw new SQLException("Error al obtener el ID generado para Paciente.");
            }

            // Insertar en la tabla Antecedentes del Paciente Principal solo si hay datos
            System.out.println("parte 2");
            int idAntecedente = 0;
            if (antecedentes != null
                    && (antecedentes.getAlergias() != null || antecedentes.getClinico() != null
                    || antecedentes.getGinecologico() != null || antecedentes.getTraumatologico() != null
                    || antecedentes.getQuirurgico() != null || antecedentes.getFarmacologico() != null
                    || antecedentes.getEnfermedades() != null || antecedentes.getCirugias() != null
                    || antecedentes.getVacunas() != null)) {

                pS = conectBase.prepareStatement(sqlAntecedentes, PreparedStatement.RETURN_GENERATED_KEYS);
                pS.setString(1, antecedentes.getAlergias());
                pS.setString(2, antecedentes.getClinico());
                pS.setString(3, antecedentes.getGinecologico());
                pS.setString(4, antecedentes.getTraumatologico());
                pS.setString(5, antecedentes.getQuirurgico());
                pS.setString(6, antecedentes.getFarmacologico());
                pS.setString(7, antecedentes.getEnfermedades());
                pS.setString(8, antecedentes.getCirugias());
                pS.setString(9, antecedentes.getVacunas());
                pS.executeUpdate();

                ResultSet generatedAntecedentesKeys = pS.getGeneratedKeys();
                if (generatedAntecedentesKeys.next()) {
                    idAntecedente = generatedAntecedentesKeys.getInt(1);
                } else {
                    throw new SQLException("Error al obtener el ID generado para Antecedentes.");
                }

                // Insertar en la tabla Personal con el idAntecedente si se generó un ID
                if (idAntecedente > 0) {
                    pS = conectBase.prepareStatement(sqlPersonal);
                    pS.setInt(1, idPaciente);
                    pS.setInt(2, idAntecedente);
                    pS.executeUpdate();
                }
            }

            // Insertar antecedentes específicos de familiares y relacionarlos solo si hay datos
            if (familiares != null && !familiares.isEmpty()) {
                for (AntecedentesFamiliares familiar : familiares) {
                    int idFamiliarAntecedente = 0;
                    if (familiar != null
                            && (familiar.getAlergias() != null || familiar.getClinico() != null
                            || familiar.getGinecologico() != null || familiar.getTraumatologico() != null
                            || familiar.getQuirurgico() != null || familiar.getFarmacologico() != null
                            || familiar.getEnfermedades() != null || familiar.getCirugias() != null
                            || familiar.getVacunas() != null)) {

                        // Insertar antecedentes del familiar
                        pS = conectBase.prepareStatement(sqlAntecedentes, PreparedStatement.RETURN_GENERATED_KEYS);
                        pS.setString(1, familiar.getAlergias());
                        pS.setString(2, familiar.getClinico());
                        pS.setString(3, familiar.getGinecologico());
                        pS.setString(4, familiar.getTraumatologico());
                        pS.setString(5, familiar.getQuirurgico());
                        pS.setString(6, familiar.getFarmacologico());
                        pS.setString(7, familiar.getEnfermedades());
                        pS.setString(8, familiar.getCirugias());
                        pS.setString(9, familiar.getVacunas());
                        pS.executeUpdate();

                        ResultSet generatedKeysFamiliarAntecedente = pS.getGeneratedKeys();
                        if (generatedKeysFamiliarAntecedente.next()) {
                            idFamiliarAntecedente = generatedKeysFamiliarAntecedente.getInt(1);
                        } else {
                            throw new SQLException("Error al obtener el ID generado para Antecedentes del Familiar.");
                        }
                        System.out.println("parte 3");
                        // Insertar familiar y asociar con el antecedente si se generó un ID
                        if (idFamiliarAntecedente > 0) {
                            pS = conectBase.prepareStatement(sqlFamiliar);
                            pS.setInt(1, idPaciente);
                            pS.setString(2, familiar.getParentescoFamiliar());
                            pS.setInt(3, idFamiliarAntecedente);
                            pS.executeUpdate();
                        }
                    }
                }
            }

            // Insertar en la tabla RegistraPaciente
            pS = conectBase.prepareStatement(sqlIngreso);
            pS.setInt(1, idPaciente);
            pS.setInt(2, idDoctor);
            pS.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
            pS.executeUpdate();

            // Insertar en la tabla Estudiante o Docente según el rol
            if (rol.equals("estudiante")) {
                pS = conectBase.prepareStatement(sqlEstudiante);
                pS.setInt(1, idPaciente);
                pS.setString(2, estudiante.getNivelAcademico());
                pS.setString(3, estudiante.getCarrera());
                pS.setBoolean(4, estudiante.isEstEstado());
                pS.setString(5, estudiante.getCiclo());
                pS.executeUpdate();
            } else if (rol.equals("docente")) {
                pS = conectBase.prepareStatement(sqlDocente);
                pS.setInt(1, idPaciente);
                pS.executeUpdate();
            }
            System.out.println("Parte 4");
            // Confirmar transacción con mensaje de confirmación
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea confirmar los cambios?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                conectBase.commit(); // Confirmar transacción
                JOptionPane.showMessageDialog(null, "Cambios confirmados y guardados exitosamente.");
                return true;
            } else {
                conectBase.rollback(); // Deshacer cambios en caso de cancelación
                JOptionPane.showMessageDialog(null, "Cambios cancelados.");
                return false;
            }
        } catch (SQLException e) {
            try {
                conectBase.rollback(); // Deshacer cambios en caso de error
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pS != null) {
                    pS.close();
                }
                if (conectBase != null) {
                    conectBase.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
