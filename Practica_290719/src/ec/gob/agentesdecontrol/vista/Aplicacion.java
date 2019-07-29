//Clase principal
package ec.gob.agentesdecontrol.vista;

import ec.gob.agentesdecontrol.controlador.Controlador;

public class Aplicacion {
    public static void main (String[] arg){
        //llamamos al menu de controlador
        
        Controlador controlador =new Controlador ();
        controlador.menu();
        
    }
}
