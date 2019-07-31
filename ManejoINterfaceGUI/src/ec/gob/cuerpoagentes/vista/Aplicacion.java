package ec.gob.cuerpoagentes.vista;


import ec.gob.cuerpoagentes.controlador.Controlador;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] arg) {
//Pattern patron = Pattern.compile("@");
//Matcher matcher =patron.matcher(JOptionPane.showInputDialog("ingre corre"));
//matcher.find();
//matcher.start();


        Controlador controlador=new Controlador();
        controlador.showLogin();
    }
}