package ec.gob.cuerpoagentes.vista;

import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] arg) {
        String nombre = JOptionPane.showInputDialog("Ingresa tus datos");
        
        String[] sep = nombre.split("\\s");
        for (int i = 0; i < sep.length; i++) {
            System.out.println(sep[i]);
        }
        String n1="Nombre: "+sep[0];
        String ap1="Apellido 1: "+sep[1];
        JOptionPane.showMessageDialog(null,n1+"\n"+ ap1);
        
    }

}
