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
import Modelo.Persona;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorPaciente {

    public boolean verificarIdentificacion(String identificacion) {
        boolean identConfirmar = true;
        String resultado = "No encontrado";
        int idPersona = 0;
        boolean estadoPersona = true;
        String nombrePersona = "";

        String consultaPersona = "SELECT Id_Persona, prim_Nombre, seg_Nombre, prim_Apellido, seg_Apellido, Estado_Activo FROM Persona WHERE Identificacion = ?";
        String consultaDoctor = "SELECT Id_Doctor, Doc_Est_Activo FROM Doctor WHERE Id_Persona = ?";
        String consultaPaciente = "SELECT Id_Paciente, Pac_Est_Activo FROM Paciente WHERE Id_Persona = ?";

        String actualizarEstadoPersona = "UPDATE Persona SET Estado_Activo = ? WHERE Id_Persona = ?";
        String actualizarEstadoPaciente = "UPDATE Paciente SET Pac_Est_Activo = ? WHERE Id_Persona = ?";
        String actualizarEstadoDoctor = "UPDATE Doctor SET Doc_Est_Activo = ? WHERE Id_Persona = ?";
        Conexion conexion = new Conexion();
        try (
                 Connection conn = conexion.getConexion();  PreparedStatement pers = conn.prepareStatement(consultaPersona)) {

            pers.setString(1, identificacion);

            try ( ResultSet rsPersona = pers.executeQuery()) {
                if (rsPersona.next()) {
                    identConfirmar = false;
                    idPersona = rsPersona.getInt("Id_Persona");
                    estadoPersona = rsPersona.getBoolean("Estado_Activo");
                    nombrePersona = rsPersona.getString("prim_Nombre") + " " + rsPersona.getString("seg_Nombre") + " " + rsPersona.getString("prim_Apellido") + " " + rsPersona.getString("seg_Apellido");

                    try ( PreparedStatement doct = conn.prepareStatement(consultaDoctor)) {
                        doct.setInt(1, idPersona);

                        try ( ResultSet rsDoctor = doct.executeQuery()) {
                            if (rsDoctor.next()) {
                                resultado = "Doctor";
                                Notificaciones.information("INFORMACION", "La identificación " + nombrePersona + " está registrada como Doctor");
                            }
                        }
                    }

                    try ( PreparedStatement pacient = conn.prepareStatement(consultaPaciente)) {
                        pacient.setInt(1, idPersona);

                        try ( ResultSet rsPaciente = pacient.executeQuery()) {
                            if (rsPaciente.next()) {
                                boolean estadoPaciente = rsPaciente.getBoolean("Pac_Est_Activo");
                                resultado = "Paciente";

                                if (!estadoPaciente || !estadoPersona) {
                                    Notificaciones.information("INFORMACIÓN", "El paciente se encuentra eliminado");
                                    String[] opciones = {"Cancelar", "Retornar Paciente"};
                                    int eleccion = JOptionPane.showOptionDialog(
                                            null,
                                            "Desea retornar al paciente " + nombrePersona,
                                            "Importante",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE,
                                            null,
                                            opciones,
                                            opciones[0]
                                    );

                                    if (eleccion == JOptionPane.NO_OPTION) {
                                        // Retornar al paciente
                                        try ( PreparedStatement estadorPersn = conn.prepareStatement(actualizarEstadoPersona)) {
                                            estadorPersn.setBoolean(1, true);
                                            estadorPersn.setInt(2, idPersona);
                                            estadorPersn.executeUpdate();
                                        }

                                        try ( PreparedStatement estadorPaciente = conn.prepareStatement(actualizarEstadoPaciente)) {
                                            estadorPaciente.setBoolean(1, true);
                                            estadorPaciente.setInt(2, idPersona);
                                            estadorPaciente.executeUpdate();
                                        }

                                        Notificaciones.success("Éxito", "El paciente " + nombrePersona + " retornó exitosamente");
                                    }
                                } else {
                                    Notificaciones.information("INFORMACIÓN", "El paciente " + nombrePersona + " ya se encuentra registrado");
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió un error");
            System.out.println(" " + e.getMessage());
        } finally {
            System.out.println("Análisis del id finalizado");
        }

        return identConfirmar;
    }

    public boolean registrar(Paciente paciente, AntecedentesPersonales antecedentes,
            List<AntecedentesFamiliares> familiares, int idDoctor, String rol, Estudiante estudiante,boolean identificacion) {
       
        

        if (identificacion) {
            if (paciente == null || paciente == null) {
            System.out.println("Paciente o Persona es nulo");
            return false;
        }

        if (antecedentes == null) {
            System.out.println("AntecedentesPersonales es nulo");
        }

        if (rol == null || (!rol.equals("estudiante") && !rol.equals("docente"))) {
            System.out.println("Rol inválido");
            return false;
        }

        if (estudiante == null && rol.equals("estudiante")) {
            System.out.println("Estudiante es nulo pero rol es estudiante");
            return false;
        }

        System.out.println("Iniciando proceso de registro...");
        System.out.println("Identificación: " + paciente.getIdentificacion());
        System.out.println("PrimNombre: " + paciente.getPrimNombre());
        System.out.println("SegNombre: " + paciente.getSegNombre());
        // Agrega más campos si es necesario

        Conexion cnxt = new Conexion();
        PreparedStatement pS = null;
        Connection conectBase = cnxt.getConexion();

        // SQL para insertar en las tablas
        String sqlPersona = "INSERT INTO Persona (Identificacion, prim_Nombre, seg_Nombre, prim_Apellido, seg_Apellido, Email, Direccion, Barrio, Canton, Provincia, Telefono, Fecha_Nacimiento, Lugar, Pais, Genero, Estado_Civil, Sexo, Foto, Etnia, Fecha_Registro, Carnet_Conadis,Discapacidad, Tipo_Discapacidad, Porct_Discapacidad, Contacto_Emergencia, Estado_Activo, tipo_sangre) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlPaciente = "INSERT INTO Paciente (Id_Persona, Pac_Est_Activo) VALUES (?, ?)";
        String sqlAntecedentes = "INSERT INTO Antecedentes (Alergias, Clinico, Ginecologico, Traumatologico, Quirurgico, Farmacologico, Enfermedades, Cirugias, Vacunas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlFamiliar = "INSERT INTO Familiar (Id_Paciente, Parentesco, Id_Antecedentes) VALUES (?, ?, ?)";
        String sqlPersonal = "INSERT INTO Personal (Id_Paciente, Id_Antecedentes) VALUES (?, ?)";
        String sqlIngreso = "INSERT INTO RegistraPaciente (Id_Paciente, Id_Doctor, Fecha) VALUES (?, ?, ?)";
        String sqlEstudiante = "INSERT INTO Alumno (Id_Paciente, Carrera, Alumno_Activo, Ciclo) VALUES ( ?, ?, ?, ?)";
        String sqlDocente = "INSERT INTO Docente (Id_Paciente) VALUES (?)";

        try {
            conectBase.setAutoCommit(false); // Desactivar auto commit

            // Insertar en la tabla Persona
            pS = conectBase.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
            pS.setString(1, paciente.getIdentificacion());
            pS.setString(2, paciente.getPrimNombre());
            pS.setString(3, paciente.getSegNombre());
            pS.setString(4, paciente.getPrimApellido());
            pS.setString(5, paciente.getSegApellido());
            pS.setString(6, paciente.getEmail());
            pS.setString(7, paciente.getDireccion());
            pS.setString(8, paciente.getBarrio());
            pS.setString(9, paciente.getCanton());
            pS.setString(10, paciente.getProvincia());
            pS.setString(11, paciente.getTelefono());
            pS.setDate(12, paciente.getFechaNacimiento());
            pS.setString(13, paciente.getLugar());
            pS.setString(14, paciente.getPais());
            pS.setString(15, paciente.getGenero());
            pS.setString(16, paciente.getEstadoCivil());
            pS.setString(17, paciente.getSexo());
            pS.setBytes(18, paciente.getFoto());
            pS.setString(19, paciente.getEtnia());
            pS.setDate(20, paciente.getFechaRegistro());
            pS.setString(21, paciente.getCarnetConadis());
            pS.setBoolean(22, paciente.isDiscapacidad());
            pS.setString(23, paciente.getTipoDiscapacidad());
            pS.setInt(24, paciente.getPorctDiscapacidad());
            pS.setString(25, paciente.getContactoEmergencia());
            pS.setBoolean(26, paciente.isEstadoActivo());
            pS.setString(27, paciente.getTipo_sangre());
            pS.executeUpdate();

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
                    pS = conectBase.prepareStatement(sqlPersonal, PreparedStatement.RETURN_GENERATED_KEYS);
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

                        ResultSet generatedFamiliarAntecedentesKeys = pS.getGeneratedKeys();
                        if (generatedFamiliarAntecedentesKeys.next()) {
                            idFamiliarAntecedente = generatedFamiliarAntecedentesKeys.getInt(1);
                        } else {
                            throw new SQLException("Error al obtener el ID generado para Antecedentes de Familiar.");
                        }

                        // Insertar en la tabla Familiar
                        pS = conectBase.prepareStatement(sqlFamiliar, PreparedStatement.RETURN_GENERATED_KEYS);
                        pS.setInt(1, idPaciente);
                        pS.setString(2, familiar.getParentescoFamiliar());
                        pS.setInt(3, idFamiliarAntecedente);
                        pS.executeUpdate();
                    }
                }
            }

            // Insertar en la tabla Registro del Paciente
            pS = conectBase.prepareStatement(sqlIngreso, PreparedStatement.RETURN_GENERATED_KEYS);
            pS.setInt(1, idPaciente);
            pS.setInt(2, idDoctor);
            pS.setDate(3, new java.sql.Date(System.currentTimeMillis()));
            pS.executeUpdate();

            // Insertar en la tabla Estudiante o Docente según corresponda
            if ("estudiante".equals(rol) && estudiante != null) {
                pS = conectBase.prepareStatement(sqlEstudiante, PreparedStatement.RETURN_GENERATED_KEYS);
                pS.setInt(1, idPaciente);
                pS.setString(2, estudiante.getCarrera());
                pS.setBoolean(3, estudiante.isEstEstado());
                pS.setString(4, estudiante.getCiclo());
                pS.executeUpdate();
            } else if ("docente".equals(rol)) {
                pS = conectBase.prepareStatement(sqlDocente, PreparedStatement.RETURN_GENERATED_KEYS);
                pS.setInt(1, idPaciente);
                pS.executeUpdate();
            } else {
                System.out.println("Rol inválido o datos de estudiante faltantes");
                conectBase.rollback(); // Deshacer cambios si ocurre un error
                return false;
            }

            conectBase.commit(); // Confirmar cambios en la base de datos
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar datos: " + e.getMessage());
            try {
                conectBase.rollback(); // Deshacer cambios en caso de error
            } catch (SQLException rollbackEx) {
                System.out.println("Error al hacer rollback: " + rollbackEx.getMessage());
            }
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
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        }else{
        Notificaciones.error("Error", "REVISAR LA IDENTIFICACION");
        return false;
        }
        
    }

}
