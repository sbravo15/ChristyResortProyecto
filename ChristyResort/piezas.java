/*
 * Login valida el Username y la contraseña 
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */

package ChristyResortProyecto;

public class piezas {
   
    private String nombre;
    private int num_camas;
    private String tipo_cama;
    private String interfaz;
    private int num_personas;
    private String adicionales;
    private int monto;

    public piezas(String nombre, int num_camas, String tipo_cama, String interfaz, int num_personas, String adicionales, int monto) {
        this.nombre = nombre;
        this.num_camas = num_camas;
        this.tipo_cama = tipo_cama;
        this.interfaz = interfaz;
        this.num_personas = num_personas;
        this.adicionales = adicionales;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "nombre=" + nombre + ", num_camas=" + num_camas + ", tipo_cama=" + tipo_cama + ", interfaz=" + interfaz + ", num_personas=" + num_personas + ", adcionales=" + adicionales + ", monto=" + monto + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_camas() {
        return num_camas;
    }

    public void setNum_camas(int num_camas) {
        this.num_camas = num_camas;
    }

    public String getTipo_cama() {
        return tipo_cama;
    }

    public void setTipo_cama(String tipo_cama) {
        this.tipo_cama = tipo_cama;
    }

    public String getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    public String getAdcionales() {
        return adicionales;
    }

    public void setAdcionales(String adcionales) {
        this.adicionales = adcionales;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
}
