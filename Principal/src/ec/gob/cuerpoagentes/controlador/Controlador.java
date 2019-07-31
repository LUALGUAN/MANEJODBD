package ec.gob.cuerpoagentes.controlador;

import ec.gob.cuerpoagentes.vista.*;


public class Controlador {

    FrmLogin frmLogin = new FrmLogin(this);
    FrmAdministrador frmAdministrador = new FrmAdministrador(this);
    JPIngresoAgente jPIngresoAgente = new JPIngresoAgente(this);
    JPConsultaAgente jPConsultaAgente = new JPConsultaAgente(this);
    JPModificarAgente jPModificarAgente = new JPModificarAgente(this);

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
        jPIngresoAgente.setSize(500, 300);
        frmAdministrador.escritorio.add(jPIngresoAgente);
        jPIngresoAgente.setVisible(true);
        frmAdministrador.escritorio.validate();

    }

}
