package ec.gob.agentesdecontrol.modelo;



//clase
public class Punto {

//atributos
    private int x;
    private int y;

//asignaciones    
    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    //colocar una instancia en una cadena de caracteres
    @Override
    public String toString(){
        //para mostrar p(x,y)x de set y y de get
        return "P ("+getX()+","+getY()+")";
        
    }
    
}
