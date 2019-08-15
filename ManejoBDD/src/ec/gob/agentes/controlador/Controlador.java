package ec.gob.agentes.controlador;

import com.mysql.jdbc.PreparedStatement;
import ec.gob.agentes.vista.AplicacionConexion;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {

    AplicacionConexion AplicacionConexion = new AplicacionConexion(this);
    String rotulos[] = new String[]{"id", "pROVICNIA", "REGION"};
    DefaultTableModel dtm = new DefaultTableModel(null, rotulos) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public Controlador() {
        AplicacionConexion.btSalir.addActionListener(this);
        AplicacionConexion.btAsignar.addActionListener(this);
        AplicacionConexion.btConsultar.addActionListener(this);
        AplicacionConexion.btEliminar.addActionListener(this);
        AplicacionConexion.btIngresar.addActionListener(this);
        AplicacionConexion.btModificar.addActionListener(this);
    }

    public void showAplicacionConexion() {
        AplicacionConexion.setVisible(true);
        AplicacionConexion.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    public void consultarDatos() {
        try {
            String url = "jdbc:mysql://localhost:3306/dbcmiac";
            String user = "root";
            String pass = "";
            JOptionPane.showMessageDialog(null, "Conectando..........");
            Connection conexion = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conectado!!");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM provincia");
            while (rs.next()) {
                System.out.println("id Provincia: " + rs.getString("idProvincia")
                        + "  nombre Provincia: " + rs.getString("nombreProvincia")
                        + "  region: " + rs.getString("region"));
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void clickdatosDBB(java.awt.event.MouseEvent evt) {
        int fila;
        fila = AplicacionConexion.tblDatos.rowAtPoint(evt.getPoint());
        if (fila > -1) {
            AplicacionConexion.txtIdProv.setText(String.valueOf(AplicacionConexion.tblDatos.getValueAt(fila, 0)));
            AplicacionConexion.txtNomProv.setText(String.valueOf(AplicacionConexion.tblDatos.getValueAt(fila, 1)));
            AplicacionConexion.cbRegion.setSelectedItem(String.valueOf(AplicacionConexion.tblDatos.getValueAt(fila, 2)));
        }
    }

    
    public void cargarbtCanton() {

        try {
            String url = "jdbc:mysql://localhost:3306/dbcmiac";
            String user = "root";
            String pass = "";

            Connection conexion = DriverManager.getConnection(url, user, pass);
            AplicacionConexion.cbCanton.removeAllItems();

            //JOptionPane.showMessageDialog(null, "Conectado!!");
            Statement st = conexion.createStatement();
            //        ResultSet rs = st.executeQuery("SELECT * FROM provincia,canton where canton.idProvincia=provincia.idProvincia and canton.idProvincia='"+ txtIdProv.getText()+"'");
            ResultSet rs = st.executeQuery("CALL consultarCantonidProvincia('" + Integer.parseInt(AplicacionConexion.txtIdProv.getText()) + "')");

            while (rs.next()) {

                AplicacionConexion.cbCanton.addItem(rs.getString("nombreCanton"));
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    public void limpiartblDatos() {
        int a = AplicacionConexion.tblDatos.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            dtm.removeRow(dtm.getRowCount() - 1);
        }
    }

    public void ingresarDatos() {
        try {
            String url = "jdbc:mysql://localhost:3306/dbcmiac";
            String user = "root";
            String pass = "";
            JOptionPane.showMessageDialog(null, "Conectando..........");
            Connection conexion = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conectado!!");

            String n = AplicacionConexion.txtNomProv.getText();
            String r = AplicacionConexion.cbRegion.getSelectedItem().toString();
            int i = Integer.parseInt(AplicacionConexion.txtIdProv.getText());
            

            PreparedStatement enrollItmt;
            enrollItmt = (PreparedStatement) conexion.prepareStatement("INSERT INTO dbcmiac.provincia (idProvincia, nombreProvincia, region) VALUES ('" + i + "', '" + n + "', '" + r + "')");
            JOptionPane.showMessageDialog(null, "Datos Ingresados!!");
            enrollItmt.execute();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void asignarTabla() {

        AplicacionConexion.tblDatos.setModel(dtm);

        try {
            String url = "jdbc:mysql://localhost:3306/dbcmiac";
            String user = "root";
            String pass = "";
            Connection conexion = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conectado!!");

            limpiartblDatos();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM provincia");

            dtm.setColumnIdentifiers(rotulos);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("idProvincia"), rs.getString("nombreProvincia"), rs.getString("region")});

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void eliminar(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AplicacionConexion.btSalir) {
            System.exit(0);
        } else {
            if (e.getSource() == AplicacionConexion.btAsignar) {
                asignarTabla();
            } else {
                if (e.getSource() == AplicacionConexion.btEliminar) {
                    JOptionPane.showMessageDialog(null, "Eliminar");
                } else {
                    if (e.getSource() == AplicacionConexion.btConsultar) {
                        consultarDatos();
                    } else {
                        if (e.getSource() == AplicacionConexion.btIngresar) {

                            ingresarDatos();
                        } else {
                            if (e.getSource() == AplicacionConexion.btModificar) {

                            }

                        }

                    }
                }
            }

        }
    }

//public void aparece(){
//    
//int fila;
//        fila = AplicacionConexion.tblDatos.rowAtPoint (evt.getPoint());
//if (fila >-1){
//    AplicacionConexion.txtIdProv.setText(String.valueOf(AplicacionConexion.tblDatos.getValueAt(fila, 0)));
//    AplicacionConexion.txtNomProv.setText(String.valueOf(AplicacionConexion.tblDatos.getValueAt(fila, 0)));
//    
//        
//}       
//
//
}
