package ec.gob.cuerpoagentes.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] arg) {
        String nombre = " ";
        int conf = 0;
        ArrayList<String> listaNombres = new ArrayList<>();

        do {
            nombre = JOptionPane.showInputDialog("INgresa tud datos").toUpperCase();
            listaNombres.add(nombre);
            conf = (JOptionPane.showConfirmDialog(null, "Deseas continuar"));

        } while (conf == 0);

        for (int i = 0; i < listaNombres.size(); i++) {

            // solo nombres con s    if (listaNombres.get(i).charAt(0) == 'S' || listaNombres.get(i).charAt(0) == 's') {
                
                JOptionPane.showMessageDialog(null, listaNombres.get(i));
            }
        }
    }

}
