package ec.gob.cuerpoagentes.modelo;

import java.util.Date;

public class Persona {

    private String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String estcivil;
    private String genero;
    private String direccion;
    private String telefono;
    private String mail;
    private String profesion;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String ced, String nom1, String nom2, String ape1, String ape2, String dir, String tfono, String mail, String prof, Date fecNac) {
        this.cedula = ced;
        this.nombre1 = nom1;
        this.nombre2 = nom2;
        this.apellido1 = ape1;
        this.apellido2 = ape2;
        this.direccion = dir;
        this.telefono = tfono;
        this.mail = mail;
        this.profesion = prof;
        this.fechaNacimiento = fecNac;

    }

    @Override
    public String toString() {
        return getCedula() + "\n"
                + getNombre1() + "\n"
                + getNombre2() + "\n"
                + getApellido1() + "\n"
                + getApellido2() + "\n"
                + getDireccion() + "\n"
                + getTelefono() + "\n"
                + getMail() + "\n"
                + getProfesion() + "\n"
                + getFechaNacimiento().toString() + "\n";
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * @param nombre1 the nombre1 to set
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * @return the nombre2
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * @param nombre2 the nombre2 to set
     */
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

        /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
