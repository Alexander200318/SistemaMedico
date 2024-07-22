/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Antecedentes;
import Modelo.Familiar;
import Modelo.Historial;
import Modelo.Paciente;
import Vista.FrmNuevaConsulta;
import controlador_Vist.PaginaNuevaConsultaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ControladorFrmNuevaConsul {
    private FrmNuevaConsulta ventanaNvConsulta;

    private JTextArea txtAntecedentesFarmacologicos;
    private JTextArea txtAntecedentesClinicosFamiliar;
    private JTextArea txtAntecedentesFarmacologicosFamiliar;
    private JTextArea txtAntecedentesGinecologicosFamiliar;
    private JTextArea txtAntecedentesTraumatologicosFamiliar;
    private JTextField txtParentesco;
    private JTextArea txtAntecedentesGinecologicos;
    private JTextArea txtAntecedentesTraumatologicos;
    private JTextArea txtAntecedentes_Clinicos;
    private JTextArea txtCirujias;
    private JTextArea txtEnfermedades;
    private JTextArea txtVacunas;
    private JTextArea txt_Alergias;
    private JTextArea txtMedicamentosActivos;
    private JTextArea txtExamenFisico;
    private JTextArea txtAreaDiagnostico;
    private JButton btnGuardarHistorial;

    public ControladorFrmNuevaConsul(FrmNuevaConsulta ventanaNvConsulta) {
        this.ventanaNvConsulta = ventanaNvConsulta;
        this.txtAntecedentesFarmacologicos = ventanaNvConsulta.getTxtAntecedentesFarmacologicos();
        this.txtAntecedentesClinicosFamiliar = ventanaNvConsulta.getTxtAntecedentesClinicosFamiliar();
        this.txtAntecedentesFarmacologicosFamiliar = ventanaNvConsulta.getTxtAntecedentesFarmacologicosFamiliar();
        this.txtAntecedentesGinecologicosFamiliar = ventanaNvConsulta.getTxtAntecedentesGinecologicosFamiliar();
        this.txtAntecedentesTraumatologicosFamiliar = ventanaNvConsulta.getTxtAntecedentesTraumatologicosFamiliar();
        this.txtParentesco = ventanaNvConsulta.getTxtParentesco();
        this.txtAntecedentesGinecologicos = ventanaNvConsulta.getTxtAntecedentesGinecologicos();
        this.txtAntecedentesTraumatologicos = ventanaNvConsulta.getTxtAntecedentesTraumatologicos();
        this.txtAntecedentes_Clinicos = ventanaNvConsulta.getTxtAntecedentes_Clinicos();
        this.txtCirujias = ventanaNvConsulta.getTxtCirujias();
        this.txtEnfermedades = ventanaNvConsulta.getTxtEnfermedades();
        this.txtVacunas = ventanaNvConsulta.getTxtVacunas();
        this.txt_Alergias = ventanaNvConsulta.getTxt_Alergias();
        this.txtMedicamentosActivos = ventanaNvConsulta.getTxtMedicamentosActivos();
        this.txtExamenFisico = ventanaNvConsulta.getTxtExamenFisico();
        this.txtAreaDiagnostico = ventanaNvConsulta.getTxtAreaDiagnostico();
        this.btnGuardarHistorial = ventanaNvConsulta.getBtnGuardarHistorial();

        // Configurar el ActionListener del botón
        this.btnGuardarHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarDatos();
            }
        });
    }

    private void actualizarDatos() {
        PaginaNuevaConsultaDAO dao = new PaginaNuevaConsultaDAO();
        
        // Crear y actualizar un historial
        Historial historial = new Historial();
        historial.setDescripcionHist(txtAreaDiagnostico.getText());
        historial.setHisEstActivo(true);
        // No se actualizan los IDs ya que no están presentes en el formulario

        // Actualizar el historial
        dao.actualizarHistorial(historial);
        
        // Crear y actualizar antecedentes
        Antecedentes antecedentes = new Antecedentes();
        antecedentes.setFarmacologico(txtAntecedentesFarmacologicos.getText());
        antecedentes.setClinico(txtAntecedentes_Clinicos.getText());
        antecedentes.setGinecologico(txtAntecedentesGinecologicos.getText());
        antecedentes.setTraumatologico(txtAntecedentesTraumatologicos.getText());
        antecedentes.setQuirurgico(txtCirujias.getText());
//        antecedentes.setFarmacologicoFamiliar(txtAntecedentesFarmacologicosFamiliar.getText());
//        antecedentes.setClinicoFamiliar(txtAntecedentesClinicosFamiliar.getText());
//        antecedentes.setGinecologicoFamiliar(txtAntecedentesGinecologicosFamiliar.getText());
//        antecedentes.setTraumatologicoFamiliar(txtAntecedentesTraumatologicosFamiliar.getText());
        antecedentes.setAlergias(txt_Alergias.getText());
        antecedentes.setEnfermedades(txtEnfermedades.getText());
        antecedentes.setCirugias(txtCirujias.getText());
        antecedentes.setVacunas(txtVacunas.getText());
        
        // Actualizar antecedentes
        dao.actualizarAntecedentes(antecedentes);

        // Crear y actualizar un familiar
        Familiar familiar = new Familiar();
        familiar.setParentesco(txtParentesco.getText());
        // No se actualizan los IDs ya que no están presentes en el formulario

        // Actualizar familiar
        dao.actualizarFamiliar(familiar);
    }
    
    public void recibirDatosPaciente(Paciente paciente) {
//        ventanaNvConsulta.getLblEdad().setText(String.valueOf(paciente.getEdad()));
//        ventanaNvConsulta.getLblEmail().setText(paciente.getEmail());
//        ventanaNvConsulta.getLblFecha_Actual().setText(new java.util.Date().toString());
//        ventanaNvConsulta.getLblFecha_Nacimiento().setText(paciente.getFechaNacimiento().toString());
//        ventanaNvConsulta.getLblNombre().setText(paciente.getNombre() + " " + paciente.getApellido());
//        ventanaNvConsulta.getLblNumeroCel().setText(paciente.getTelefono());
//        ventanaNvConsulta.getLblPadecimiento().setText(""); // Aquí puede agregar un getter para padecimiento si es necesario
//        ventanaNvConsulta.getLblSexo().setText(paciente.getGenero());
    }
}

    
    

