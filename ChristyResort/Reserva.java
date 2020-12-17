/*
 * Reserva Set y Get (piezas, fechaInicio, fechaFinal, valor) 
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */
package ChristyResortProyecto;

import java.util.Date;
import java.util.List;

public class Reserva {

    private piezas piezas;
    private String fechaInicio;
    private String fechaFinal;
    private int valor;

    @Override
    public String toString() {
        return "Reserva{" + "habitaciones=" +piezas + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", valor=" + valor + '}';
    }
    
    public Reserva(piezas piezas, String fechaInicio, String fechaFinal, int valor) {
        this.piezas = piezas;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.valor = valor;
    }

    public Reserva() {
    }

    public piezas getPieza() {
        return piezas;
    }

    public void setPieza(piezas pieza) {
        this.piezas = piezas;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
       
}
