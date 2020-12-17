/*
 * Paquetes de Turismo y de Alimentacion 
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */

package ChristyResortProyecto;

public class Paquetes {
    private String nombre_paquete;
    private String descripcion_paquete;
    private int monto_paquete;
    
   public static Paquetes paquete1 = new Paquetes("Turismo", "Escoja su Paquete de Tour", 25000);
   public static Paquetes paquete2 = new Paquetes("Comida", "Escoja su paquete de Alimentación", 15000);

    
    public Paquetes(String nombre_paquete, String descripcion_paquete, int monto_paquete) {
        this.nombre_paquete = nombre_paquete;
        this.descripcion_paquete = descripcion_paquete;
        this.monto_paquete = monto_paquete;
    }
    public Paquetes(){
    }

    public String getNombre_paquete() {
        return nombre_paquete;
    }

    public void setNombre_paquete(String nombre_paquete) {
        this.nombre_paquete = nombre_paquete;
    }

    public String getDescripcion_paquete() {
        return descripcion_paquete;
    }

    public void setDescripcion_paquete(String descripcion_paquete) {
        this.descripcion_paquete = descripcion_paquete;
    }

    public int getMonto_paquete() {
        return monto_paquete;
    }

    public void setMonto_paquete(int monto_paquete) {
        this.monto_paquete = monto_paquete;
    }

    public static Paquetes getPaquete1() {
        return paquete1;
    }

    public static void setPaquete1(Paquetes paquete1) {
        Paquetes.paquete1 = paquete1;
    }

    public static Paquetes getPaquete2() {
        return paquete2;
    }

    public static void setPaquete2(Paquetes paquete2) {
        Paquetes.paquete2 = paquete2;
    }
    

    @Override
    public String toString() {
        return "Paquetes{" + "nombre_paquete=" + nombre_paquete + ", descripcion_paquete=" + descripcion_paquete + ", monto_paquete=" + monto_paquete + '}';
    }

    
}

