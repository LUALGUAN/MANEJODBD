package ec.gob.agentesdecontrol.controlador;

import ec.gob.agentesdecontrol.modelo.Persona;
import ec.gob.agentesdecontrol.vista.FrmAplicacionRegistro;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {

    ArrayList<Persona> listaPersona = new ArrayList<>();
    FrmAplicacionRegistro frmAplicacionRegistro = new FrmAplicacionRegistro(this);
    //DefaultTableModel dtm = new DefaultTableModel();

    String rotulos[] = new String[]{"cedula", "nombre1", "nombre2", "apellido1", "apellido2", "fechaNacimiento"};

    DefaultTableModel dtm = new DefaultTableModel(null, rotulos) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public void agregarListaPersona() {
        Persona p = new Persona();
        p.setCedula(frmAplicacionRegistro.txtCedula.getText());
        p.setNombre1(frmAplicacionRegistro.txtNombre1.getText());
        p.setNombre2(frmAplicacionRegistro.txtNombre2.getText());
        p.setApellido1(frmAplicacionRegistro.txtApelllido1.getText());
        p.setApellido2(frmAplicacionRegistro.txtApellido2.getText());
        p.setFecnacimiento(frmAplicacionRegistro.jdcFecha.getDate());
        listaPersona.add(p);
        limpiar();

    }

    public Date fechaActual() {
        Date date = new Date();
        return date;
    }

    public void limpiar() {
        frmAplicacionRegistro.txtCedula.setText("");
        frmAplicacionRegistro.txtNombre1.setText("");
        frmAplicacionRegistro.txtNombre2.setText("");
        frmAplicacionRegistro.txtApelllido1.setText("");
        frmAplicacionRegistro.txtApellido2.setText("");
        frmAplicacionRegistro.jdcFecha.setDate(fechaActual());
    }

    public Controlador() {
        dtm.setColumnIdentifiers(rotulos);
        frmAplicacionRegistro.tblDatos.setModel(dtm);
        frmAplicacionRegistro.btSalir.addActionListener(this);
        frmAplicacionRegistro.btIngresar.addActionListener(this);
        frmAplicacionRegistro.btEditar.addActionListener(this);
        frmAplicacionRegistro.btEliminar.addActionListener(this);
    }

    public void llenarTabla() {
        int i = listaPersona.size() - 1;
        String arr[] = {listaPersona.get(i).getCedula(),
            listaPersona.get(i).getNombre1(),
            listaPersona.get(i).getNombre2(),
            listaPersona.get(i).getApellido1(),
            listaPersona.get(i).getApellido2(),
            listaPersona.get(i).getFecnacimiento().toString()};
        dtm.addRow(arr);
        frmAplicacionRegistro.tblDatos.setModel(dtm);

    }

    public void showFrmAplicacionRegistro() {
        frmAplicacionRegistro.setVisible(true);
        frmAplicacionRegistro.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmAplicacionRegistro.btSalir) {
            System.exit(0);
        } else {
            if (e.getSource() == frmAplicacionRegistro.btIngresar) {
                agregarListaPersona();
                llenarTabla();

            } else {
                if (e.getSource() == frmAplicacionRegistro.btEliminar) {
                    JOptionPane.showMessageDialog(null, "Eliminar");
                } else {
                    if (e.getSource() == frmAplicacionRegistro.btEditar) {
                        JOptionPane.showMessageDialog(null, "Editar");
                    }
                }
            }
        }
    }

    public void mostrarDatos() {
        for (Persona iterad : listaPersona) {
            JOptionPane.showMessageDialog(null, iterad.getApellido1());
        }
    }

}
