package ec.gob.agentesdecontrol.controlador;

import ec.gob.agentesdecontrol.modelo.Punto;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Controlador {
//declaramos afuera para que conozcan toods los metodos

    Punto p;
    ArrayList<Punto> listaPuntos = new ArrayList<Punto>();

//crear metodo
    public void menu() {
        // todos tiene conocimiento de op
        int op = 0;
        String opcionesMenu = "1.- Punto\n"
                + "2.- Recta\n"
                + "3.- Poligono\n"
                + "4.- Ovalo\n"
                + "5.- Salir";
// hacemos un casting y paraevitar el error utilizamos try
        do {
            try {

                op = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenu));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
// para las opciones de menu
            switch (op) {
                case 1:
                    menuPunto();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    //JOptionpane.showMessageDialog
                    break;
            }
        } while (op != 5);

    }

    public void menuPunto() {
        int op = 0;

        String menu = "1.- Crear Punto\n"
                + "2.- ModificarPunto\n"
                + "3.- Elimnar Punto\n"
                + "4.- Imprimir\n"
                + "5.- Salir";
        do {
            try {

                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            switch (op) {
                case 1:
                    crearPunto();

                    break;
               case 2:
                    modificar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, imprimir());

                    break;
            }
        } while (op != 5);
    }

    public void eliminar() {
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(imprimir())) - 1;
            listaPuntos.remove(op);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void crearPunto() {

        /* el array tambien puede ir aqui pero asi 
            listaPuntos.add(new Punto()); pero aqui nos toca modificar todo
         */
        p = new Punto();
        try {
            p.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingresa x")));
            p.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingresa y")));
            listaPuntos.add(p);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(p.toString());

    }

    public String imprimir() {
        //acumulador         String acumulador = " ";

        // for (int i = 0; i < listaPuntos.size(); i++) {
//            acumulador += listaPuntos.get(i);
        //System.out.println(listaPuntos.get(i));
        //      }
        return listaPuntos.toString();

    }

    public void modificar() {
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(imprimir())) - 1;
            listaPuntos.get(op).setX(Integer.parseInt(JOptionPane.showInputDialog("Reingrese x")));
            listaPuntos.get(op).setY(Integer.parseInt(JOptionPane.showInputDialog("Reingrese y")));
        } catch (Exception e) {
            System.out.println(e.getMessage ());
            
    

}
    }
}
