package ec.gob.cuerpoagentes.controlador;

import ec.gob.cuerpoagentes.modelo.Persona;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controlador {

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    public void llenarArrayList(String ced, String nom1, String nom2, String ape1, String ape2, String dir, String tfono, String mail, String prof, Date fecNac) {
        listaPersonas.add(new Persona(ced, nom1, nom2, ape1, ape2, dir, tfono, mail, prof, fecNac));

    }

    public String imprimir() {
        return listaPersonas.toString();

    }

        public boolean validarMail(String mail){
        Pattern p=Pattern.compile("@");
        Matcher m=p.matcher(mail);
        return m.find();
        
    }

    }
