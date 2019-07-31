package ec.gob.cuerpoagentes.controlador;

import ec.gob.cuerpoagentes.modelo.Persona;
import ec.gob.cuerpoagentes.vista.FrmAdministrador;
import ec.gob.cuerpoagentes.vista.FrmLogin;
import ec.gob.cuerpoagentes.vista.JPConsultaAgente;
import ec.gob.cuerpoagentes.vista.JPIngresoAgente;
import ec.gob.cuerpoagentes.vista.JPModificarAgente;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controlador {

    FrmLogin frmLogin = new FrmLogin(this);
    FrmAdministrador frmAdministrador = new FrmAdministrador(this);
    JPIngresoAgente jPIngresoAgente = new JPIngresoAgente(this);
    JPConsultaAgente jPConsultaAgente = new JPConsultaAgente(this);
    JPModificarAgente jPModificarAgente = new JPModificarAgente(this);
    ArrayList<Persona> listaPersonas = new ArrayList<>();

    public void llenarArrayList(String ced, String nom1, String nom2, String ape1, String ape2, String dir, String tfono, String mail, String prof, Date fecNac) {
        listaPersonas.add(new Persona(ced, nom1, nom2, ape1, ape2, dir, tfono, mail, prof, fecNac));

    }

    public String imprimir() {
        return listaPersonas.toString();

    }

    
            
    public boolean validarMail(String mail) {
        Pattern p = Pattern.compile("@");
        Matcher m = p.matcher(mail);
        return m.find();

    }

    public void showJPModificarAgente() {
        jPModificarAgente.setSize(500, 500);
        frmAdministrador.escritorio.removeAll();
        frmAdministrador.escritorio.add(jPModificarAgente);
        jPModificarAgente.setVisible(true);
        frmAdministrador.escritorio.validate();

    }

    public void showJPConsultaAgente() {
        //jPConsultaAgente.setSize(600, 600);
        jPConsultaAgente.setSize(jPConsultaAgente.getMaximumSize());
        frmAdministrador.escritorio.removeAll();
        frmAdministrador.escritorio.add(jPConsultaAgente);
        jPConsultaAgente.setVisible(true);
        frmAdministrador.escritorio.validate();
    }

    public void showLogin() {
        frmLogin.setVisible(true);
    }

    public void showAdministrador() {
        frmAdministrador.setVisible(true);
    }

    public void showJPIngresoAgente() {
        frmAdministrador.escritorio.removeAll();
        //jPIngresoAgente.setSize(900, 800);
        jPIngresoAgente.setSize(jPIngresoAgente.getMaximumSize());
        frmAdministrador.escritorio.add(jPIngresoAgente);
        jPIngresoAgente.setVisible(true);
        frmAdministrador.escritorio.repaint();
        frmAdministrador.escritorio.validate();

    }

}
