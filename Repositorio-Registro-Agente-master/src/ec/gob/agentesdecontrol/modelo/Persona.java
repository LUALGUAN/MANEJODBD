/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.agentesdecontrol.modelo;

import java.util.Date;

/**
 *
 * @author pc-pc1
 */
public class Persona {
    
    private String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private Date fecnacimiento;

    public Persona() {
    }

    public Persona(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fecnacimiento) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecnacimiento = fecnacimiento;
    }

    public Date getFecnacimiento() {
        return fecnacimiento;
    }

    public void setFecnacimiento(Date fecnacimiento) {
        this.fecnacimiento = fecnacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    
}

